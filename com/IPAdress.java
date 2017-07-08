package com;


import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class IPAdress
{

    public IPAdress()
    {
    }

    @SuppressWarnings("rawtypes")
	public void getInterfaces()
    {
        try
        {
            totalMac = 0;
            for(Enumeration e = NetworkInterface.getNetworkInterfaces(); e.hasMoreElements();)
            {
                NetworkInterface ni = (NetworkInterface)e.nextElement();
                Enumeration e2 = ni.getInetAddresses();
                while(e2.hasMoreElements()) 
                {
                    InetAddress ip = (InetAddress)e2.nextElement();
                    String ipD = ip.toString();
                    if(ipD.length() > 20)
                        macAdress[totalMac++] = ipD;
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void getIP()
    {
        IPAdress ip = new IPAdress();
        ip.getInterfaces();
    }

    public static String macAdress[] = new String[20];
    public static int totalMac = 0;

}
