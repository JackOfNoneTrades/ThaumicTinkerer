/**
 * This class was created by <Vazkii>. It's distributed as part of the ThaumicTinkerer Mod.
 *
 * ThaumicTinkerer is Open Source and distributed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0
 * License (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 *
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 4. Thaumcraft 4 (c) Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 *
 * File Created @ [4 Sep 2013, 16:02:26 (GMT)]
 */
package thaumic.tinkerer.common.lib;

import thaumic.tinkerer.Tags;

public final class LibMisc {

    public static final String MOD_ID = "ThaumicTinkerer";
    public static final String MOD_NAME = "Thaumic Tinkerer";
    public static final String VERSION = Tags.VERSION;

    public static final String NETWORK_CHANNEL = MOD_ID;

    public static final String DEPENDENCIES = "required-after:Forge@[10.12.1.1112,);required-after:Thaumcraft;before:advthaum;required-after:appliedenergistics2|API;after:IC2;after:Waila;after:ForgeMultipart;after:ComputerCraft";

    public static final String COMMON_PROXY = "thaumic.tinkerer.common.core.proxy.TTCommonProxy";
    public static final String CLIENT_PROXY = "thaumic.tinkerer.client.core.proxy.TTClientProxy";
}
