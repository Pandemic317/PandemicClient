package com;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Skills.java


final class Skills
{

    Skills()
    {
    }

    public static final int skillsCount = 25;
    public static final String skillNames[] = {
        "attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", 
        "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "farming", 
        "runecraft", "construction", "hunter", "summoning", "dungeoneering"
    };
    public static final boolean skillEnabled[] = {
        true, true, true, true, true, true, true, true, true, true, 
        true, true, true, true, true, true, true, true, true, true, 
        true, true, true, false, false
    };

}
