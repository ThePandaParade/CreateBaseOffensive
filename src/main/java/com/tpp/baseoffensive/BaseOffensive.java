package com.tpp.baseoffensive;

import com.simibubi.create.Create;
import net.minecraft.core.Registry;
import org.dimdev.matrix.Matrix;
import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import main.java.com.tpp.baseoffensive.ModBlocks;
import main.java.com.tpp.baseoffensive.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseOffensive implements ModInitializer {
	public static final String ID = "baseoffensive";
	public static final String NAME = "Create: Base Offensive";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}

	public static void init() {
		Matrix.register(ModBlocks.class);
		Matrix.register(ModItems.class, Registry.ITEM);
	}
}
