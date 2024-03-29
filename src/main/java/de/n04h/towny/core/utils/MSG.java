package de.n04h.towny.core.utils;

import de.n04h.towny.core.Core;
import org.bukkit.Location;


public class MSG {

    Core core;
    public MSG(Core core){
        this.core = core;
    }

    public String getComplete(String msg){
        return core.utilConfig.getPrefix() + core.utilConfig.getComplete() + msg;
    }

    public String getError(String msg){
        return core.utilConfig.getPrefix() + core.utilConfig.getError() + msg;
    }

    public String getInfo(String msg){
        return core.utilConfig.getPrefix() + core.utilConfig.getInfo() + msg;
    }

    public String getLoc(Location loc){
        return "[X: " + loc.getX() + ", Y: " + loc.getY() + ", Z: " + loc.getZ() + "]";
    }

}
