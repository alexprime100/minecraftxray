package com.apocalyptech.minecraft.xray;

public class FloatPoint {
    public float x;
    public float y;
    public float z;

    public FloatPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public FloatPoint(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public FloatPoint() {
    }
}
