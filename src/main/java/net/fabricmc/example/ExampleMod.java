package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "oilmachinery";

    @Override
    public void onInitialize() {
        System.out.println("Oil Machinery Mod Loaded!");
    }
}
