package net.file;

import java.net.URL;
import java.net.URLConnection;
import java.util.zip.*;
import java.io.*;

import javax.swing.JOptionPane;

import com.client;

import net.signlink.signlink;

public class FileDownloader {

	
	private static final int BUFFER_SIZE = 1024;
	public static final String VERSION_URL = "http://beastps.com/client/cacheVersion.txt";
	public static final String VERSION_FILE = signlink.findcachedir()+"cacheVersion.dat";
	client frame;
	
	public enum FileType {
		
		CACHE(signlink.findcachedir(), "https://dl.dropbox.com/s/tjjt05wuv6r8t6r/BeastPs1.5.zip", 2);

		private String url;
		private int version;
		private String directory;

		FileType(String directory, String url, int version) {
			this.directory = directory;
			this.url = url;
			this.version = version;
		}

		public int getVersion() {
			return version;
		}

		public String getURL() {
			return url;
		}

		public String getDirectory() {
			return directory;
		}

		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}
	
	private static void deleteZIP(String fileName, FileType type) {
		// A File object to represent the filename
		File f = new File(type.getDirectory(), fileName);

		// Make sure the file or directory exists and isn't write protected
		if (!f.exists()) {
			throw new IllegalArgumentException("Delete: no such file or directory: " + fileName);
		}

		if (!f.canWrite()) {
			throw new IllegalArgumentException("Delete: write protected: " + fileName);
		}

		// If it is a directory, make sure it is empty
		if (f.isDirectory()) {
			String[] files = f.list();

			if (files.length > 0) {
				throw new IllegalArgumentException("Delete: directory not empty: " + fileName);
			}
		}

		// Attempt to delete it
		boolean success = f.delete();

		if (!success) {
			throw new IllegalArgumentException("Delete: deletion failed");
		}
	}
	
	private static void downloadFile(client client, FileType type, String localFileName) {
		try {
			URL url = new URL(type.getURL());
			URLConnection conn = url.openConnection();
			try (OutputStream out = new BufferedOutputStream(new FileOutputStream(type.getDirectory() + "/" + localFileName)); InputStream in = conn.getInputStream()) {
				byte[] data = new byte[BUFFER_SIZE];
				int numRead;
				long numWritten = 0;
				long start = System.nanoTime();
				final double NANOS_PER_SECOND = 1000000000.0;
				final double BYTES_PER_MIB = 1024;
				int length = conn.getContentLength();
				while ((numRead = in.read(data)) != -1) {
					out.write(data, 0, numRead);
					numWritten += numRead;
					double speed = Math.round(((NANOS_PER_SECOND / BYTES_PER_MIB) * numWritten) / ((System.nanoTime() - start) + 1));
					int percentage = (int) (((double) numWritten / (double) length) * 100D);
					int totalLength = length / 1024;
					int totalReceived = (int) (numWritten / 1024);
					client.drawLoadingText(percentage == 100 ? 101 : percentage, "Downloading " + type.toString() + " @ " + Math.round(speed) + " kb/s" + " " + totalReceived + "/" + totalLength + "kb");
				}

				client.drawLoadingText(101, "Downloaded " + type.toString() + ", unzipping.");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private static String getArchivedName(FileType type) {
		int lastSlashIndex = type.getURL().lastIndexOf('/');

		if ((lastSlashIndex >= 0) && (lastSlashIndex < (type.getURL().length() - 1))) {
			return type.getURL().substring(lastSlashIndex + 1);
		} else {
		}

		return "";
	}

	/**
	 * Starts the unzipping process
	 * 
	 * @param zin
	 * @param s
	 * @throws IOException
	 */
	private static void unzip(ZipInputStream zin, String s) throws IOException {
		try (FileOutputStream out = new FileOutputStream(s)) {
			byte[] buf = new byte[BUFFER_SIZE];
			int len = 0;

			while ((len = zin.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
		}
	}

	/**
	 * Attempts to unzip the archive
	 * 
	 * @param type
	 */
	private static void unZip(FileType type) {
		String archive = type.getDirectory() + File.separator + getArchivedName(type);
		try (ZipInputStream zin = new ZipInputStream(new BufferedInputStream(new FileInputStream(archive)))) {
			ZipEntry e;
			while ((e = zin.getNextEntry()) != null) {
				if (e.isDirectory()) {
					(new File(type.getDirectory() + File.separator + e.getName())).mkdir();
				} else {
					if (e.getName().equals(archive)) {
						unzip(zin, archive);
						break;
					}

					unzip(zin, type.getDirectory() + File.separator + e.getName());
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
    public FileDownloader(client client) {
    }
		
	
	public static double getCurrentVersion(){
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(VERSION_FILE)));
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			return 0.1;
		}
	}
	
	public static double getNewestVersion(){
		try {
			URL tmp = new URL(VERSION_URL);
			BufferedReader br = new BufferedReader(new InputStreamReader(tmp.openStream()));
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			handleException(e);
			return -1;
		}
	}
	
	private static void handleException(Exception e){
		StringBuilder strBuff = new StringBuilder();
		strBuff.append("Please Screenshot this message, and send it to an admin!\r\n\r\n");
        strBuff.append(e.getClass().getName()).append(" \"").append(e.getMessage()).append("\"\r\n");
		for(StackTraceElement s : e.getStackTrace())
			strBuff.append(s.toString()).append("\r\n");
		alert("Exception [" + e.getClass().getSimpleName() + "]",strBuff.toString(),true);
	}
	
	private static void alert(String title,String msg,boolean error){
		JOptionPane.showMessageDialog(null,
			   msg,
			   title,
			    (error ? JOptionPane.ERROR_MESSAGE : JOptionPane.PLAIN_MESSAGE));
	}
	
	private static void alert(String msg){
		alert("Message", msg, false);
	}
	
	public static void start(client client, FileType type) {
		try {
			double newest = getNewestVersion();
			if (newest > getCurrentVersion()) {
				downloadFile(client, type, getArchivedName(type));
				unZip(type);
				deleteZIP(getArchivedName(type), type);
				@SuppressWarnings("resource")
				OutputStream out = new FileOutputStream(VERSION_FILE);
				alert("Cache has been updated, please restart the client!");
				out.write(String.valueOf(newest).getBytes());;
				System.exit(0);
			}
		} catch (Exception e) {
			handleException(e);
		}
	}
	
}
