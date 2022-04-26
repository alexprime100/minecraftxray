package com.apocalyptech.minecraft.xray;

import org.apache.log4j.Logger;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;

import static com.apocalyptech.minecraft.xray.MinecraftConstants.preferred_highlight_ores;

public final class Utility {

    public static final int[] CHUNK_RANGES_KEYS = new int[6];
    public static final int[] CHUNK_RANGES = new int[] { 3, 4, 5, 6, 7, 8 };
    
    // highlight distance
    public static final int[] HIGHLIGHT_RANGES_KEYS = new int[7];
    public static final int[] HIGHLIGHT_RANGES = new int[] { 2, 3, 4, 5, 6, 7, 8 };

    // ore highlight vars
    public static short[] HIGHLIGHT_ORES = new short[preferred_highlight_ores.length];
    public static final int[] HIGHLIGHT_ORE_KEYS = new int[preferred_highlight_ores.length];
    
    // window title
    public static String app_version = "3.6.2";
    public static String app_name    = "Minecraft X-Ray";
    public static String windowTitle = app_name + " " + app_version;

    public static final int renderDetails_w = 160;
    public static final int levelInfoTexture_h = 144;

    public static final XRay.HIGHLIGHT_TYPE defaultHighlightOre = XRay.HIGHLIGHT_TYPE.DISCO;

    public static XRay.RenderToggles toggle = new XRay.RenderToggles();

    public static HashMap<Integer, TextureDecorationStats> decorationStats;

    public static Logger logger = Logger.getLogger(XRay.class);

    /**
     * Restore the previous mode
     */
    public static void setOrthoOff()
    {
        // restore the original positions and views
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPopMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPopMatrix();
        // turn Depth Testing back on
        GL11.glEnable(GL11.GL_DEPTH_TEST);
    }
}
