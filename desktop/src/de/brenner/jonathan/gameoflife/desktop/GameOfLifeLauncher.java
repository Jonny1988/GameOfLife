package de.brenner.jonathan.gameoflife.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import de.brenner.jonathan.gameoflife.game.GameOfLife;

public class GameOfLifeLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new GameOfLife(), config);
	}
}
