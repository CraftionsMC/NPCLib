/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.npclib;

import org.bukkit.plugin.java.JavaPlugin;

public class NPCLib extends JavaPlugin {

    private NPCLib instance;

    public NPCLib getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        super.onEnable();
    }
}
