2
https://raw.githubusercontent.com/KarogathModdingStudios/Enhanced-Vanilla-1.15/master/src/main/java/com/karogath/enhancedvanilla/procedures/YellowAmaranthExplosionProcedure.java
package com.karogath.enhancedvanilla.procedures;

import net.minecraft.world.World;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import com.karogath.enhancedvanilla.block.YellowAmaranthBlock;
import com.karogath.enhancedvanilla.EnhancedVanillaElements;

@EnhancedVanillaElements.ModElement.Tag
public class YellowAmaranthExplosionProcedure extends EnhancedVanillaElements.ModElement {
	public YellowAmaranthExplosionProcedure(EnhancedVanillaElements instance) {
		super(instance, 215);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure YellowAmaranthExplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure YellowAmaranthExplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure YellowAmaranthExplosion!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure YellowAmaranthExplosion!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(YellowAmaranthBlock.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.addEntity(entityToSpawn);
		}
		if (!world.isRemote) {
			ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(Items.FLOWER_POT, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.addEntity(entityToSpawn);
		}
	}
}