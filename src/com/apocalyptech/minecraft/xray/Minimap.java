package com.apocalyptech.minecraft.xray;

import java.awt.*;

public class Minimap {
    public final int minimap_dim = 2048;
    public final float minimap_dim_f = (float) minimap_dim;
    public final int minimap_dim_h = minimap_dim / 2;
    public final float minimap_dim_h_f = (float) minimap_dim_h;
    public boolean minimap_needs_updating = false;
    public Texture minimapTexture;
    public Texture minimapArrowTexture;
    public Graphics2D minimapGraphics;

    public Minimap(boolean minimap_needs_updating) {
        this.minimap_needs_updating = minimap_needs_updating;
    }

    /**
     * Returns the "base" minimap X coordinate, given chunk coordinate X. The
     * "base" will be the upper left corner.
     *
     * As of Beta 1.9-pre4, X increases to the east (decreasing to the west),
     * and Z increases to the South (decreasing to the North).  This is much nicer
     * to deal with then the way we were pretending things worked previously.
     *
     * param chunkZ
     * @return
     */
    public int getMinimapBaseX(int chunkX){
        return (((chunkX*16) % minimap_dim) + minimap_dim) % minimap_dim;
    }

    /**
     * Returns the "base" minimap Y coordinate, given chunk coordinate Z. The
     * "base" will be the upper left corner.
     *
     * As of Beta 1.9-pre4, X increases to the east (decreasing to the west),
     * and Z increases to the South (decreasing to the North).  This is much nicer
     * to deal with then the way we were pretending things worked previously.
     *
     * @param chunkZ
     * @return
     */
    public int getMinimapBaseY(int chunkZ)
    {
        return (((chunkZ*16) % minimap_dim) + minimap_dim) % minimap_dim;
    }

}
