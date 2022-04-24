package com.apocalyptech.minecraft.xray;

public class Minimap {
    public final int minimap_dim = 2048;
    public final float minimap_dim_f = (float) minimap_dim;
    public final int minimap_dim_h = minimap_dim / 2;
    public final float minimap_dim_h_f = (float) minimap_dim_h;
    public boolean minimap_needs_updating = false;

    public Minimap(boolean minimap_needs_updating) {
        this.minimap_needs_updating = minimap_needs_updating;
    }


}
