package com;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EntityDef.java



public final class EntityDef
{

    public static EntityDef forID(int i)
    {
        for(int j = 0; j < 20; j++)
            if(cache[j].type == (long)i)
                return cache[j];

        anInt56 = (anInt56 + 1) % 20;
        EntityDef entityDef = cache[anInt56] = new EntityDef();
        stream.currentOffset = streamIndices[i];
        entityDef.type = i;
        entityDef.readValues(stream);
		        if(i == 4677) {
     		entityDef.itemActions = new String[5];
     		entityDef.itemActions[1] = "Attack";
     		entityDef.name = "Elvarg";
     		entityDef.combatLevel = 150;
     	}
		int myass = 4247;
		if (i == myass) {
                entityDef.name = "Construction Manager";
	        entityDef.description = "Pandemic's Official Construction Seller!".getBytes();
		entityDef.itemActions[2] = "Visit House";
                entityDef.itemActions[3] = "Buy Skillcape";
		}
        if(i == 4442) {
     		entityDef.itemActions = new String[5];
     		entityDef.itemActions[1] = "Attack";
     		entityDef.anIntArray94 = new int[2];
     		entityDef.anIntArray94[0] = 70782;
     		entityDef.anIntArray94[1] = 70782;
     		entityDef.aByte68 = 1;
     		entityDef.anInt91 = 130;
     		entityDef.anInt86 = 130;
     		entityDef.name = "Pikachu";
	entityDef.description = "Ash's little partner!".getBytes();
     		entityDef.combatLevel = 121;
     	}
		if (i == 549) {
        	entityDef.name = "PvP Store";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Armoury";
			entityDef.itemActions[2] = "Weaponry";
		}
		if (i == 1375) {
        	entityDef.name = "@red@Regular Gambler";
        	entityDef.description = "Choose the Regular Gambler Mode here!".getBytes();
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Choose Regular Mode";
		}
		if (i == 1376) {
        	entityDef.name = "@red@Iron Gambler";
        	entityDef.description = "Choose the Iron Gambler Mode here!".getBytes();
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Choose Iron Gambler Mode";
		}
		if (i == 1377) {
        	entityDef.name = "@red@Hardcore Iron Gambler";
        	entityDef.description = "Choose the Hardcore Iron Gambler Mode here!".getBytes();
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Choose Hardcore Iron Gambler Mode";
		}
		if (i == 1378) {
        	entityDef.name = "@red@Iron Gambler Store";
        	entityDef.description = "A store special designed for Iron Gambler mode!".getBytes();
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Trade";
		}
		if (i == 46) {
        	entityDef.name = "Megaman";
        	entityDef.anIntArray94 = new int[]{75105};
        	entityDef.itemActions = new String[5];
        	entityDef.itemActions[1] = "Attack";
        	entityDef.combatLevel = 200;
                }
		if (i == 1219) {
        	entityDef.name = "Blood-Sucking Leech";
     		entityDef.combatLevel = 195;
		}
		if (i == 1172) {
        	entityDef.name = "Aslan";
        	entityDef.description = "He has many followers, including humans!".getBytes();
     		entityDef.combatLevel = 2005;
		}
		if (i == 1164) {
        	entityDef.name = "Loyalty Rewarder";
        	entityDef.description = "To reward only the true loyal players of Pandemic!".getBytes();
		}
		if (i == 811) {
        	entityDef.name = "Vote Store";
        	entityDef.description = "To reward the ones that voted!".getBytes();
		}
		if (i == 659) {
        	entityDef.name = "Donator Store";
        	entityDef.description = "Sells only the best featured items in-game".getBytes();
		}
		if (i == 4456) {
        	entityDef.name = "MiniBoss Keeper";
		}
		if (i == 1615) {
		entityDef.description = "The keeper of the magical Abyssal Tentacle.".getBytes();
		entityDef.anInt86 = 190;
		entityDef.anInt91 = 190;
		}
		if (i == 3622) {
        	entityDef.name = "Frost boss";
		}
		if (i == 5287) {
        	entityDef.name = "Old Ice-builder";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Talk";
		}
		if (i == 10040) {
        	entityDef.name = "@red@undead one";
		}//34131

		if (i == 4020) {
		entityDef.name = "Mini Toktz-Jad";
		entityDef.description = "The smaller version of the mighty Toktz-Jad.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 34131;
		entityDef.combatLevel = 276;
		entityDef.standAnim = 9274;
		entityDef.walkAnim = 9273;
		entityDef.anInt86 = 30;
		entityDef.anInt91 = 30;
		}
		if (i == 4000) {
		entityDef.name = "King Black Dragon";
		entityDef.description = "The smaller version of King Black Dragon.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[4];
		entityDef.anIntArray94[0] = 17414;
		entityDef.anIntArray94[1] = 17415;
		entityDef.anIntArray94[2] = 17429;
		entityDef.anIntArray94[3] = 17422;
		entityDef.combatLevel = 276;
		entityDef.standAnim = 90;
		entityDef.walkAnim = 4635; // walk
		entityDef.anInt86 = 65;
		entityDef.anInt91 = 65;
		}

		if (i == 4001) {
		entityDef.name = "General Graardor";
		entityDef.description = "The smaller version of General Graardor.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 27785;
		entityDef.anIntArray94[1] = 27789;
		entityDef.combatLevel = 624;
		entityDef.standAnim = 7059;
		entityDef.walkAnim = 7058; // walk
		entityDef.anInt86 = 60;
		entityDef.anInt91 = 60;
		}

		if (i == 4002) {
		entityDef.name = "Chaos Elemental";
		entityDef.description = "The smaller version of Chaos Elemental.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 11216;
		entityDef.combatLevel = 305;
		entityDef.standAnim = 3144;
		entityDef.walkAnim = 3145; // walk
		entityDef.anInt86 = 65;
		entityDef.anInt91 = 65;
		}

		if (i == 4003) {
		entityDef.name = "Kree Arra";
		entityDef.description = "The smaller version of Kree Arra.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 28003;
		entityDef.anIntArray94[1] = 28004;
		entityDef.combatLevel = 580;
		entityDef.standAnim = 6972;
		entityDef.walkAnim = 6973; // walk
		entityDef.anInt86 = 52;
		entityDef.anInt91 = 52;
		}
		
		if(i == 4004) { // Change it.
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack"; 
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 40955;
		entityDef.standAnim = 10056;
		entityDef.walkAnim = 10055; // walk
		entityDef.combatLevel = 785;
		entityDef.anInt86 = 45;
		entityDef.anInt91 = 45;
		entityDef.name = "Corporeal beast";
		entityDef.description = "The smaller version of the mighty Corporeal Beast.".getBytes();
		}

		if (i == 4005) {
		entityDef.name = "K'ril Tsutsaroth";
		entityDef.description = "The smaller version of K'ril Trutsaroth.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[5];
		entityDef.anIntArray94[0] = 27768;
		entityDef.anIntArray94[1] = 27773;
		entityDef.anIntArray94[2] = 27764;
		entityDef.anIntArray94[3] = 27765;
		entityDef.anIntArray94[4] = 27770;
		entityDef.combatLevel = 650;
		entityDef.standAnim = 6943;
		entityDef.walkAnim = 6942; // walk
		entityDef.anInt86 = 65;
		entityDef.anInt91 = 65;
		}

		if (i == 4006) {
		entityDef.name = "Commander Zilyana";
		entityDef.description = "The smaller version of Commander Zilyana.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[4];
		entityDef.anIntArray94[0] = 28057;
		entityDef.anIntArray94[1] = 28071;
		entityDef.anIntArray94[2] = 28078;
		entityDef.anIntArray94[3] = 28056;
		entityDef.combatLevel = 596;
		entityDef.standAnim = 6963;
		entityDef.walkAnim = 6962; // walk
		entityDef.anInt86 = 85;
		entityDef.anInt91 = 85;
		}
		if (i == 4007) {
		entityDef.name = "Dagannoth Supreme";
		entityDef.description = "The smaller version of Dagannoth Supreme.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 9941;
		entityDef.anIntArray94[1] = 9943;
		entityDef.combatLevel = 303;
		entityDef.standAnim = 2850;
		entityDef.walkAnim = 2849;
		entityDef.anInt86 = 98;
		entityDef.anInt91 = 98;
		}

		if (i == 4008) {
		entityDef.name = "Dagannoth Prime"; //9940, 9943, 9942
		entityDef.description = "The smaller version of Dagannoth Prime.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[3];
		entityDef.anIntArray94[0] = 9940;
		entityDef.anIntArray94[1] = 9943;
		entityDef.anIntArray94[2] = 9942;
		entityDef.anIntArray70 = new int[]{11930, 27144, 16536, 16540};
		entityDef.anIntArray76 = new int[]{5931, 1688, 21530, 21534};
		entityDef.combatLevel = 303;
		entityDef.standAnim = 2850;
		entityDef.walkAnim = 2849;
		entityDef.anInt86 = 98;
		entityDef.anInt91 = 98;
		}

		if (i == 4009) {
		entityDef.name = "Dagannoth Rex";
		entityDef.description = "The smaller version of Dagannoth Rex.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 9941;
		entityDef.anIntArray70 = new int[]{16536, 16540, 27144, 2477};
		entityDef.anIntArray76 = new int[]{7322, 7326, 10403, 2595};
		entityDef.combatLevel = 303;
		entityDef.standAnim = 2850;
		entityDef.walkAnim = 2849;
		entityDef.anInt86 = 98;
		entityDef.anInt91 = 98;
		}

		if (i == 4010) {
		entityDef.name = "King Black Dragon";
		entityDef.description = "The smaller version of King Black Dragon.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[4];
		entityDef.anIntArray94[0] = 17414;
		entityDef.anIntArray94[1] = 17415;
		entityDef.anIntArray94[2] = 17429;
		entityDef.anIntArray94[3] = 17422;
		entityDef.combatLevel = 276;
		entityDef.standAnim = 90;
		entityDef.walkAnim = 4635; // walk
		entityDef.anInt86 = 45;
		entityDef.anInt91 = 45;
		}

		if (i == 4011) {
		entityDef.name = "General Graardor";
		entityDef.description = "The smaller version of General Graardor.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 27785;
		entityDef.anIntArray94[1] = 27789;
		entityDef.combatLevel = 624;
		entityDef.standAnim = 7059;
		entityDef.walkAnim = 7058; // walk
		entityDef.anInt86 = 35;
		entityDef.anInt91 = 35;
		}

		if (i == 4012) {
		entityDef.name = "Chaos Elemental";
		entityDef.description = "The smaller version of Chaos Elemental.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 11216;
		entityDef.combatLevel = 305;
		entityDef.standAnim = 3144;
		entityDef.walkAnim = 3145; // walk
		entityDef.anInt86 = 50;
		entityDef.anInt91 = 50;
		}

		if (i == 4013) {
		entityDef.name = "Kree Arra";
		entityDef.description = "The smaller version of Kree Arra.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 28003;
		entityDef.anIntArray94[1] = 28004;
		entityDef.combatLevel = 580;
		entityDef.standAnim = 6972;
		entityDef.walkAnim = 6973; // walk
		entityDef.anInt86 = 30;
		entityDef.anInt91 = 30;
		}
		
		if(i == 4014) { // Change it.
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 40955;
		entityDef.standAnim = 10056;
		entityDef.walkAnim = 10055; // walk
		entityDef.combatLevel = 785;
		entityDef.anInt86 = 38;
		entityDef.anInt91 = 38;
		entityDef.name = "Corporeal beast";
		entityDef.description = "The smaller version of the mighty Corporeal Beast.".getBytes();
		}

		if (i == 4015) {
		entityDef.name = "K'ril Tsutsaroth";
		entityDef.description = "The smaller version of K'ril Trutsaroth.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[5];
		entityDef.anIntArray94[0] = 27768;
		entityDef.anIntArray94[1] = 27773;
		entityDef.anIntArray94[2] = 27764;
		entityDef.anIntArray94[3] = 27765;
		entityDef.anIntArray94[4] = 27770;
		entityDef.combatLevel = 650;
		entityDef.standAnim = 6943;
		entityDef.walkAnim = 6942; // walk
		entityDef.anInt86 = 50;
		entityDef.anInt91 = 50;
		}

		if (i == 4016) {
		entityDef.name = "Commander Zilyana";
		entityDef.description = "The smaller version of Commander Zilyana.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[4];
		entityDef.anIntArray94[0] = 28057;
		entityDef.anIntArray94[1] = 28071;
		entityDef.anIntArray94[2] = 28078;
		entityDef.anIntArray94[3] = 28056;
		entityDef.combatLevel = 596;
		entityDef.standAnim = 6963;
		entityDef.walkAnim = 6962; // walk
		entityDef.anInt86 = 65;
		entityDef.anInt91 = 65;
		}
		if (i == 4017) {
		entityDef.name = "Dagannoth Supreme";
		entityDef.description = "The smaller version of Dagannoth Supreme.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[2];
		entityDef.anIntArray94[0] = 9941;
		entityDef.anIntArray94[1] = 9943;
		entityDef.combatLevel = 303;
		entityDef.standAnim = 2850;
		entityDef.walkAnim = 2849;
		entityDef.anInt86 = 58;
		entityDef.anInt91 = 58;
		}

		if (i == 4018) {
		entityDef.name = "Dagannoth Prime"; //9940, 9943, 9942
		entityDef.description = "The smaller version of Dagannoth Prime.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[3];
		entityDef.anIntArray94[0] = 9940;
		entityDef.anIntArray94[1] = 9943;
		entityDef.anIntArray94[2] = 9942;
		entityDef.anIntArray70 = new int[]{11930, 27144, 16536, 16540};
		entityDef.anIntArray76 = new int[]{5931, 1688, 21530, 21534};
		entityDef.combatLevel = 303;
		entityDef.standAnim = 2850;
		entityDef.walkAnim = 2849;
		entityDef.anInt86 = 58;
		entityDef.anInt91 = 58;
		}

		if (i == 4019) {
		entityDef.name = "Dagannoth Rex";
		entityDef.description = "The smaller version of Dagannoth Rex.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 9941;
		entityDef.anIntArray70 = new int[]{16536, 16540, 27144, 2477};
		entityDef.anIntArray76 = new int[]{7322, 7326, 10403, 2595};
		entityDef.combatLevel = 303;
		entityDef.standAnim = 2850;
		entityDef.walkAnim = 2849;
		entityDef.anInt86 = 58;
		entityDef.anInt91 = 58;
		}
		if (i == 2574) {
			entityDef.name = "Banker Pet";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Pick-up";
			entityDef.itemActions[2] = "Bank";
			entityDef.description = "Makes banking so much easier!".getBytes();
			entityDef.anInt91 = 80;
			entityDef.anInt86 = 80;
		}
		if (i == 4021) {
		entityDef.name = "Mini Toktz-Jad";
		entityDef.description = "The pet version of the mighty Toktz-Jad.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 34131;
		entityDef.combatLevel = 276;
		entityDef.standAnim = 9274;
		entityDef.walkAnim = 9273;
		entityDef.anInt86 = 30;
		entityDef.anInt91 = 30;
		}
		if (i == 4022) {
			entityDef.name = "Mini Ahrim the Blighted";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 6668;
			entityDef.combatLevel = 98;
			entityDef.standAnim = 813;
			entityDef.walkAnim = 1205;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 4023) {
			entityDef.name = "Mini Guthan the Infested";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[6];
			entityDef.anIntArray94[0] = 6654;
			entityDef.anIntArray94[1] = 6673;
			entityDef.anIntArray94[2] = 6642;
			entityDef.anIntArray94[3] = 6666;
			entityDef.anIntArray94[4] = 6679;
			entityDef.anIntArray94[5] = 6710;
			entityDef.standAnim = 813;
			entityDef.walkAnim = 1205;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 4024) {
		entityDef.name = "Mini Karil The Tainted";
		entityDef.description = "The pet version of Karil The Tainted.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 6675;
		entityDef.combatLevel = 98;
		entityDef.standAnim = 2074;
		entityDef.walkAnim = 2076;
		entityDef.anInt86 = 95;
		entityDef.anInt91 = 95;
		}
		if (i == 4025) {
			entityDef.name = "Mini Torag the Corrupted";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[6];
			entityDef.anIntArray94[0] = 6657;
			entityDef.anIntArray94[1] = 6677;
			entityDef.anIntArray94[2] = 6645;
			entityDef.anIntArray94[3] = 6663;
			entityDef.anIntArray94[4] = 6708;
			entityDef.anIntArray94[5] = 6679;
			entityDef.standAnim = 808;
			entityDef.walkAnim = 819;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 4026) {
			entityDef.name = "Mini Verac the Defiled";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 6678;
			entityDef.anIntArray94[1] = 6705;
			entityDef.standAnim = 2061;
			entityDef.walkAnim = 2060;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 4027) {
			entityDef.name = "Pet Ahrim the Blighted";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Pick-up";
			entityDef.itemActions[2] = "Restore Prayer";
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 6668;
			entityDef.combatLevel = 98;
			entityDef.standAnim = 813;
			entityDef.walkAnim = 1205;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 4028) {
			entityDef.name = "Pet Guthan the Infested";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Pick-up";
			entityDef.itemActions[2] = "Restore Prayer";
			entityDef.anIntArray94 = new int[6];
			entityDef.anIntArray94[0] = 6654;
			entityDef.anIntArray94[1] = 6673;
			entityDef.anIntArray94[2] = 6642;
			entityDef.anIntArray94[3] = 6666;
			entityDef.anIntArray94[4] = 6679;
			entityDef.anIntArray94[5] = 6710;
			entityDef.standAnim = 813;
			entityDef.walkAnim = 1205;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 4029) {
		entityDef.name = "Pet Karil The Tainted";
		entityDef.description = "The pet version of Karil The Tainted.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[0] = "Pick-up";
		entityDef.itemActions[2] = "Restore Prayer";
		entityDef.anIntArray94 = new int[1];
		entityDef.anIntArray94[0] = 6675;
		entityDef.combatLevel = 276;
		entityDef.standAnim = 2074;
		entityDef.walkAnim = 2076;
		entityDef.anInt86 = 95;
		entityDef.anInt91 = 95;
		}
		if (i == 4030) {
			entityDef.name = "Pet Torag the Corrupted";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Pick-up";
			entityDef.itemActions[2] = "Restore Prayer";
			entityDef.anIntArray94 = new int[6];
			entityDef.anIntArray94[0] = 6657;
			entityDef.anIntArray94[1] = 6677;
			entityDef.anIntArray94[2] = 6645;
			entityDef.anIntArray94[3] = 6663;
			entityDef.anIntArray94[4] = 6708;
			entityDef.anIntArray94[5] = 6679;
			entityDef.standAnim = 808;
			entityDef.walkAnim = 819;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 4031) {
			entityDef.name = "Pet Verac the Defiled";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Pick-up";
			entityDef.itemActions[2] = "Restore Prayer";
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 6678;
			entityDef.anIntArray94[1] = 6705;
			entityDef.standAnim = 2061;
			entityDef.walkAnim = 2060;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		}
		if (i == 2030) {
			entityDef.anInt86 = 200;
			entityDef.anInt91 = 200;
			entityDef.combatLevel = 276;
		}
		if (i == 1423) {
			entityDef.itemActions = new String[5];
            entityDef.itemActions[0] = "Teleport To Minigame";
            entityDef.itemActions[2] = "Open Shop";
			entityDef.name = "@red@Barrows Minigame Transporter";
			entityDef.description = "It's a Barrows Minigame Transporter. Transports you to the Barrows Minigame.".getBytes();
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 6678;
			entityDef.anIntArray94[1] = 6705;
			entityDef.standAnim = 2061;
			entityDef.walkAnim = 2060;
			entityDef.anInt86 = 170;
		}
		if (i == 10148) {
			entityDef.name = "Shadow-Forger Ihlakhizy";
			entityDef.description = "Super cute.... NOT!".getBytes();
			entityDef.anInt91 = 75;
			entityDef.aByte68 = 1;
			entityDef.anInt86 = 75;
		}
		if (i == 10155) {
			entityDef.name = "Ihlakhizy";
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Pick-up";
			entityDef.aByte68 = 2;
			entityDef.itemActions[2] = "Interact";
			entityDef.description = "Super cute.... NOT!".getBytes();
			entityDef.anInt91 = 35;
			entityDef.anInt86 = 35;
		}
		if (i == 1475) {
		entityDef.name = "Ticket Picker";
	    entityDef.description = "The one and only pet that picks up tickets for you!".getBytes();
	    entityDef.itemActions = new String[5];
	    entityDef.itemActions[0] = "Pick-up";
		}
		if (i == 761) {
		entityDef.name = "Starter Kitty";
	    entityDef.description = "The Pandemic personal starter kitten!".getBytes();
	    entityDef.itemActions = new String[5];
	    entityDef.itemActions[0] = "Pick-up";
	    entityDef.itemActions[2] = "Feed (5000b)";
		}
		if (i == 6691) {
		entityDef.name = "Slayer DarkBeast";
		entityDef.combatLevel = 120;
		}
		if (i == 6715) {
		entityDef.name = "Slayer Imp";
		entityDef.combatLevel = 150;
		}
		if (i == 6689) {
		entityDef.name = "Slayer Demon";
		entityDef.combatLevel = 175;
		}
		if (i == 6724) {
		entityDef.name = "Slayer WereWolf";
		entityDef.combatLevel = 215;
		}
		if (i == 7903) {
		entityDef.name = "Pandemic Impling";
		}
		
		if (i == 1699) {
		entityDef.itemActions[3] = "Achievements";
		entityDef.itemActions[2] = "Titles";
		entityDef.name = "Achievements Manager";
		}
		if (i == 250) {
      entityDef.name = "@cya@1b Ticket Store";
		}
	if (i == 1337) {
      entityDef.name = "@cya@2b Ticket Store";

	}
		if (i == 10040) {
		entityDef.itemActions[1] = "Attack";
		entityDef.combatLevel = 521;
		}
		
		if (i == 167) {	 
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35251;
	entityDef.name = "Christmas Pikachu";
	entityDef.combatLevel = 140;
	entityDef.description = "It's Pikachu.".getBytes();
	entityDef.standAnim = 66;
	}
		
		//1b ticket
		if (i == 1388) {	 
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[1]; 
			entityDef.anIntArray94[0] = 83334;
			entityDef.name = "1B ticket";
			entityDef.combatLevel = 1;
			entityDef.description = "It's a 1b ticket, but bigger... And alive ...?".getBytes();
		      entityDef.anInt91 = 50;
		      entityDef.anInt86 = 50;
				entityDef.aByte68 = 1;
			}
		//2b ticket
		if (i == 1387) {	 
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[1]; 
			entityDef.anIntArray94[0] = 83335;
			entityDef.name = "1B ticket";
			entityDef.combatLevel = 2;
			entityDef.description = "It's a 1b ticket, but way bigger... And alive ...?".getBytes();
		      entityDef.anInt91 = 75;
		      entityDef.anInt86 = 75;
				entityDef.aByte68 = 1;
			}
		//Ticket boss
				if (i == 1386) {	 
					entityDef.itemActions = new String[5];
					entityDef.itemActions[1] = "Attack";
					entityDef.anIntArray94 = new int[1]; 
					entityDef.anIntArray94[0] = 83333;
					entityDef.name = "Big Ticket";
					entityDef.combatLevel = 140;
					entityDef.description = "Uh oh ... Furious red but doesn't look good ...".getBytes();
				      entityDef.anInt91 = 180;
				      entityDef.anInt86 = 180;
						entityDef.aByte68 = 1;
					}
				if (i == 1385) {	 
					entityDef.itemActions = new String[5];
					entityDef.itemActions[1] = "Attack";
					entityDef.anIntArray94 = new int[1]; 
					entityDef.anIntArray94[0] = 83333;
					entityDef.name = "Minion Ticket";
					entityDef.combatLevel = 140;
					entityDef.description = "A bit smaller, but still furious red ...".getBytes();
				      entityDef.anInt91 = 90;
				      entityDef.anInt86 = 90;
						entityDef.aByte68 = 1;
					}


//Vorago
		if (i == 8995) {	 
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 1;
	entityDef.name = "Vorago";
	entityDef.combatLevel = 240;
	entityDef.description = "A tiny monster with an amazing strength!".getBytes();
	entityDef.standAnim = 1608;
	entityDef.walkAnim = 12196;
	}
		if (i == 8994) {	 
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 1;
	entityDef.name = "Vorago";
	entityDef.combatLevel = 240;
    entityDef.anInt91 = 450;
    entityDef.anInt86 = 450;
	entityDef.description = "A huge monster with an amazing strength!".getBytes();
	entityDef.standAnim = 1608;
	}
		if (i == 8996) {	 
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[1]; 
			entityDef.anIntArray94[0] = 2;
			entityDef.name = "Red Vorago";
			entityDef.combatLevel = 240;
			entityDef.description = "A tiny monster with an amazing strength!".getBytes();
			entityDef.standAnim = 1608;
			}
		if (i == 8997) {	 
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[1]; 
			entityDef.anIntArray94[0] = 3;
			entityDef.name = "Green Vorago";
			entityDef.combatLevel = 240;
			entityDef.description = "A tiny monster with an amazing strength!".getBytes();
			entityDef.standAnim = 1608;
			}
		if (i == 8998) {	 
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[1]; 
			entityDef.anIntArray94[0] = 4;
			entityDef.name = "Yellow Vorago";
			entityDef.combatLevel = 240;
			entityDef.description = "A tiny monster with an amazing strength!".getBytes();
			entityDef.standAnim = 1608;
			}
		if (i == 8999) {	 
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.anIntArray94 = new int[1]; 
			entityDef.anIntArray94[0] = 5;
			entityDef.name = "Colourful Vorago";
			entityDef.combatLevel = 240;
			entityDef.description = "A tiny monster with an amazing strength!".getBytes();
			entityDef.standAnim = 1608;
			}
		if (i == 3062) {
			entityDef.anInt86 = 335;
			entityDef.anInt91 = 335;
			entityDef.combatLevel = 243;
			entityDef.description = "A tiny monster with an amazing strength!".getBytes();
			}




	if (i == 168) {     
    entityDef.itemActions = new String[5];
    entityDef.itemActions[0] = "Trade-in package";
    entityDef.anIntArray94 = new int[1]; 
    entityDef.anIntArray94[0] = 35252;
    entityDef.name = "Christmas Spongebob";
    //entityDef.combatLevel = 170;
    entityDef.description = "It's Spongebob, with a christmas hat!".getBytes();
    entityDef.standAnim = 66;
    }
	
	if (i == 268) {     
    entityDef.itemActions = new String[5];
    entityDef.itemActions[1] = "Attack";
    entityDef.anIntArray94 = new int[1]; 
    entityDef.anIntArray94[0] = 35253;
    entityDef.name = "Luigi";
    entityDef.combatLevel = 100;
    entityDef.description = "It's Luigi.".getBytes();
    entityDef.standAnim = 66;
    }
    if (i == 2642) {     
    entityDef.itemActions = new String[5];
    entityDef.itemActions[1] = "Attack";
    }

			 if (i == 98){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35222;
	entityDef.name = "SpongeBobSquarePants";
	entityDef.combatLevel = 130;
	entityDef.description = "It's SpongeBob.".getBytes();
	entityDef.standAnim = 66;
		}
		
		if (i == 8133){
		entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 50236;
    entityDef.anInt91 = 150;
    entityDef.anInt86 = 150;
	entityDef.name = "Colourful Corporeal Beast";
	entityDef.combatLevel = 1337;
	entityDef.description = "It's huge... And colourful?!".getBytes();
		}
		if(i == 41) {		 
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35223;
	entityDef.name = "Pikachu creature";
	entityDef.combatLevel = 1400;
	entityDef.description = "It's HUGE.".getBytes();
	}
		
		if (i == 99){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35230;
	entityDef.name = "Squirtle";
	entityDef.combatLevel = 130;
	entityDef.description = "A water pokémon.".getBytes();
	entityDef.standAnim = 66;
		}
		if (i == 96){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35231;
	entityDef.name = "Charmeleon";
	entityDef.combatLevel = 85;
	entityDef.description = "Charmeleon".getBytes();
	entityDef.standAnim = 66;
	}
	if (i == 95){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35232;
	entityDef.name = "Onix";
	entityDef.combatLevel = 95;
	entityDef.description = "Onix".getBytes();
	entityDef.standAnim = 66;
	}
	
		if (i == 94){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35233;
	entityDef.name = "Ho-Oh";
	entityDef.combatLevel = 100;
	entityDef.description = "Ho-Oh".getBytes();
	entityDef.standAnim = 66;
	}
	if (i == 93){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35234;
	entityDef.name = "Mewtwo";
	entityDef.combatLevel = 120;
	entityDef.description = "Mewtwo".getBytes();
	entityDef.standAnim = 66;
	}
	if (i == 92){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35235;
	entityDef.name = "Geodude";
	entityDef.combatLevel = 130;
	entityDef.description = "Geodude".getBytes();
	entityDef.standAnim = 66;
	}
	if (i == 91){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35236;
	entityDef.name = "Articuno";
	entityDef.combatLevel = 130;
	entityDef.description = "Articuno.".getBytes();
	entityDef.standAnim = 66;
	}
	if (i == 100){
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35250;
	entityDef.name = "Zapdos";
	entityDef.combatLevel = 185;
	entityDef.description = "Zapdos".getBytes();
	entityDef.standAnim = 66;
	}
		
		if (i == 97) {	 
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
	entityDef.anIntArray94 = new int[1]; 
	entityDef.anIntArray94[0] = 35226;
	entityDef.name = "Gigantus";
	entityDef.combatLevel = 105;
	entityDef.description = "It's Gigantus.".getBytes();
	entityDef.standAnim = 66;
	}
		
		
                if (i == 251) {
                entityDef.name = "King Milestone";
		entityDef.itemActions[2] = "Milestone";
                entityDef.description = "Pandemic's Official MilestoneCape Seller".getBytes();
                }

		if (i == 9713) {
		entityDef.itemActions[2] = "Buy Skillcape";
	}
		if(i == 1812) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 16021;//Npc's Cape
	entityDef.anIntArray94[1] = 85019;//Npc's Head
	entityDef.anIntArray94[2] = 85020;//Npc's Plate
	entityDef.anIntArray94[3] = 85018;//Npc's Legs
	entityDef.anIntArray94[4] = 72152;//Npc's Weapon
	entityDef.anIntArray94[5] = 13307;//Npc's Gloves
	entityDef.anIntArray94[6] = 13565;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "Hulk Torva";
		entityDef.anInt91 = 215;
		entityDef.anInt86 = 215;
	entityDef.combatLevel = 9999;//Combat Level
	entityDef.description = "Hulk torva.".getBytes();
	}
		if(i == 1813) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 14557;//Npc's Cape
			entityDef.anIntArray94[1] = 85032;//Npc's Head
			entityDef.anIntArray94[2] = 85031;//Npc's Plate
			entityDef.anIntArray94[3] = 85030;//Npc's Legs
			entityDef.anIntArray94[4] = 14150;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Death Torva";
			entityDef.combatLevel = 666;//Combat Level
			entityDef.description = "Death torva.".getBytes();
			}
		if(i == 1817) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 13565;//Npc's Cape//14557
			entityDef.anIntArray94[1] = 85046;//Npc's Head
			entityDef.anIntArray94[2] = 85047;//Npc's Plate
			entityDef.anIntArray94[3] = 85045;//Npc's Legs
			entityDef.anIntArray94[4] = 12243;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Calculon";
     		entityDef.anInt91 = 280;
     		entityDef.anInt86 = 280;
			entityDef.combatLevel = 1337;//Combat Level
			entityDef.description = "The greatest acting-robot in Futurama history.".getBytes();
			}
		if(i == 1818) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Interact with";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 13565;//Npc's Cape//14557
			entityDef.anIntArray94[1] = 85051;//Npc's Head
			entityDef.anIntArray94[2] = 85052;//Npc's Plate
			entityDef.anIntArray94[3] = 85053;//Npc's Legs
			entityDef.anIntArray94[4] = 12243;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Latest Update Checker";
     		entityDef.anInt91 = 140;
     		entityDef.anInt86 = 140;
			entityDef.combatLevel = 1337;//Combat Level
			entityDef.description = "Talk to the Latest Update Checker to check if you're on our latest client!".getBytes();
			}
		if(i == 1815) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 27647;//Npc's Cape
			entityDef.anIntArray94[1] = 85025;//Npc's Head
			entityDef.anIntArray94[2] = 85026;//Npc's Plate
			entityDef.anIntArray94[3] = 85024;//Npc's Legs
			entityDef.anIntArray94[4] = 75893;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Piyan Torva";
			entityDef.combatLevel = 281;//Combat Level
			entityDef.description = "Piyan Torva.".getBytes();
			}
		if(i == 1819) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 58039;//Npc's Cape
			entityDef.anIntArray94[1] = 85010;//Npc's Head
			entityDef.anIntArray94[2] = 85011;//Npc's Plate
			entityDef.anIntArray94[3] = 85009;//Npc's Legs
			entityDef.anIntArray94[4] = 50228;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Legendary Warrior";
			entityDef.combatLevel = 374;//Combat Level
			entityDef.description = "Legendary Torva.".getBytes();
     		entityDef.anInt91 = 160;
     		entityDef.anInt86 = 160;
			}
		if(i == 1820) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 2;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 31415;//Npc's Cape
			entityDef.anIntArray94[1] = 85022;//Npc's Head
			entityDef.anIntArray94[2] = 85023;//Npc's Plate
			entityDef.anIntArray94[3] = 85021;//Npc's Legs
			entityDef.anIntArray94[4] = 50234;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Pumpkin Warrior";
			entityDef.combatLevel = 666;//Combat Level
     		entityDef.anInt91 = 160;
     		entityDef.anInt86 = 160;
			entityDef.description = "Eww, scary ....".getBytes();
			}
		if(i == 1821) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 58039;//Npc's Cape
			entityDef.anIntArray94[1] = 85034;//Npc's Head
			entityDef.anIntArray94[2] = 85035;//Npc's Plate
			entityDef.anIntArray94[3] = 85033;//Npc's Legs
			entityDef.anIntArray94[4] = 50228;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Sky Warrior";
			entityDef.combatLevel = 286;//Combat Level
			entityDef.description = "Sky Torva.".getBytes();
     		entityDef.anInt91 = 160;
     		entityDef.anInt86 = 160;
		}
		if(i == 1822) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 58039;//Npc's Cape
			entityDef.anIntArray94[1] = 85028;//Npc's Head
			entityDef.anIntArray94[2] = 85029;//Npc's Plate
			entityDef.anIntArray94[3] = 85027;//Npc's Legs
			entityDef.anIntArray94[4] = 62001;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Wolverine Warrior";
			entityDef.combatLevel = 291;//Combat Level
			entityDef.description = "Wolverine Torva.".getBytes();
     		entityDef.anInt91 = 160;
     		entityDef.anInt86 = 160;
			}
		if(i == 1823) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 58039;//Npc's Cape
			entityDef.anIntArray94[1] = 85016;//Npc's Head
			entityDef.anIntArray94[2] = 85017;//Npc's Plate
			entityDef.anIntArray94[3] = 85015;//Npc's Legs
			entityDef.anIntArray94[4] = 50228;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Light Warrior";
			entityDef.combatLevel = 301;//Combat Level
			entityDef.description = "Light Torva.".getBytes();
     		entityDef.anInt91 = 160;
     		entityDef.anInt86 = 160;
			}
		if(i == 1824) {
			stream.currentOffset = streamIndices[630]; 
			entityDef.aByte68 = 1;
			entityDef.readValues(stream); // Collect original NPC data
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
		                int changedColors = 1; // Number of model colors changed on the NPC
		                entityDef.anIntArray70 = new int[changedColors];
		                entityDef.anIntArray76 = new int[changedColors];
		                entityDef.anIntArray76[0] = 40; // Original model color
		                entityDef.anIntArray70[0] = 34; // Changed model color
			entityDef.anIntArray94 = new int[7];
			entityDef.anIntArray94[0] = 5169;//Npc's Cape
			entityDef.anIntArray94[1] = 85007;//Npc's Head
			entityDef.anIntArray94[2] = 85008;//Npc's Plate
			entityDef.anIntArray94[3] = 85006;//Npc's Legs
			entityDef.anIntArray94[4] = 50228;//Npc's Weapon
			entityDef.anIntArray94[5] = 13307;//Npc's Gloves
			entityDef.anIntArray94[6] = 13565;//Npc's Boots
			//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
			//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
			entityDef.standAnim = 808;// Npc's Stand Emote
			entityDef.name = "Ocean Warrior";
			entityDef.combatLevel = 286;//Combat Level
			entityDef.description = "Ocean Torva.".getBytes();
     		entityDef.anInt91 = 160;
     		entityDef.anInt86 = 160;
		}
         if (i == 666){
                       entityDef.itemActions = new String[5];
                       entityDef.itemActions[1] = "Attack";
                       entityDef.anIntArray94 = new int[1];
                       entityDef.anIntArray94[0] = 44751;
                       entityDef.name = "Tzrek-jad";
           			   entityDef.combatLevel = 195;//Combat Level
                       entityDef.description = "A fearsome obsidian beast.".getBytes();
                       }
        if(i == 2221) {
	stream.currentOffset = streamIndices[630];
	entityDef.aByte68 = 1;
	entityDef.readValues(stream); 
	entityDef.itemActions = new String[5];
	entityDef.itemActions[0] = "Drive";
	entityDef.anIntArray94 = new int[1];
	entityDef.anIntArray94[0] = 52041;
	entityDef.name = "Car";
	entityDef.description = "Historic`s Pink Car LikeaBoss".getBytes();
	}	
        if(i == 2586) {
     		entityDef.itemActions = new String[5];
     		entityDef.itemActions[1] = "Attack";
     		entityDef.anIntArray94 = new int[2];
     		entityDef.anIntArray94[0] = 62747;
     		entityDef.anIntArray94[1] = 62734;
     		entityDef.aByte68 = 1;
     		entityDef.anInt91 = 130;
     		entityDef.anInt86 = 130;
     		entityDef.standAnim = 808;//stand animation
     		entityDef.walkAnim  = 819;//walk animation
     		entityDef.name = "Dragonbone Wizard";
		entityDef.description = "Very damn strong.".getBytes();
     		entityDef.combatLevel = 285;
     	}
		     	if(i == 5001){
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 62717;
			entityDef.name = "Nex";
			entityDef.aByte68 = 3;
			entityDef.standAnim = 6320;
			entityDef.walkAnim = 6319;
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.combatLevel = 1001;
			//entityDef.headicon = 19;
		}
		if(i == 7557){
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 35228;
			entityDef.name = "Mr. Krabbs";
			entityDef.standAnim = 6320;
			entityDef.walkAnim = 6319;
			entityDef.itemActions = new String[5];
			entityDef.itemActions[2] = "Talk To";
            entityDef.itemActions[3] = "Teleport";
			//entityDef.headicon = 19;
		}
		if(i == 596){
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 35229;
			entityDef.name = "Homer";
			entityDef.standAnim = 6320;
			entityDef.walkAnim = 6319;
			entityDef.itemActions = new String[5];
			entityDef.itemActions[2] = "Talk To";
            entityDef.itemActions[3] = "Customs Shop";
		}
			if(i == 3919){
			//entityDef.anIntArray94 = new int[1];
			//entityDef.anIntArray94[0] = 35229;
			entityDef.name = "Miss Prestige";
			//entityDef.standAnim = 6320;
			//entityDef.walkAnim = 6319;
			entityDef.itemActions = new String[5];
			entityDef.itemActions[0] = "Talk To";
           // entityDef.itemActions[3] = "Customs Shop";
		}
		
		     	if(i == 5006){
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13888;
			entityDef.name = "Ganodermic beast";
			entityDef.aByte68 = 3;
			entityDef.standAnim = 6320;
			entityDef.walkAnim = 6319;
			entityDef.itemActions = new String[5];
			entityDef.itemActions[1] = "Attack";
			entityDef.combatLevel = 280;
		}
		if(i == 502) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 5169;//Npc's Cape
	entityDef.anIntArray94[1] = 55054;//Npc's Head
	entityDef.anIntArray94[2] = 55052;//Npc's Plate
	entityDef.anIntArray94[3] = 55056;//Npc's Legs
	entityDef.anIntArray94[4] = 55058;//Npc's Weapon
	entityDef.anIntArray94[5] = 13307;//Npc's Gloves
	entityDef.anIntArray94[6] = 13565;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@blu@Blue torva";
	entityDef.combatLevel = 175;//Combat Level
	entityDef.description = "Blue torva.".getBytes();
	}
		if(i == 503) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 55042;//Npc's Cape
	entityDef.anIntArray94[1] = 75507;//Npc's Head
	entityDef.anIntArray94[2] = 75504;//Npc's Plate
	entityDef.anIntArray94[3] = 75506;//Npc's Legs
	entityDef.anIntArray94[4] = 55041;//Npc's Weapon
	entityDef.anIntArray94[5] = 13307;//Npc's Gloves
	entityDef.anIntArray94[6] = 13565;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@yel@24K torva";
	entityDef.combatLevel = 195;//Combat Level
	entityDef.description = "24K torva.".getBytes();
	}
	if(i == 504) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 45656;//Npc's Cape
	entityDef.anIntArray94[1] = 75898;//Npc's Head
	entityDef.anIntArray94[2] = 75896;//Npc's Plate
	entityDef.anIntArray94[3] = 75900;//Npc's Legs
	entityDef.anIntArray94[4] = 50066;//Npc's Weapon
	entityDef.anIntArray94[5] = 13307;//Npc's Gloves
	entityDef.anIntArray94[6] = 13565;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@yel@Flame torva";
	entityDef.combatLevel = 185;//Combat Level
	entityDef.description = "Flame torva.".getBytes();
	}
		if(i == 5555) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 18985;//Npc's Cape
	entityDef.anIntArray94[1] = 15002;//Npc's Head
	entityDef.anIntArray94[2] = 15004;//Npc's Plate
	entityDef.anIntArray94[3] = 15005;//Npc's Legs
	entityDef.anIntArray94[4] = 12316;//Npc's Weapon
	entityDef.anIntArray94[5] = 13307;//Npc's Gloves
	entityDef.anIntArray94[6] = 13565;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@bla@Aiyana";
	entityDef.combatLevel = 315;//Combat Level
	entityDef.description = "Aiyana Monster.".getBytes();
	 entityDef.anInt91 = 150;
      entityDef.anInt86 = 150;
	}
	if(i == 507) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 69027;//Npc's Cape
	entityDef.anIntArray94[1] = 69022;//Npc's Head
	entityDef.anIntArray94[2] = 69016;//Npc's Plate
	entityDef.anIntArray94[3] = 69024;//Npc's Legs
	entityDef.anIntArray94[4] = 69026;//Npc's Weapon
	entityDef.anIntArray94[5] = 69019;//Npc's Gloves
	entityDef.anIntArray94[6] = 69017;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@yel@Cyrex torva";
	entityDef.combatLevel = 250;//Combat Level
	entityDef.description = "Cyrex torva.".getBytes();
	}
		if(i == 508) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 15040;//Npc's Cape
	entityDef.anIntArray94[1] = 15035;//Npc's Head
	entityDef.anIntArray94[2] = 15029;//Npc's Plate
	entityDef.anIntArray94[3] = 15037;//Npc's Legs
	entityDef.anIntArray94[4] = 15039;//Npc's Weapon
	entityDef.anIntArray94[5] = 15032;//Npc's Gloves
	entityDef.anIntArray94[6] = 15030;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@yel@Burst torva";
	entityDef.combatLevel = 210;//Combat Level
	entityDef.description = "Burst torva.".getBytes();
	}
		if(i == 509) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 15026;//Npc's Cape
	entityDef.anIntArray94[1] = 15021;//Npc's Head
	entityDef.anIntArray94[2] = 15015;//Npc's Plate
	entityDef.anIntArray94[3] = 15023;//Npc's Legs
	entityDef.anIntArray94[4] = 15025;//Npc's Weapon
	entityDef.anIntArray94[5] = 15018;//Npc's Gloves
	entityDef.anIntArray94[6] = 15016;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@gre@Predator torva";
	entityDef.combatLevel = 230;//Combat Level
	entityDef.description = "Predator torva.".getBytes();
	}
		if(i == 291) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.itemActions = new String[5];
	entityDef.itemActions[1] = "Attack";
                int changedColors = 1; // Number of model colors changed on the NPC
                entityDef.anIntArray70 = new int[changedColors];
                entityDef.anIntArray76 = new int[changedColors];
                entityDef.anIntArray76[0] = 40; // Original model color
                entityDef.anIntArray70[0] = 34; // Changed model color
	entityDef.anIntArray94 = new int[7];
	entityDef.anIntArray94[0] = 55073;//Npc's Cape
	entityDef.anIntArray94[1] = 55047;//Npc's Head
	entityDef.anIntArray94[2] = 55046;//Npc's Plate
	entityDef.anIntArray94[3] = 55050;//Npc's Legs
	entityDef.anIntArray94[4] = 55072;//Npc's Weapon
	entityDef.anIntArray94[5] = 15018;//Npc's Gloves
	entityDef.anIntArray94[6] = 15016;//Npc's Boots
	//entityDef.anIntArray94[7] = 17461;//Npc's Darkness(Shadow)
	//entityDef.anIntArray94[8] = 20147;//Npc's Arms(You Dont Have To Edit)
	entityDef.standAnim = 808;// Npc's Stand Emote
	entityDef.name = "@red@Fire Torva Boss";
	entityDef.combatLevel = 1337;//Combat Level
	entityDef.description = "Fire Torva Boss.".getBytes();
      entityDef.anInt91 = 300;
      entityDef.anInt86 = 300;
	}
	if(i == 600) {
	entityDef.name = "Moderator's shop";
	entityDef.description = "Moderator's shop".getBytes();
	}
	if(i == 601) {
	entityDef.name = "Administrator's shop";
	entityDef.description = "Administrator's shop".getBytes();
	}
	if(i == 602) {
	entityDef.name = "Owner's shop";
	entityDef.description = "Owner's shop".getBytes();
	}
     	if(i == 2587) {
     		entityDef.itemActions = new String[5];
     		entityDef.itemActions[1] = "Attack";
     		entityDef.anIntArray94 = new int[2];
     		entityDef.anIntArray94[0] = 62747;
     		entityDef.anIntArray94[1] = 62734;
     		entityDef.anIntArray70 = new int[10];
         		entityDef.anIntArray76 = new int[10];
         		entityDef.anIntArray76[0] = 33893;
         		entityDef.anIntArray70[0] = 828;	
     		entityDef.anIntArray76[1] = 34853;
         		entityDef.anIntArray70[1] = 795;
     		entityDef.anIntArray76[2] = 35214;
         		entityDef.anIntArray70[2] = 780;
     		entityDef.anIntArray76[3] = 32882;
         		entityDef.anIntArray70[3] = 828;
     		entityDef.anIntArray76[4] = 32832;
         		entityDef.anIntArray70[4] = 828;
     		entityDef.anIntArray76[5] = 35461;
         		entityDef.anIntArray70[5] = 774;
     		entityDef.anIntArray76[6] = 35216;
         		entityDef.anIntArray70[6] = 782;
     		entityDef.anIntArray76[7] = 30885;
         		entityDef.anIntArray70[7] = 794;
     		entityDef.anIntArray76[8] = 34568;
         		entityDef.anIntArray70[8] = 780;
     		entityDef.anIntArray76[9] = 34454;
         		entityDef.anIntArray70[9] = 794;
     		entityDef.aByte68 = 1;
     		entityDef.anInt91 = 130;
     		entityDef.anInt86 = 130;
     		entityDef.standAnim = 808;//stand animation
     		entityDef.walkAnim  = 819;//walk animation
     		entityDef.name = "Cruor";
     		entityDef.combatLevel = 285;
     	}
     	if(i == 2588) {
     		entityDef.itemActions = new String[5];
     		entityDef.itemActions[1] = "Attack";
     		entityDef.anIntArray94 = new int[2];
     		entityDef.anIntArray94[0] = 62747;
     		entityDef.anIntArray94[1] = 62734;
     		entityDef.anIntArray70 = new int[10];
         		entityDef.anIntArray76 = new int[10];
         		entityDef.anIntArray76[0] = 33893;
         		entityDef.anIntArray70[0] = 80;	
     		entityDef.anIntArray76[1] = 34853;
         		entityDef.anIntArray70[1] = 45;
     		entityDef.anIntArray76[2] = 35214;
         		entityDef.anIntArray70[2] = 25;
     		entityDef.anIntArray76[3] = 32882;
         		entityDef.anIntArray70[3] = 68;
     		entityDef.anIntArray76[4] = 32832;
         		entityDef.anIntArray70[4] = 68;
     		entityDef.anIntArray76[5] = 35461;
         		entityDef.anIntArray70[5] = 20;
     		entityDef.anIntArray76[6] = 35216;
         		entityDef.anIntArray70[6] = 30;
     		entityDef.anIntArray76[7] = 30885;
         		entityDef.anIntArray70[7] = 45;
     		entityDef.anIntArray76[8] = 34568;
         		entityDef.anIntArray70[8] = 30;
     		entityDef.anIntArray76[9] = 34454;
         		entityDef.anIntArray70[9] = 45;
     		entityDef.aByte68 = 1;
     		entityDef.anInt91 = 130;
     		entityDef.anInt86 = 130;
     		entityDef.standAnim = 808;//stand animation
     		entityDef.walkAnim  = 819;//walk animation
     		entityDef.name = "Fumus";
     		entityDef.combatLevel = 285;
     	}
     	if(i == 2589) {
     		entityDef.itemActions = new String[5];
     		entityDef.itemActions[1] = "Attack";
     		entityDef.anIntArray94 = new int[2];
     		entityDef.anIntArray94[0] = 62747;
     		entityDef.anIntArray94[1] = 62734;
     		entityDef.anIntArray70 = new int[10];
         		entityDef.anIntArray76 = new int[10];
         		entityDef.anIntArray76[0] = 33893;
         		entityDef.anIntArray70[0] = 50360;
     		entityDef.anIntArray76[1] = 34853;
         		entityDef.anIntArray70[1] = 48550;
     		entityDef.anIntArray76[2] = 35214;
         		entityDef.anIntArray70[2] = 15;
     		entityDef.anIntArray76[3] = 32882;
         		entityDef.anIntArray70[3] = 48540;
     		entityDef.anIntArray76[4] = 32832;
         		entityDef.anIntArray70[4] = 48540;
     		entityDef.anIntArray76[5] = 35461;
         		entityDef.anIntArray70[5] = 10;
     		entityDef.anIntArray76[6] = 35216;
         		entityDef.anIntArray70[6] = 4506;
     		entityDef.anIntArray76[7] = 30885;
         		entityDef.anIntArray70[7] = 48550;
     		entityDef.anIntArray76[8] = 34568;
         		entityDef.anIntArray70[8] = 50074;
     		entityDef.anIntArray76[9] = 34454;
         		entityDef.anIntArray70[9] = 48550;
     		entityDef.aByte68 = 1;
     		entityDef.anInt91 = 130;
     		entityDef.anInt86 = 130;
     		entityDef.standAnim = 808;//stand animation
     		entityDef.walkAnim  = 819;//walk animation
     		entityDef.name = "Umbra";
     		entityDef.combatLevel = 285;
     	}
 		if(i == 2636){
 	entityDef.anIntArray94 = new int[1];
 	entityDef.anIntArray94[0] = 62717;
 	entityDef.name = "Nex";
 	entityDef.aByte68 = 3;
 	entityDef.itemActions = new String[5];
 	entityDef.itemActions[1] = "Attack";
 	entityDef.aBoolean87 = true;
 	entityDef.combatLevel = 1001;
 	entityDef.aBoolean93 = true;
 	entityDef.anInt85 = 10;
 	entityDef.anInt92 = 50;
 	entityDef.anInt75 = 15;
 	entityDef.anInt79 = 32;
 	entityDef.aBoolean84 = true;
 		}
			if (i == 1167) {
	  entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
		if (i == 553) {
	  entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
	
		if (i == 7143) {
	entityDef.name = "FireMaker";
	  entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
		if (i == 794) {
	entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
	}
		if (i == 219) {
	entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
	}
	if (i == 3920) {
	entityDef.name = "Fletcher";
	entityDef.itemActions[3] = "Buy Skillcape";
	}
		if (i == 1911) {
		entityDef.name = "Phoenix";
	        entityDef.description = "A fire bird, dropping the rarest items in Pandemic.".getBytes();
		entityDef.itemActions = new String[5];
		entityDef.itemActions[1] = "Attack";
 		}
	
				           if (i == 4295) {
		entityDef.name = "Thief";
	  entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
	
			           if (i == 455) {
	  entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
	 if (i == 9085) {
	entityDef.itemActions[3] = "FrostDrags";
    }
		           if (i == 3299) {
      entityDef.name = "Farmer";
	  entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
	           if (i == 4906) {
      entityDef.name = "Woodcutter";
	  entityDef.itemActions[2] = "Trade";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
	
		           if (i == 569) {
      entityDef.name = "Crafter";
	entityDef.itemActions[3] = "Buy Skillcape";
    }
	
	            if (i == 33) {
      entityDef.name = "Bank server";
      entityDef.combatLevel = 9000;
    }
        if(i == 1225)
        {
            entityDef.name = "Bryan the Vampire";
            entityDef.combatLevel = 341;
        }
        if(i == 3109)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Attack";
            entityDef.name = "I don't remember my name";
            entityDef.combatLevel = 389;
        }
        if(i == 4477)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Attack";
            entityDef.name = "Barebones";
            entityDef.combatLevel = 941;
        }
        if(i == 879)
        {
            entityDef.name = "Pim the Delrith";
            entityDef.combatLevel = 341;
        }
        if(i == 2134)
        {
            entityDef.name = "Terrance the Rage";
            entityDef.combatLevel = 119;
        }
        if(i == 2579)
        {
            entityDef.name = "Mandrith";
            entityDef.aByte68 = 1;
            entityDef.standAnim = 2715;
            entityDef.walkAnim = 2715;
            entityDef.itemActions = new String[5];
            entityDef.itemActions[0] = "Sell Artifacts";
            entityDef.combatLevel = 0;
            entityDef.anInt91 = 130;
            entityDef.anInt86 = 130;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 30182;
        }
        if(i == 2577)
        {
            entityDef.name = "Harry";
            entityDef.aByte68 = 1;
            entityDef.combatLevel = 0;
            entityDef.anInt91 = 130;
            entityDef.walkAnim = 819;
            entityDef.anInt86 = 180;
            entityDef.standAnim = 2715;
            entityDef.walkAnim = 2715;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 29909;
        }
        if(i == 2578)
        {
            entityDef.name = "Nastroth";
            entityDef.aByte68 = 1;
            entityDef.combatLevel = 0;
            entityDef.anInt91 = 130;
            entityDef.anInt86 = 130;
            entityDef.standAnim = 2715;
            entityDef.walkAnim = 2715;
            entityDef.itemActions = new String[5];
            entityDef.itemActions[0] = "Open SSP Shop";
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 40058;
        }
        if(i == 2580)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Attack";
            entityDef.name = "Lucien";
            entityDef.aByte68 = 4;
            entityDef.combatLevel = 0;
            entityDef.anInt91 = 130;
            entityDef.anInt86 = 130;
            entityDef.walkAnim = 10764;
            entityDef.standAnim = 10763;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 44701;
        }
        if(i == 5247)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Attack";
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 40955;
            entityDef.standAnim = 10056;
            entityDef.walkAnim = 10055;
            entityDef.name = "Corporeal Beast";
            entityDef.combatLevel = 785;
            entityDef.description = "A vision of supernatural horror.".getBytes();
        }
        if(i == 3592)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[2] = "Special Move";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 31101;
            entityDef.standAnim = 6374;
            entityDef.walkAnim = 6373;
            entityDef.name = "Unicorn Stallion";
            entityDef.combatLevel = 70;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if(i == 1282)
        {
            entityDef.name = "Summoning Master";
            entityDef.itemActions[2] = "Refill-BoB";
            entityDef.itemActions[3] = "Open Pouch Shop";
        }
        if(i == 243)
        {
            entityDef.name = "Dungeoneering Master";
            entityDef.itemActions[2] = "Start Dungeoneering";
            entityDef.itemActions[3] = "Open Token Shop";
        }
        if(i == 3591)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[2] = "Special Move";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 30469;
            entityDef.standAnim = 8186;
            entityDef.walkAnim = 8189;
            entityDef.name = "Steel Titan";
            entityDef.combatLevel = 175;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if(i == 3587)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Take BoB";
            entityDef.itemActions[2] = "Store";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 30460;
            entityDef.standAnim = 8284;
            entityDef.walkAnim = 8281;
            entityDef.name = "War tortoise";
            entityDef.anInt91 = 129;
            entityDef.anInt86 = 129;
            entityDef.combatLevel = 86;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if(i == 3588)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[2] = "Teleport";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 31132;
            entityDef.standAnim = 5225;
            entityDef.walkAnim = 5226;
            entityDef.name = "Spirit Ghraak";
            entityDef.anInt91 = 129;
            entityDef.anInt86 = 129;
            entityDef.combatLevel = 51;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if(i == 3593)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[2] = "Special move";
            entityDef.anInt91 = 129;
            entityDef.anInt86 = 129;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 30475;
            entityDef.standAnim = 8301;
            entityDef.walkAnim = 8302;
            entityDef.aBoolean87 = false;
            entityDef.name = "Wolpertinger";
            entityDef.combatLevel = 51;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if(i == 3590)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[2] = "Take-Supplies";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 30460;
            entityDef.standAnim = 8284;
            entityDef.walkAnim = 8281;
            entityDef.name = "War tortoise";
            entityDef.anInt91 = 129;
            entityDef.anInt86 = 129;
            entityDef.combatLevel = 86;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if(i == 3586)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Take BoB";
            entityDef.itemActions[2] = "Store";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 31096;
            entityDef.standAnim = 1008;
            entityDef.walkAnim = 1007;
            entityDef.anInt91 = 129;
            entityDef.anInt86 = 129;
            entityDef.name = "Spirit terrorbird";
            entityDef.combatLevel = 62;
            entityDef.description = "A Bank That Follows You.".getBytes();
        }
        if(i == 3596)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[2] = "Take-Supplies";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 31096;
            entityDef.standAnim = 1008;
            entityDef.walkAnim = 1007;
            entityDef.anInt91 = 129;
            entityDef.anInt86 = 129;
            entityDef.name = "Spirit terrorbird";
            entityDef.combatLevel = 62;
            entityDef.description = "A Bank That Follows You.".getBytes();
        }
        if(i == 3594)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[2] = "Take-Supplies";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 23892;
            entityDef.standAnim = 5785;
            entityDef.walkAnim = 5781;
            entityDef.name = "Pack-yak";
            entityDef.combatLevel = 175;
            entityDef.description = "Summoning Bank.".getBytes();
        }
        if(i == 3595)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Take BoB";
            entityDef.itemActions[2] = "Store";
            entityDef.aBoolean87 = false;
            entityDef.anIntArray94 = new int[1];
            entityDef.anIntArray94[0] = 23892;
            entityDef.standAnim = 5785;
            entityDef.walkAnim = 5781;
            entityDef.name = "Pack-yak";
            entityDef.combatLevel = 175;
            entityDef.description = "Summoning Bank.".getBytes();
        }
        if(i == 1155)
        {
            entityDef.itemActions = new String[5];
            entityDef.itemActions[1] = "Attack";
            entityDef.name = "Tormented Demon";
            entityDef.combatLevel = 450;
            entityDef.anIntArray94 = new int[1];
            entityDef.standAnim = 10921;
            entityDef.walkAnim = 10920;
            entityDef.anIntArray94[0] = 44733;
            entityDef.description = "Dangerous shit bro...".getBytes();
        }
        return entityDef;
    }

    public Model method160()
    {
        if(childrenIDs != null)
        {
            EntityDef entityDef = method161();
            if(entityDef == null)
                return null;
            else
                return entityDef.method160();
        }
        if(anIntArray73 == null)
            return null;
        boolean flag1 = false;
        for(int i = 0; i < anIntArray73.length; i++)
            if(!Model.method463(anIntArray73[i]))
                flag1 = true;

        if(flag1)
            return null;
        Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray73.length];
        for(int j = 0; j < anIntArray73.length; j++)
            aclass30_sub2_sub4_sub6s[j] = Model.method462(anIntArray73[j]);

        Model model;
        if(aclass30_sub2_sub4_sub6s.length == 1)
            model = aclass30_sub2_sub4_sub6s[0];
        else
            model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
        if(anIntArray76 != null)
        {
            for(int k = 0; k < anIntArray76.length; k++)
                model.method476(anIntArray76[k], anIntArray70[k]);

        }
        return model;
    }

    public EntityDef method161()
    {
        int j;
        try
        {
            j = -1;
            if(anInt57 != -1)
            {
                VarBit varBit = VarBit.cache[anInt57];
                int k = varBit.anInt648;
                int l = varBit.anInt649;
                int i1 = varBit.anInt650;
                int j1 = client.anIntArray1232[i1 - l];
                j = clientInstance.variousSettings[k] >> l & j1;
            } else
            if(anInt59 != -1)
                j = clientInstance.variousSettings[anInt59];
            if(j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
                return null;
        }
        catch(Exception e)
        {
            return null;
        }
        return forID(childrenIDs[j]);
    }

    public static void unpackConfig(StreamLoader streamLoader)
    {
        stream = new Stream(streamLoader.getDataForName("npc.dat"));
        Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
        int totalNPCs = stream2.readUnsignedWord();
        System.out.println((new StringBuilder()).append("602 NPC Amount: ").append(totalNPCs).toString());
        streamIndices = new int[totalNPCs];
        int i = 2;
        for(int j = 0; j < totalNPCs; j++)
        {
            streamIndices[j] = i;
            i += stream2.readUnsignedWord();
        }

        cache = new EntityDef[20];
        for(int k = 0; k < 20; k++)
            cache[k] = new EntityDef();

    }

    public static void nullLoader()
    {
        mruNodes = null;
        streamIndices = null;
        cache = null;
        stream = null;
    }

    public Model method164(int j, int k, int ai[])
    {
        if(childrenIDs != null)
        {
            EntityDef entityDef = method161();
            if(entityDef == null)
                return null;
            else
                return entityDef.method164(j, k, ai);
        }
        Model model = (Model)mruNodes.insertFromCache(type);
        if(model == null)
        {
            boolean flag = false;
            for(int i1 = 0; i1 < anIntArray94.length; i1++)
                if(!Model.method463(anIntArray94[i1]))
                    flag = true;

            if(flag)
                return null;
            Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray94.length];
            for(int j1 = 0; j1 < anIntArray94.length; j1++)
                aclass30_sub2_sub4_sub6s[j1] = Model.method462(anIntArray94[j1]);

            if(aclass30_sub2_sub4_sub6s.length == 1)
                model = aclass30_sub2_sub4_sub6s[0];
            else
                model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
            if(anIntArray76 != null)
            {
                for(int k1 = 0; k1 < anIntArray76.length; k1++)
                    model.method476(anIntArray76[k1], anIntArray70[k1]);

            }
            model.method469();
            model.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
            mruNodes.removeFromCache(model, type);
        }
        Model model_1 = Model.aModel_1621;
        model_1.method464(model, Class36.method532(k) & Class36.method532(j));
        if(k != -1 && j != -1)
            model_1.method471(ai, j, k);
        else
        if(k != -1)
            model_1.method470(k);
        if(anInt91 != 128 || anInt86 != 128)
            model_1.method478(anInt91, anInt91, anInt86);
        model_1.method466();
        model_1.anIntArrayArray1658 = (int[][])null;
        model_1.anIntArrayArray1657 = (int[][])null;
        if(aByte68 == 1)
            model_1.aBoolean1659 = true;
        return model_1;
    }

    public void readValues(Stream stream)
    {
        do
        {
            int i = stream.readUnsignedByte();
            if(i == 0)
                return;
            if(i == 1)
            {
                int j = stream.readUnsignedByte();
                anIntArray94 = new int[j];
                int j1 = 0;
                while(j1 < j) 
                {
                    anIntArray94[j1] = stream.readUnsignedWord();
                    if(type == 55L)
                        System.out.println(anIntArray94[j1]);
                    j1++;
                }
            } else
            if(i == 2)
                name = stream.readString();
            else
            if(i == 3)
                description = stream.readBytes();
            else
            if(i == 12)
                aByte68 = stream.readSignedByte();
            else
            if(i == 13)
                standAnim = stream.readUnsignedWord();
            else
            if(i == 14)
                walkAnim = stream.readUnsignedWord();
            else
            if(i == 17)
            {
                walkAnim = stream.readUnsignedWord();
                anInt58 = stream.readUnsignedWord();
                anInt83 = stream.readUnsignedWord();
                anInt55 = stream.readUnsignedWord();
                if(walkAnim == 65535)
                    walkAnim = -1;
                if(anInt58 == 65535)
                    anInt58 = -1;
                if(anInt83 == 65535)
                    anInt83 = -1;
                if(anInt55 == 65535)
                    anInt55 = -1;
            } else
            if(i >= 30 && i < 40)
            {
                if(itemActions == null)
                    itemActions = new String[5];
                itemActions[i - 30] = stream.readString();
                if(itemActions[i - 30].equalsIgnoreCase("hidden"))
                    itemActions[i - 30] = null;
            } else
            if(i == 40)
            {
                int k = stream.readUnsignedByte();
                anIntArray70 = new int[k];
                anIntArray76 = new int[k];
                int k1 = 0;
                while(k1 < k) 
                {
                    anIntArray76[k1] = stream.readUnsignedWord();
                    anIntArray70[k1] = stream.readUnsignedWord();
                    k1++;
                }
            } else
            if(i == 60)
            {
                int l = stream.readUnsignedByte();
                anIntArray73 = new int[l];
                int l1 = 0;
                while(l1 < l) 
                {
                    anIntArray73[l1] = stream.readUnsignedWord();
                    l1++;
                }
            } else
            if(i == 90)
                stream.readUnsignedWord();
            else
            if(i == 91)
                stream.readUnsignedWord();
            else
            if(i == 92)
                stream.readUnsignedWord();
            else
            if(i == 93)
                aBoolean87 = false;
            else
            if(i == 95)
                combatLevel = stream.readUnsignedWord();
            else
            if(i == 97)
                anInt91 = stream.readUnsignedWord();
            else
            if(i == 98)
                anInt86 = stream.readUnsignedWord();
            else
            if(i == 99)
                aBoolean93 = true;
            else
            if(i == 100)
                anInt85 = stream.readSignedByte();
            else
            if(i == 101)
                anInt92 = stream.readSignedByte() * 5;
            else
            if(i == 102)
                anInt75 = stream.readUnsignedWord();
            else
            if(i == 103)
                anInt79 = stream.readUnsignedWord();
            else
            if(i == 106)
            {
                anInt57 = stream.readUnsignedWord();
                if(anInt57 == 65535)
                    anInt57 = -1;
                anInt59 = stream.readUnsignedWord();
                if(anInt59 == 65535)
                    anInt59 = -1;
                int i1 = stream.readUnsignedByte();
                childrenIDs = new int[i1 + 1];
                int i2 = 0;
                while(i2 <= i1) 
                {
                    childrenIDs[i2] = stream.readUnsignedWord();
                    if(childrenIDs[i2] == 65535)
                        childrenIDs[i2] = -1;
                    i2++;
                }
            } else
            if(i == 107)
                aBoolean84 = false;
        } while(true);
    }

    public EntityDef()
    {
        anInt55 = -1;
        anInt57 = -1;
        anInt58 = -1;
        anInt59 = -1;
        combatLevel = -1;
        walkAnim = -1;
        aByte68 = 1;
        anInt75 = -1;
        standAnim = -1;
        type = -1L;
        anInt79 = 32;
        anInt83 = -1;
        aBoolean84 = true;
        anInt86 = 128;
        aBoolean87 = true;
        anInt91 = 128;
        aBoolean93 = false;
    }

    public static int NPCAMOUNT = 11599;
    public int anInt55;
    public static int anInt56;
    public int anInt57;
    public int anInt58;
    public int anInt59;
    public static Stream stream;
    public int combatLevel;
    public final int anInt64 = 1834;
    public String name;
    public String itemActions[];
    public int walkAnim;
    public byte aByte68;
    public int anIntArray70[];
    public static int streamIndices[];
    public int anIntArray73[];
    public int anInt75;
    public int anIntArray76[];
    public int standAnim;
    public long type;
    public int anInt79;
    public static EntityDef cache[];
    public static client clientInstance;
    public int anInt83;
    public boolean aBoolean84;
    public int anInt85;
    public int anInt86;
    public boolean aBoolean87;
    public int childrenIDs[];
    public byte description[];
    public int anInt91;
    public int anInt92;
    public boolean aBoolean93;
    public int anIntArray94[];
    public static MRUNodes mruNodes = new MRUNodes(30);

}
