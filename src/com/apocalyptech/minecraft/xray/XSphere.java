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

    /**
     * Changes the radius of our sphere by the given increment
     */
    public void changeSize(int increment){
        this.draw_sphere_radius += increment;
        if (this.draw_sphere_radius < this.draw_sphere_radius_min)
        {
            this.draw_sphere_radius = this.draw_sphere_radius_min;
        }
        else if (this.draw_sphere_radius > this.draw_sphere_radius_max)
        {
            this.draw_sphere_radius = this.draw_sphere_radius_max;
        }
        XRay.xray_properties.setIntProperty("STATE_SPHERE_RADIUS", this.draw_sphere_radius);
    }

    /**
     * Sets the center of our sphere
     */
    public void setCenter(FirstPersonCameraController camera, WorldInfo world){
        this.sphere_x = -camera.getPosition().x;
        this.sphere_y = -camera.getPosition().y;
        this.sphere_z = -camera.getPosition().z;
        this.set_sphere_center = true;
        if (!this.draw_sphere)
        {
            this.toggle(camera, world);
        }
        XRay.xray_properties.setProperty("LAST_SPHERE_WORLD", world.getBasePath());
        XRay.xray_properties.setFloatProperty("STATE_SPHERE_X", this.sphere_x);
        XRay.xray_properties.setFloatProperty("STATE_SPHERE_Y", this.sphere_y);
        XRay.xray_properties.setFloatProperty("STATE_SPHERE_Z", this.sphere_z);
    }

    /**
     * Toggles rendering of our sphere
     */
    public void toggle(FirstPersonCameraController camera, WorldInfo world){
        this.draw_sphere = !this.draw_sphere;
        XRay.xray_properties.setBooleanProperty("STATE_SPHERE", this.draw_sphere);
        if (this.draw_sphere && !this.set_sphere_center)
        {
            this.setCenter(camera, world);
        }
    }
}
