package com;
public class ItemDef_3
{

   private ItemDef_3()
   {
    }

    public static ItemDef itemDef(int i, ItemDef itemdef) {
   
		   if (i == 15078)
    {
      itemdef.name = "Ring of Morphing";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelID = 5163;
      itemdef.modelZoom = 350;
      itemdef.modelRotation1 = 322;
      itemdef.modelRotation2 = 135;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 1;
    }
		   if (i == 806)
		    {
		      itemdef.name = "DeathTouch Dart";
		      itemdef.description = ""+ itemdef.name +". Will insta-kill any type of NPC and has multiple uses.";
		    }
		   if (i == 19138)
		    {
		      itemdef.name = "Prayer Cape";
		      itemdef.description = ""+ itemdef.name +". A cape with an amazing prayer bonus.";
		    }
        switch(itemdef.id)
        {
			 case 17848:
      itemdef.modelID = 78021;
      itemdef.name = "Blazing Sword";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 2000;
      itemdef.modelRotation1 = 228;
      itemdef.modelRotation2 = 1985;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = -55;
      //localJI.D = true;
      itemdef.anInt165 = 78020;
      itemdef.anInt200 = 78020;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.stackable = false;
      break;
	  case 989:
	   itemdef.stackable = true;
	  break;
	   case 14921://989
      itemdef.modelID = 49026;
      itemdef.name = "Guitar";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.stackable = false;
      itemdef.modelZoom = 1500;
      itemdef.modelRotation1 = 228;
      itemdef.modelRotation2 = 1830;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = -55;
      itemdef.anInt165 = 49026;
      itemdef.anInt200 = 49026;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Destroy";
      break;
	   case 14445:
      itemdef.modelID = 75122;
      itemdef.name = "Minecraft Sword";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1755;
      itemdef.stackable = false;
      itemdef.modelRotation1 = 431;
      itemdef.modelRotation2 = 545;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 75123;
      itemdef.anInt200 = 75123;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Destroy";
      break;
	   case 17854:
      itemdef.modelID = 78028;
      itemdef.name = "Brutal longsword ( offhand )";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1447;
      itemdef.modelRotation1 = 444;
      itemdef.modelRotation2 = 1217;
      itemdef.modelOffset1 = -5;
      itemdef.modelOffset2 = -4;
      //localJI.D = true;
      itemdef.anInt165 = 78028;
      itemdef.anInt200 = 78028;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.stackable = false;
      break;
	   /*case 17584:
		      itemdef.modelID = 82520;
		      itemdef.name = "Golden longsword ( offhand )";
		      itemdef.description = ""+ itemdef.name +"";
		      itemdef.modelZoom = 1447;
		      itemdef.modelRotation1 = 444;
		      itemdef.modelRotation2 = 1217;
		      itemdef.modelOffset1 = -5;
		      itemdef.modelOffset2 = -4;
		      //localJI.D = true;
		      itemdef.anInt165 = 82520;
		      itemdef.anInt200 = 82520;
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
		      itemdef.stackable = false;
		      break;*/
	    case 11307:
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.modelID = 78090;
      itemdef.modelZoom = 1385;
      itemdef.modelRotation1 = 500;
      itemdef.modelRotation2 = 2000;
      itemdef.anInt165 = 78091;
      itemdef.anInt200 = 78091;
      itemdef.stackable = false;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -3;
      itemdef.name = "Elimination DeathCape";
      itemdef.description = ""+ itemdef.name +"";
      break;
    case 11317:
      itemdef.name = "Elimination Helm";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 789;
      itemdef.modelRotation1 = 69;
      itemdef.modelRotation2 = 1743;
      itemdef.modelOffset1 = -4;
      itemdef.modelOffset2 = -3;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      itemdef.modelID = 34411;
      itemdef.anInt165 = 6775;
      itemdef.anInt200 = 6775;
      break;
    case 11318:
      itemdef.name = "Elimination platebody";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -1;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      itemdef.modelID = 54171;
      itemdef.anInt165 = 56539;
      itemdef.anInt200 = 56539;
      break;
    case 11319:
      itemdef.name = "Elimination platelegs";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 406;
      itemdef.modelRotation2 = 2041;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.groundActions = new String[] { null, null, "Take", null, null };
      itemdef.itemActions = new String[] { null, "Wear", "Split", null, "Drop" };
      itemdef.modelID = 54012;
      itemdef.anInt165 = 55818;
      itemdef.anInt200 = 55818;
      break;
    case 11312:
      itemdef.modelID = 54445;
      itemdef.name = "Elimination Kiteshield";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1616;
      itemdef.modelRotation1 = 396;
      itemdef.modelRotation2 = 1050;
      itemdef.modelOffset2 = -3;
      itemdef.modelOffset1 = 4;
      itemdef.anInt165 = 56075;
      itemdef.anInt200 = 56075;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
	    case 8804:
      itemdef.modelID = 77015;
      itemdef.name = "Beatz full helm";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 77014;
      itemdef.anInt200 = 77014;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 8805:
      itemdef.modelID = 77013;
      itemdef.name = "Beatz platelegs";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 77012;
      itemdef.anInt200 = 77012;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 8806:
      itemdef.modelID = 77011;
      itemdef.name = "Beatz platebody";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 77010;
      itemdef.anInt200 = 77010;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
	   case 8807:
		      itemdef.modelID = 77021;
		      itemdef.name = "Vortex full helm";
		      itemdef.description = ""+ itemdef.name +"";
		      itemdef.modelZoom = 676;
		      itemdef.modelRotation1 = 0;
		      itemdef.modelRotation2 = 0;
		      itemdef.modelOffset1 = 3;
		      itemdef.modelOffset2 = -14;
		      itemdef.anInt165 = 77020;
		      itemdef.anInt200 = 77020;
		      itemdef.groundActions = new String[5];
		      itemdef.groundActions[2] = "Take";
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
		      itemdef.itemActions[2] = "Check-charges";
		      itemdef.itemActions[4] = "Drop";
		      break;
		    case 8808:
		      itemdef.modelID = 77019;
		      itemdef.name = "Vortex platelegs";
		      itemdef.description = ""+ itemdef.name +"";
		      itemdef.modelZoom = 1550;
		      itemdef.modelRotation1 = 344;
		      itemdef.modelRotation2 = 186;
		      itemdef.modelOffset1 = 5;
		      itemdef.modelOffset2 = 11;
		      itemdef.anInt165 = 77018;
		      itemdef.anInt200 = 77018;
		      itemdef.groundActions = new String[5];
		      itemdef.groundActions[2] = "Take";
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
		      itemdef.itemActions[2] = "Check-charges";
		      itemdef.itemActions[4] = "Drop";
		      break;
		    case 8809:
		      itemdef.modelID = 77017;
		      itemdef.name = "Vortex platebody";
		      itemdef.description = ""+ itemdef.name +"";
		      itemdef.modelZoom = 1513;
		      itemdef.modelRotation1 = 566;
		      itemdef.modelRotation2 = 0;
		      itemdef.modelOffset1 = 1;
		      itemdef.modelOffset2 = -8;
		      itemdef.anInt165 = 77016;
		      itemdef.anInt200 = 77016;
		      itemdef.groundActions = new String[5];
		      itemdef.groundActions[2] = "Take";
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
		      itemdef.itemActions[2] = "Check-charges";
		      itemdef.itemActions[4] = "Drop";
		      break;
			   case 8816:
				      itemdef.modelID = 85041;
				      itemdef.name = "Starter full helm";
				      itemdef.description = ""+ itemdef.name +"";
				      itemdef.modelZoom = 676;
				      itemdef.modelRotation1 = 0;
				      itemdef.modelRotation2 = 0;
				      itemdef.modelOffset1 = 3;
				      itemdef.modelOffset2 = -14;
				      itemdef.anInt165 = 85040;
				      itemdef.anInt200 = 85040;
				      itemdef.groundActions = new String[5];
				      itemdef.groundActions[2] = "Take";
				      itemdef.itemActions = new String[5];
				      itemdef.itemActions[1] = "Wear";
				      itemdef.itemActions[2] = "Check-charges";
				      itemdef.itemActions[4] = "Drop";
				      break;
				    case 8817:
				      itemdef.modelID = 85039;
				      itemdef.name = "Starter platelegs";
				      itemdef.description = ""+ itemdef.name +"";
				      itemdef.modelZoom = 1550;
				      itemdef.modelRotation1 = 344;
				      itemdef.modelRotation2 = 186;
				      itemdef.modelOffset1 = 5;
				      itemdef.modelOffset2 = 11;
				      itemdef.anInt165 = 85038;
				      itemdef.anInt200 = 85038;
				      itemdef.groundActions = new String[5];
				      itemdef.groundActions[2] = "Take";
				      itemdef.itemActions = new String[5];
				      itemdef.itemActions[1] = "Wear";
				      itemdef.itemActions[2] = "Check-charges";
				      itemdef.itemActions[4] = "Drop";
				      break;
				    case 8818:
				      itemdef.modelID = 85037;
				      itemdef.name = "Starter platebody";
				      itemdef.description = ""+ itemdef.name +"";
				      itemdef.modelZoom = 1513;
				      itemdef.modelRotation1 = 566;
				      itemdef.modelRotation2 = 0;
				      itemdef.modelOffset1 = 1;
				      itemdef.modelOffset2 = -8;
				      itemdef.anInt165 = 85036;
				      itemdef.anInt200 = 85036;
				      itemdef.groundActions = new String[5];
				      itemdef.groundActions[2] = "Take";
				      itemdef.itemActions = new String[5];
				      itemdef.itemActions[1] = "Wear";
				      itemdef.itemActions[2] = "Check-charges";
				      itemdef.itemActions[4] = "Drop";
				      break;
	   case 8810:
      itemdef.modelID = 77026;
      itemdef.name = "Capto full helm";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 77025;
      itemdef.anInt200 = 77025;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 8811:
      itemdef.modelID = 77024;
      itemdef.name = "Capto platelegs";
      itemdef.description = ""+ itemdef.name +" -   1.500b";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 77023;
      itemdef.anInt200 = 77023;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 8812:
      itemdef.modelID = 77022;
      itemdef.name = "Capto platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 77027;
      itemdef.anInt200 = 77027;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
	   case 8813:
      itemdef.modelID = 77033;
      itemdef.name = "Nation full helm";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 77032;
      itemdef.anInt200 = 77032;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 8814:
      itemdef.modelID = 77031;
      itemdef.name = "Nation platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 77030;
      itemdef.anInt200 = 77030;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 8815:
      itemdef.modelID = 77029;
      itemdef.name = "Nation platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 77028;
      itemdef.anInt200 = 77028;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
	   case 11615:
      itemdef.modelID = 77051;
      itemdef.name = "Apoc full helm";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 77050;
      itemdef.anInt200 = 77050;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 11616:
      itemdef.modelID = 77049;
      itemdef.name = "Apoc platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 77048;
      itemdef.anInt200 = 77048;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 11614:
      itemdef.modelID = 77047;
      itemdef.name = "Apoc platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 77046;
      itemdef.anInt200 = 77046;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
	    case 4629: //75
      itemdef.modelID = 55048;
      itemdef.name = "Fire Torva Full Helm";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 55047;
      itemdef.anInt200 = 55047;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
    case 4741:
      itemdef.modelID = 55049;
      itemdef.name = "Fire Torva Platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 55050;
      itemdef.anInt200 = 55050;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
	  itemdef.stackable = false;
      break;
    case 4742:
      itemdef.modelID = 55045;
      itemdef.name = "Fire Torva Platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 55046;
      itemdef.anInt200 = 55046;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
	  itemdef.stackable = false;
      break;
    case 4743:
      itemdef.modelID = 55071;
      itemdef.name = "Fire Torva Whip";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 900;
      itemdef.modelRotation1 = 324;
      itemdef.modelRotation2 = 1808;
      itemdef.modelOffset1 = -2;
      itemdef.modelOffset2 = 3;
      itemdef.anInt165 = 55072;
      itemdef.anInt200 = 55072;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wield";
      itemdef.itemActions[4] = "Drop";
      itemdef.stackable = false;
      break;
    case 4744:
      itemdef.modelID = 55074;
      itemdef.name = "Fire Torva Wings";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1700;
      itemdef.modelRotation1 = 500;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = -6;
      itemdef.modelOffset2 = 1;
      itemdef.anInt165 = 55073;
      itemdef.anInt165 = 55073;
      itemdef.itemActions = new String[] { null, "Wear", null, null, "drop" };
      itemdef.groundActions = new String[] { null, null, "take", null, null };
	  itemdef.stackable = false;
      break;
    case 4626:
      itemdef.name = "Fire Torva Gloves";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 760;
      itemdef.modelRotation1 = 165;
      itemdef.modelRotation2 = 99;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -7;
      itemdef.groundActions = new String[] { null, null, "Take", null, null };
      itemdef.itemActions = new String[] { null, "Wear", "Split", null, "Drop" };
      itemdef.modelID = 55099;
      itemdef.anInt165 = 55098;
      itemdef.anInt200 = 55098;
      break;
	   case 10708:
      itemdef.modelID = 62857;
      itemdef.name = "Completionest full helm";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 62856;
      itemdef.anInt200 = 62856;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19266:
      itemdef.modelID = 62855;
      itemdef.name = "Completionest platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 62854;
      itemdef.anInt200 = 62854;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19263:
      itemdef.modelID = 62853;
      itemdef.name = "Completionest platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 62852;
      itemdef.anInt200 = 62852;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
	   case 10707:
      itemdef.modelID = 62849;
      itemdef.name = "Max full helm";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 62848;
      itemdef.anInt200 = 62848;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19245:
      itemdef.modelID = 62841;
      itemdef.name = "Max platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 62840;
      itemdef.anInt200 = 62840;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19242:
      itemdef.modelID = 62847;
      itemdef.name = "Max platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 62846;
      itemdef.anInt200 = 62846;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 14998:
        itemdef.modelID = 62714;
        itemdef.name = "Torva full helm";
        itemdef.modelZoom = 672;
        itemdef.modelRotation2 = 85;
        itemdef.modelRotation1 = 1867;
        itemdef.modelOffset1 = 0;
        itemdef.modelOffset2 = -3;
        itemdef.anInt165 = 62738;
        itemdef.anInt200 = 62754;
        itemdef.groundActions = new String[5];
        itemdef.groundActions[2] = "Take";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[1] = "Wear";
        itemdef.itemActions[2] = "Evolve";
        itemdef.itemActions[4] = "Drop";
    break;

case 14999:
        itemdef.modelID = 62701;
        itemdef.name = "Torva platelegs";
        itemdef.modelZoom = 1740;
        itemdef.modelRotation2 = 474;
        itemdef.modelRotation1 = 2045;
        itemdef.modelOffset1 = 0;
        itemdef.modelOffset2 = -5;
        itemdef.anInt165 = 62743;
        itemdef.anInt200 = 62760;
        itemdef.groundActions = new String[5];
        itemdef.groundActions[2] = "Take";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[1] = "Wear";
        itemdef.itemActions[2] = "Evolve";
        itemdef.itemActions[4] = "Drop";
    break;
	   case 10705:
      itemdef.modelID = 62835;
      itemdef.name = "BeastMaster full helm";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 676;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -14;
      itemdef.anInt165 = 62834;
      itemdef.anInt200 = 62834;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19203:
      itemdef.modelID = 62833;
      itemdef.name = "BeastMaster platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 344;
      itemdef.modelRotation2 = 186;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 62930;
      itemdef.anInt200 = 62930;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19200:
      itemdef.modelID = 62832;
      itemdef.name = "BeastMaster platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 62831;
      itemdef.anInt200 = 62831;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 15038:
      itemdef.name = "BeastMaster Gloves";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelID = 62839;
      itemdef.modelZoom = 900;
      itemdef.modelRotation1 = 165;
      itemdef.modelRotation2 = 99;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -7;
      itemdef.anInt165 = 62838;
      itemdef.anInt200 = 62838;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      break;
    case 15037:
      itemdef.name = "BeastMaster Boots";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelID = 62837;
      itemdef.modelZoom = 900;
      itemdef.modelRotation1 = 165;
      itemdef.modelRotation2 = 99;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -7;
      itemdef.anInt165 = 62836;
      itemdef.anInt200 = 62836;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      break;
	     case 19107:
      itemdef.modelID = 64046;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      itemdef.modelZoom = 2300;
      itemdef.modelRotation1 = 176;
      itemdef.modelRotation2 = 1850;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = 1;
      itemdef.stackable = false;
      itemdef.anInt165 = 64047;
      itemdef.anInt200 = 64047;
      itemdef.name = "Tzhaar wings";
      itemdef.description = ""+ itemdef.name +" ";
      break;
	   case 19063:
      itemdef.modelID = 64016;
      itemdef.name = "Tzhaar full helm";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 800;
      itemdef.modelRotation1 = 406;
      itemdef.modelRotation2 = 2041;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -4;
      itemdef.anInt165 = 64017;
      itemdef.anInt200 = 64017;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19062:
      itemdef.modelID = 64008;
      itemdef.name = "Tzhaar platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 64009;
      itemdef.anInt200 = 64009;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19061:
      itemdef.modelID = 64010;
      itemdef.name = "Tzhaar platelegs";
      itemdef.description = "Tzhaar platelegs ";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 406;
      itemdef.modelRotation2 = 2041;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 64011;
      itemdef.anInt200 = 64011;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19060:
      itemdef.name = "Tzhaar gloves";
      itemdef.description = "Tzhaar gloves ";
      itemdef.modelZoom = 760;
      itemdef.modelRotation1 = 165;
      itemdef.modelRotation2 = 99;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -7;
      itemdef.groundActions = new String[] { null, null, "Take", null, null };
      itemdef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
      itemdef.modelID = 64014;
      itemdef.anInt165 = 64015;
      itemdef.anInt200 = 64015;
      break;
    case 19059:
      itemdef.name = "Tzhaar boots";
      itemdef.description = "Tzhaar boots ";
      itemdef.modelZoom = 400;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 3;
      itemdef.modelOffset2 = -7;
      itemdef.groundActions = new String[] { null, null, "Take", null, null };
      itemdef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
      itemdef.modelID = 64013;
      itemdef.anInt165 = 64013;
      itemdef.anInt200 = 64013;
      break;
	   case 19058:
      itemdef.itemActions = new String[] { null, "Wield", null, null, "drop" };
      itemdef.modelID = 64018;
      itemdef.modelZoom = 1700;
      itemdef.modelRotation1 = 572;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 1;
      itemdef.anInt165 = 64019;
      itemdef.anInt200 = 64019;
      itemdef.stackable = false;
      itemdef.name = "Tzhaar sword";
      itemdef.description = "Tzhaar sword ";
      break;
	  case 19943:
      itemdef.modelID = 64057;
      itemdef.name = "Blue Rain Wings";
      itemdef.description = "Blue Rain Wings ";
      itemdef.modelZoom = 1385;
      itemdef.modelRotation1 = 500;
      itemdef.modelRotation2 = 2000;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -3;
      itemdef.stackable = false;
      itemdef.modelRotation1 = 1;
      //localJI.D = true;
      itemdef.anInt165 = 64058;
      itemdef.anInt200 = 64058;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Skull";
      itemdef.itemActions[4] = "Drop";
      //localJI.M = 14;
      //localJI.s = 7;
      break;
    case 19112:
      itemdef.modelID = 64059;
      itemdef.name = "Green Rain Wings";
      itemdef.description = "Green Rain Wings ";
      itemdef.modelZoom = 1385;
      itemdef.modelRotation1 = 500;
      itemdef.modelRotation2 = 2000;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -3;
      itemdef.stackable = false;
      itemdef.modelRotation1 = 1;
      //localJI.D = true;
      itemdef.anInt165 = 64060;
      itemdef.anInt200 = 64060;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Skull";
      itemdef.itemActions[4] = "Drop";
      //localJI.M = 14;
      //localJI.s = 7;
      break;
    case 19113:
      itemdef.modelID = 64061;
      itemdef.name = "Red Rain Wings";
      itemdef.description = "Red Rain Wings ";
      itemdef.modelZoom = 1385;
      itemdef.modelRotation1 = 500;
      itemdef.modelRotation2 = 2000;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -3;
      itemdef.stackable = false;
      itemdef.modelRotation1 = 1;
      //localJI.D = true;
      itemdef.anInt165 = 64062;
      itemdef.anInt200 = 64062;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Skull";
      itemdef.itemActions[4] = "Drop";
      //localJI.M = 14;
      //localJI.s = 7;
      break;
    case 19114:
      itemdef.modelID = 64063;
      itemdef.name = "Yellow Rain Wings";
      itemdef.description = "Yellow Rain Wings ";
      itemdef.modelZoom = 1385;
      itemdef.modelRotation1 = 500;
      itemdef.modelRotation2 = 2000;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -3;
      itemdef.stackable = false;
      itemdef.modelRotation1 = 1;
      //localJI.D = true;
      itemdef.anInt165 = 64064;
      itemdef.anInt200 = 64064;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Skull";
      itemdef.itemActions[4] = "Drop";
      //localJI.M = 14;
      //localJI.s = 7;
      break;
	  	 case 15001:
      itemdef.modelID = 12323;
      itemdef.name = "Aiyana's Bow";
      itemdef.description = "Aiyana's Bow";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 12316;
      itemdef.anInt200 = 12316;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
	  
	  
    case 19825:
      itemdef.modelID = 11111;
      itemdef.name = "Asgardian Guards";
      itemdef.description = "Asgardian Guards";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 11114;
      itemdef.anInt200 = 11114;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
   case 19826:
      itemdef.modelID = 11111;
      itemdef.name = "Asgardian Platebody";
      itemdef.description = "Asgardian Platebody";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 82949;
      itemdef.anInt200 = 82949;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
 case 19827:
      itemdef.modelID = 11111;
      itemdef.name = "Asgardian Platelegs";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 11115;
      itemdef.anInt200 = 11115;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
  case 19828:
      itemdef.modelID = 11111;
      itemdef.name = "Asgardian Spine";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 11118;
      itemdef.anInt200 = 11118;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
 case 19829:
      itemdef.modelID = 11111;
      itemdef.name = "Asgardian Blindfold";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 82948;
      itemdef.anInt200 = 82948;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
  case 15002:
      itemdef.modelID = 12276;
      itemdef.name = "Aiyana mask";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 672;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -3;
      itemdef.anInt165 = 15002;
      itemdef.anInt200 = 15002;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
 case 15004:
      itemdef.modelID = 12278;
      itemdef.name = "Aiyana Platebody";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 15004;
      itemdef.anInt200 = 15004;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
 case 15005:
      itemdef.modelID = 15005;
      itemdef.name = "Aiyana platelegs";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -5;
      itemdef.anInt165 = 15005;
      itemdef.anInt200 = 15005;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
	   case 19090:
      itemdef.modelID = 62771;
      itemdef.name = "Ares full helm";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 800;
      itemdef.modelRotation1 = 406;
      itemdef.modelRotation2 = 2041;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -4;
      itemdef.anInt165 = 62770;
      itemdef.anInt200 = 62770;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19089:
      itemdef.modelID = 62767;
      itemdef.name = "Ares platebody";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 62766;
      itemdef.anInt200 = 62766;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19088:
      itemdef.modelID = 62773;
      itemdef.name = "Ares platelegs";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1550;
      itemdef.modelRotation1 = 406;
      itemdef.modelRotation2 = 2041;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = 11;
      itemdef.anInt165 = 62772;
      itemdef.anInt200 = 62772;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19087:
      itemdef.modelID = 62775;
      itemdef.name = "Ares shield";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 1616;
      itemdef.modelRotation1 = 396;
      itemdef.modelRotation2 = 1050;
      itemdef.modelOffset2 = -3;
      itemdef.modelOffset1 = 4;
      itemdef.anInt165 = 62774;
      itemdef.anInt200 = 62774;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
	  case 19036:
      itemdef.modelID = 75078;
      itemdef.name = "Yellow Angel Wings";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 850;
      itemdef.modelRotation1 = 252;
      itemdef.modelRotation2 = 1020;
      itemdef.modelOffset1 = -1;
      itemdef.modelOffset2 = 24;
      itemdef.anInt165 = 75077;
      itemdef.anInt200 = 75077;
      itemdef.itemActions = new String[] { null, "Wear", null, null, "drop" };
      itemdef.groundActions = new String[] { null, null, "take", null, null };
      break;
    case 19037:
      itemdef.modelID = 75079;
      itemdef.name = "Purple Angel Wings";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 850;
      itemdef.modelRotation1 = 252;
      itemdef.modelRotation2 = 1020;
      itemdef.modelOffset1 = -1;
      itemdef.modelOffset2 = 24;
      itemdef.anInt165 = 75080;
      itemdef.anInt200 = 75080;
      itemdef.itemActions = new String[] { null, "Wear", null, null, "drop" };
      itemdef.groundActions = new String[] { null, null, "take", null, null };
      break;
    case 19038:
      itemdef.modelID = 75081;
      itemdef.name = "Pink Angel Wings";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 850;
      itemdef.modelRotation1 = 252;
      itemdef.modelRotation2 = 1020;
      itemdef.modelOffset1 = -1;
      itemdef.modelOffset2 = 24;
      itemdef.anInt165 = 75082;
      itemdef.anInt200 = 75082;
      itemdef.itemActions = new String[] { null, "Wear", null, null, "drop" };
      itemdef.groundActions = new String[] { null, null, "take", null, null };
      break;
    case 19041:
      itemdef.modelID = 75083;
      itemdef.name = "Green Angel Wings";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 850;
      itemdef.modelRotation1 = 252;
      itemdef.modelRotation2 = 1020;
      itemdef.modelOffset1 = -1;
      itemdef.modelOffset2 = 24;
      itemdef.anInt165 = 75084;
      itemdef.anInt200 = 75084;
      itemdef.itemActions = new String[] { null, "Wear", null, null, "drop" };
      itemdef.groundActions = new String[] { null, null, "take", null, null };
      break;
    case 19040:
      itemdef.modelID = 75085;
      itemdef.name = "Gold Angel Wings";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 850;
      itemdef.modelRotation1 = 252;
      itemdef.modelRotation2 = 1020;
      itemdef.modelOffset1 = -1;
      itemdef.modelOffset2 = 24;
      itemdef.anInt165 = 75086;
      itemdef.anInt200 = 75086;
      itemdef.itemActions = new String[] { null, "Wear", null, null, "drop" };
      itemdef.groundActions = new String[] { null, null, "take", null, null };
      break;
    case 19065:
      itemdef.modelID = 64006;
      itemdef.name = "Extinction platebody";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1513;
      itemdef.modelRotation1 = 566;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.modelOffset2 = -8;
      itemdef.anInt165 = 64006;
      itemdef.anInt200 = 64006;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
	   case 19944:
      itemdef.modelID = 82939;//82939
      itemdef.name = "Pandemic Archer Plate";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 82938;//82938
      itemdef.anInt200 = 62873;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19940:
      itemdef.modelID = 82941;//82941
      itemdef.name = "Pandemic Archer Platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 1740;
      itemdef.modelRotation1 = 474;
      itemdef.modelRotation2 = 2045;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -5;
      itemdef.anInt165 = 82940;//82940
      itemdef.anInt200 = 82942;//82942
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[2] = "Check-charges";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19941:
      itemdef.modelID = 62881;
      itemdef.name = "Pandemic Archer Gloves";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 548;
      itemdef.modelRotation1 = 618;
      itemdef.modelRotation2 = 1143;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -5;
      itemdef.anInt165 = 62878;
      itemdef.anInt200 = 62877;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19945:
      itemdef.modelID = 62882;//82946
      itemdef.name = "Pandemic Archer Boots";
      itemdef.modelZoom = 676;
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelRotation1 = 63;
      itemdef.modelRotation2 = 106;
      itemdef.modelOffset1 = 5;
      itemdef.modelOffset2 = -1;
      itemdef.anInt165 = 62872;//82945
      itemdef.anInt200 = 62876;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      break;
    case 19946:
      itemdef.modelID = 82936;//82936
      itemdef.name = "Pandemic Archer wings";
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelZoom = 850;
      itemdef.modelRotation1 = 252;
      itemdef.modelRotation2 = 1020;
      itemdef.modelOffset1 = -1;
      itemdef.modelOffset2 = 24;
      //localJI.D = true;
      itemdef.anInt165 = 82937;//82937
      itemdef.anInt200 = 82937;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      break;
	   case 18636:
      itemdef.modelID = 82944;//82944
      itemdef.name = "Pandemic Archer Fullhelm";
      itemdef.modelZoom = 980;
      itemdef.description = ""+ itemdef.name +" ";
      itemdef.modelRotation1 = 208;
      itemdef.modelRotation2 = 220;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -18;
      itemdef.anInt165 = 82943;//82943
      itemdef.anInt200 = 82943;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      //localJI.M = 62730;
      //localJI.s = 62730;
      break;
	    case 19898:
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.modelID = 14131;
      itemdef.modelZoom = 2000;
      itemdef.modelZoom = 572;
      itemdef.modelRotation1 = 0;
      itemdef.modelRotation2 = 0;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 1;
      itemdef.anInt165 = 14132;
      itemdef.anInt200 = 14132;
      itemdef.name = "Weed Cape";
      itemdef.description = ""+ itemdef.name +"";
      break;
	  case 11137:
      itemdef.name = "Lvl 99 Lamp";
      itemdef.description = "Raises any skill of your choise to 99 instantly.";
      break;
	  case 19618:
      itemdef.modelID = 74009;
      itemdef.name = "Piyan partyhat";
      itemdef.description = ""+ itemdef.name +"";
      itemdef.modelZoom = 440;
      itemdef.modelRotation2 = 1845;
      itemdef.modelRotation1 = 121;
      itemdef.modelOffset2 = 0;
      itemdef.modelOffset1 = 1;
      itemdef.anInt165 = 74008;
      itemdef.anInt200 = 74008;
      itemdef.groundActions = new String[5];
      itemdef.groundActions[2] = "Take";
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      break;
	      case 903:
      itemdef.modelID = 2635;
      itemdef.name = "King's Party-Hat";
      itemdef.description = "The one partyhat that only a few players have examined, owned by King himself.";
      itemdef.modelZoom = 440;
      itemdef.modelRotation1 = 121;
      itemdef.modelRotation2 = 1850;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 1;
      itemdef.stackable = false;
      //localJI.D = true;
      itemdef.anInt165 = 187;
      itemdef.anInt200 = 363;
      itemdef.itemActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.itemActions[4] = "Drop";
      itemdef.modifiedModelColors = new int[1];
      itemdef.originalModelColors = new int[1];
      itemdef.modifiedModelColors[0] = 926;
      itemdef.originalModelColors[0] = 23970;
      break;
	  
	  case 14551:
      itemdef.groundActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.modelZoom = 1506;
      itemdef.modelRotation1 = 473;
      itemdef.modelRotation2 = 2042;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = 0;
      itemdef.anInt165 = 82947;//15041
      itemdef.anInt200 = 82947;
      itemdef.modelID = 15042;
      itemdef.name = "Ornamental Platebody";
      itemdef.description = ""+ itemdef.name +" ";
	   itemdef.stackable = false;
      break;
	   case 14552:
      itemdef.groundActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.modelZoom = 1740;
      itemdef.modelRotation1 = 474;
      itemdef.modelRotation2 = 2045;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -5;
	   itemdef.stackable = false;
      itemdef.anInt165 = 15043;
      itemdef.anInt200 = 15043;
      itemdef.modelID = 15044;
      itemdef.name = "Ornamental Platelegs";
      itemdef.description = ""+ itemdef.name +" ";
      break;
    case 14553:
      itemdef.groundActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.modelZoom = 672;
      itemdef.modelRotation1 = 85;
      itemdef.modelRotation2 = 1867;
      itemdef.modelOffset1 = 0;
      itemdef.modelOffset2 = -3;
      itemdef.anInt165 = 2036;
      itemdef.anInt200 = 2036;
	   itemdef.stackable = false;
      itemdef.modelID = 2035;
      itemdef.name = "Ornamental Full Helmet"; //15041
      itemdef.description = ""+ itemdef.name +" ";
      break;
	   case 14554:
      itemdef.groundActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.modelRotation1 = 1310;
      itemdef.modelRotation2 = 432;
      itemdef.anInt165 = 15045;
      itemdef.anInt200 = 15045;
	   itemdef.stackable = false;
      itemdef.modelID = 15046;
      itemdef.name = "Ornamental Boots";
      itemdef.description = ""+ itemdef.name +" ";
      break;
    case 14555:
      itemdef.groundActions = new String[5];
      itemdef.itemActions[1] = "Wear";
      itemdef.modelRotation1 = 1310;
      itemdef.modelRotation2 = 432;
      itemdef.anInt165 = 15047;
	   itemdef.stackable = false;
      itemdef.anInt200 = 15047;
      itemdef.modelID = 15048;
      itemdef.name = "Ornamental gloves";
      itemdef.description = ""+ itemdef.name +" ";
      break;
    case 861:
        itemdef.description = "Magic shortbow ";
        itemdef.modelID = 7085;
        break;
      case 12293:
      itemdef.name = "@ora@1.000b @col@ticket";
      itemdef.description = "1.000b ticket ";
      itemdef.modelID = 7085;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[0] = "Tear";
      break;
      case 12295:
      itemdef.name = "@cya@10.000b @col@ticket";
      itemdef.description = "10.000b ticket ";
      itemdef.modelID = 7085;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[0] = "Tear";
      break;
      case 12297:
      itemdef.name = "@gre@100.000b @col@ticket";
      itemdef.description = "100.000b ticket ";
      itemdef.modelID = 7085;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[0] = "Tear";
      break;
      case 12299:
      itemdef.name = "@red@1.000.000b @col@ticket";
      itemdef.description = "1.000.000b ticket ";
      itemdef.modelID = 7085;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[0] = "Tear";
      break;
    case 3529:
        itemdef.name = "Casket @ora@I";
        itemdef.description = "Contains items to brighten up your bank!";
        break;
    case 19867:
        itemdef.name = "@bla@Torva Box";
        itemdef.description = "Contains different types of Torva Armoury.";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[0] = "Open";
        break;
    case 19865:
        itemdef.name = "@bla@Super Torva Box";
        itemdef.description = "Contains only the best types of Torva Armoury.";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[0] = "Open";
        break;
    case 19042:
        itemdef.name = "@bla@Starter Box";
        itemdef.description = "Exchange this box with Spongebob for your starter items.";
		itemdef.itemActions = new String[5];
        break;
    case 3531:
        itemdef.name = "Casket @cya@II";
        itemdef.description = "Contains decent items. The box will reward you 1 item.";
        break;
    case 3533:
        itemdef.name = "Casket @cya@III";
        itemdef.description = "Contains very decent items. The box will reward you 1 item.";
        break;
    case 3535:
        itemdef.name = "Casket @cya@IV";
        itemdef.description = "Contains super decent items. The box will reward you 1 item.";
        break;
    case 3537:
        itemdef.name = "Casket @gre@V";
        itemdef.description = "Contains good items. The box will reward you 1 item.";
        break;
    case 3539:
        itemdef.name = "Casket @gre@VI";
        itemdef.description = "Contains very good items. The box will reward you 1 item.";
        break;
    case 3541:
        itemdef.name = "Casket @gre@VII";
        itemdef.description = "Contains super good items. The box will reward you 1 item.";
        break;
    case 3543:
        itemdef.name = "Casket @red@VIII";
        itemdef.description = "Contains amazing items. The box will reward you 1 item.";
        break;
    case 3545:
        itemdef.name = "Casket @red@IX";
        itemdef.description = "Contains super amazing items. The box will reward you 1 item.";
        break;
    case 3547:
        itemdef.name = "Casket @red@X";
        itemdef.description = "Contains only the best items in-game. The box will reward you 1 item.";
        break;
    case 3549:
        itemdef.name = "Casket Phat Set";
        itemdef.description = "Contains the full regular Partyhat set. The box will reward you 6 partyhats.";
        break;
    case 3551:
        itemdef.name = "Casket @ora@I";
        itemdef.description = "Contains items to brighten up your bank! The box will reward you 1 item.";
        break;
    case 3553:
        itemdef.name = "Casket @cya@II";
        itemdef.description = "Contains decent items. The box will reward you 1 item.";
        break;
    case 3555:
        itemdef.name = "Casket @cya@III";
        itemdef.description = "Contains very decent items. The box will reward you 1 item.";
        break;
    case 3557:
        itemdef.name = "Casket @cya@IV";
        itemdef.description = "Contains super decent items. The box will reward you 1 item.";
        break;
    case 3559:
        itemdef.name = "Casket @gre@V";
        itemdef.description = "Contains good items. The box will reward you 1 item.";
        break;
    case 3561:
        itemdef.name = "Casket @gre@VI";
        itemdef.description = "Contains very good items. The box will reward you 1 item.";
        break;
    case 3563:
        itemdef.name = "Casket @gre@VII";
        itemdef.description = "Contains super good items. The box will reward you 1 item.";
        break;
    case 3581:
        itemdef.name = "Weapon Casket @ora@I";
        itemdef.description = "Contains starter weaponry. The box will reward you 1 item.";
        break;
    case 3583:
        itemdef.name = "Weapon Casket @cya@II";
        itemdef.description = "Contains decent weaponry. The box will reward you 1 item.";
        break;
    case 3585:
        itemdef.name = "Weapon Casket @gre@III";
        itemdef.description = "Contains more decent weaponry. The box will reward you 1 item.";
        break;
    case 3587:
        itemdef.name = "Weapon Casket @red@IV";
        itemdef.description = "Contains very good weaponry. The box will reward you 1 item.";
        break;
    case 3589:
        itemdef.name = "Weapon Casket @red@V";
        itemdef.description = "Contains amazing weaponry. The box will reward you 1 item.";
        break;
    case 3565:
        itemdef.name = "Scary Casket";
        itemdef.description = "A special casket, only available during halloween!";
    	itemdef.modelID = 50233;
    	itemdef.modelZoom = 1420;
        itemdef.modelRotation1 = 164;
        itemdef.modelRotation2 = 1592;
        break;
    case 10531:
        itemdef.name = "King Black Dragon Egg";
        itemdef.description = "The smaller version of King Black Dragon, now as your own pet!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 10532:
        itemdef.name = "General Graardor Egg";
        itemdef.description = "The smaller version of General Graardor, now as your own pet!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 10533:
        itemdef.name = "Chaos Elemental Egg";
        itemdef.description = "The smaller version of Chaos Elemental, now as your own pet!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 10534:
        itemdef.name = "Kree Arra Egg";
        itemdef.description = "The smaller version of Kree Arra, now as your own pet!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 10535:
        itemdef.name = "Corporeal Beast Egg";
        itemdef.description = "The smaller version of Corporeal Beast, now as your own pet!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 10537:
        itemdef.name = "Commander Zilyana Egg";
        itemdef.description = "The smaller version of Commander Zilyana, now as your own pet!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 11965:
        itemdef.name = "Dagganoth Supreme Egg";
        itemdef.description = "The smaller version of Dagganoth Supreme, now as your own pet!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 11964:
        itemdef.name = "Bank Pet Egg";
        itemdef.description = "The one and only pet giving easy bank access!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 12109:
        itemdef.name = "Ihlakhizy Egg";
        itemdef.description = "Super cute.... NOT!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 12477:
        itemdef.name = "TokTz-Jad Egg";
        itemdef.description = "The egg of the pet version of the mighty Toktz-Jad.";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 10563:
        itemdef.name = "Ticket Picker Egg";
        itemdef.description = "The one and only pet that picks up tickets for you!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 1555:
        itemdef.name = "Starter Kitty";
        itemdef.description = "Your own personal starter kitten!";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[4] = "Drop";
        break;
    case 1038:
    case 1040:
    case 1042:
    case 1044:
    case 1046:
    case 1048:
        itemdef.description = ""+ itemdef.name +" ";
        break;
    case 1050:
        itemdef.description = ""+ itemdef.name +" ";
        break;
    case 11639:
    	itemdef.itemActions = new String[5];
    	itemdef.itemActions[1] = "Wear";
    	itemdef.originalModelColors = new int [1];
    	itemdef.modifiedModelColors = new int[1];
    	itemdef.originalModelColors[0] = 926;
    	itemdef.modifiedModelColors[0] = 0;
    	itemdef.modelID = 48512;
    	itemdef.anInt165 = 48465;
    	itemdef.anInt200 = 48465;
    	itemdef.modelZoom = 1350;
    	itemdef.modelRotation1 = 176;
    	itemdef.modelRotation2 = 1850;
    	itemdef.anInt204 = 0;
    	itemdef.modelOffset1 = -2;
    	itemdef.modelOffset2 = -10;
    	itemdef.name = "One-Handed Cannon";
    	itemdef.description = ""+ itemdef.name +" ";
    	break;
    case 18377:
    	itemdef.name = "Jetpack";
    	itemdef.description = ""+ itemdef.name +" ";
    	itemdef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
    	itemdef.groundActions = new String[] { null, null, "Take", null, null };
    	itemdef.modelID = 13;
    	itemdef.anInt165 = 14;
    	itemdef.anInt200 = 14;
    	itemdef.modelZoom = 900;
    	itemdef.modelRotation1 = 513;
    	itemdef.modelRotation2 = 546;
    	itemdef.modelOffset1 = 5;
    	itemdef.modelOffset2 = 3;
    	itemdef.value = 100;
    	itemdef.membersObject = true;
    	break;
    case 19985:
    	itemdef.name = "Annihilation";
    	itemdef.description = ""+ itemdef.name +" ";
    	itemdef.groundActions = new String[5];
    	itemdef.groundActions[2] = "Take";
    	itemdef.itemActions = new String[5];
    	itemdef.itemActions[1] = "Wear";
    	itemdef.modelID = 71202;
    	itemdef.anInt165 = 71221;
    	itemdef.anInt200 = 71221;
    	itemdef.modelZoom = 1616;
    	itemdef.modelRotation1 = 273;
    	itemdef.modelRotation2 = 213;
    	itemdef.modelOffset1 = -5;
    	itemdef.modelOffset2 = 0;
    	itemdef.value = 100;
    	break;
    	case 19986:
    	itemdef.name = "Off-hand Decimation";
    	itemdef.description = ""+ itemdef.name +"";
    	itemdef.groundActions = new String[5];
    	itemdef.groundActions[2] = "Take";
    	itemdef.itemActions = new String[5];
    	itemdef.itemActions[1] = "Wear";
    	itemdef.modelID = 71195;
    	itemdef.anInt165 = 71247;
    	itemdef.anInt200 = 71247;
    	itemdef.modelZoom = 1382;
    	itemdef.modelRotation1 = 148;
    	itemdef.modelRotation2 = 808;
    	itemdef.modelOffset1 = 5;
    	itemdef.modelOffset2 = -13;
    	itemdef.value = 100;
    	break;
    	case 19987:
    	itemdef.name = "Obliteration";
    	itemdef.description = ""+ itemdef.name +" ";
    	itemdef.groundActions = new String[5];
    	itemdef.groundActions[2] = "Take";
    	itemdef.itemActions = new String[5];
    	itemdef.itemActions[1] = "Wear";
    	itemdef.modelID = 71203;
    	itemdef.anInt165 = 71222;
    	itemdef.anInt200 = 71222;
    	itemdef.modelZoom = 2829;
    	itemdef.modelRotation1 = 310;
    	itemdef.modelRotation2 = 0;
    	itemdef.modelOffset1 = 4;
    	itemdef.modelOffset2 = 4;
    	itemdef.value = 100;
    	break;
        }
        return itemdef;
    }
}