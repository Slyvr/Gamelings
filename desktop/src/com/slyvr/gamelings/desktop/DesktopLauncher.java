package com.slyvr.gamelings.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.slyvr.gamelings.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//config.fullscreen = true;
		config.height = 768;
		config.width = 1366;
		//config.resizable = false;
		config.title = "Gamelings";
		new LwjglApplication(new MyGame(), config);
	}
}
