#!/bin/sh
cd "`dirname "$0"`"
java -Xms256m -Xmx1024m -cp AppleJavaExtensions.jar:jinput.jar:lwjgl.jar:lwjgl_test.jar:lwjgl_util.jar:lwjgl_util_applet.jar:lzma.jar:xray.jar -Djava.library.path=. com.apocalyptech.minecraft.xray.XRay
