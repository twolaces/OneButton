package com.twolaces.onebutton;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class OneButtonGame extends ApplicationAdapter {
	public static final int WIDTH = 800, HEIGHT = WIDTH * 9 / 16;

	private Input input;
	private ShapeRenderer shapeRenderer;
	private OrthographicCamera camera;
	private SpriteBatch batch;

	private Texture playerTexture;

	private Arrow arrow;
	private Gameboard gameboard;
	private Player player;

	@Override
	public void create () {

		camera = new OrthographicCamera();
		camera.setToOrtho(false,WIDTH,HEIGHT);

		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(camera.combined);

		batch = new SpriteBatch();
		playerTexture = new Texture("player.png");

		arrow = new Arrow();
		gameboard = new Gameboard();
		player = new Player(gameboard.getNumLanes()/2);

		gameboard.addEntity(player);
		gameboard.addEntity(arrow);

		input = Gdx.input;
		input.setInputProcessor(gameboard);
	}

	@Override
	public void render () {
		camera.update();


		// End Gameboard Pattern

		if(input.isKeyJustPressed(Input.Keys.SPACE)){
			movePlayer();
		}

		// Gameboard Pattern
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(0.5f,0.5f,0.5f,0.5f);
		for(int i = 0; i < gameboard.getNumLanes(); i++){
			shapeRenderer.rect(i*(WIDTH/gameboard.getNumLanes())*2,0,WIDTH/gameboard.getNumLanes(),HEIGHT);
		}
		shapeRenderer.end();

		Gdx.gl.glClearColor(0.4f, 0.4f, 0.4f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(playerTexture, player.getX(), player.getY());
		batch.end();

	}

	public void movePlayer(){
		player.shift(arrow.getDirection());
		player.setX(WIDTH/gameboard.getNumLanes()*player.getLane());
		if(player.getLane() != 1 && player.getLane() != gameboard.getNumLanes()){
			arrow.newDirection();
		} else {
			if(player.getLane() == 1) arrow.setDirection(1);
			else arrow.setDirection(-1);
		}

		Gdx.app.log("Player Lane", ""+player.getLane());
	}

	public void dispose(){
		//shapeRenderer.dispose();
		batch.dispose();

	}
}
