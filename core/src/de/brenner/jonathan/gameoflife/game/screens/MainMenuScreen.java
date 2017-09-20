package de.brenner.jonathan.gameoflife.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import de.brenner.jonathan.gameoflife.game.GameOfLife;

public class MainMenuScreen implements Screen {
	
	final GameOfLife game;
	OrthographicCamera camera;
	
	public MainMenuScreen(final GameOfLife game) {
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false,800,480);
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		game.batch.setProjectionMatrix(camera.combined);
		int middlex = 350;
		
		game.batch.begin();
		game.font.draw(game.batch, "Welcome to the", middlex, 500);
		game.font.draw(game.batch, "GAME OF LIFE", middlex, 400);
		game.font.draw(game.batch, "Start Game", middlex, 300);
		game.font.draw(game.batch, "Config", middlex, 200);
		game.font.draw(game.batch, "Credits", middlex, 100);
		game.batch.end();

		if (Gdx.input.isKeyPressed(Keys.ENTER)) {
			game.setScreen(new GameScreen(game));
			dispose();
		}
		if (Gdx.input.isKeyPressed(Keys.ESCAPE)) {
			this.dispose();
		}
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
