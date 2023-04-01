
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultminecraft.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.ultminecraft.item.CuprousCopperItem;
import net.mcreator.ultminecraft.UltMinecraftMod;

public class UltMinecraftModItems {
	public static Item CUPROUS_COPPER;

	public static void load() {
		CUPROUS_COPPER = Registry.register(Registry.ITEM, new ResourceLocation(UltMinecraftMod.MODID, "cuprous_copper"), new CuprousCopperItem());
	}
}
