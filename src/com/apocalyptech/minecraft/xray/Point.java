package com.apocalyptech.minecraft.xray;

public class Point {
    public int x;
    public int y;
    public int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public Point() {
    }
}