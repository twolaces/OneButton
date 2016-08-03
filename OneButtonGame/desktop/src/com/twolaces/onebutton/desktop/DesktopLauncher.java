package com.twolaces.onebutton.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.twolaces.onebutton.OneButtonGame;

public class DesktopLauncher {
	public static final int WIDTH = 800, HEIGHT = WIDTH * 9 / 16;
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = WIDTH;
		config.height = HEIGHT;

		new LwjglApplication(new OneButtonGame(), config);
	}
}
