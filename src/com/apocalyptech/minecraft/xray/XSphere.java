package com.apocalyptech.minecraft.xray;

public class XSphere {
    public boolean draw_sphere;
    public boolean set_sphere_center;
    public int draw_sphere_radius_min;
    public int draw_sphere_radius_max;
    public int draw_sphere_radius_inc;
    public int draw_sphere_radius;
    public float sphere_x;
    public float sphere_y;
    public float sphere_z;

    public XSphere(boolean draw_sphere, boolean set_sphere_center, int draw_sphere_radius_min, int draw_sphere_radius_max, int draw_sphere_radius_inc, float sphere_x, float sphere_y, float sphere_z) {
        this.draw_sphere = draw_sphere;
        this.set_sphere_center = set_sphere_center;
        this.draw_sphere_radius_min = draw_sphere_radius_min;
        this.draw_sphere_radius_max = draw_sphere_radius_max;
        this.draw_sphere_radius_inc = draw_sphere_radius_inc;
        this.draw_sphere_radius = draw_sphere_radius_min + (draw_sphere_radius_inc*2);
        this.sphere_x = sphere_x;
        this.sphere_y = sphere_y;
        this.sphere_z = sphere_z;
    }


}
