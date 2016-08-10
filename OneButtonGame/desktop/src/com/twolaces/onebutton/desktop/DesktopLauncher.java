package com.twolaces.onebutton.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.twolaces.onebutton.OneButtonGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = OneButtonGame.WIDTH;
		config.height = OneButtonGame.HEIGHT;

		new LwjglApplication(new OneButtonGame(), config);
	}
}
