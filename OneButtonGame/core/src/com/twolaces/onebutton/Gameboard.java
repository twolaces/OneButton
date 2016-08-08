package com.twolaces.onebutton;

import com.badlogic.gdx.InputProcessor;

import java.util.ArrayList;

/**
 * Created by toomeyt0 on 8/3/2016.
 */
public class Gameboard implements InputProcessor {
    public static final int MIN_LANES = 5, MAX_LANES = 9;

    private int numLanes;
    private ArrayList<Entity> entities;

    public Gameboard(){
        entities = new ArrayList<Entity>();
        numLanes = MIN_LANES;
    }

    public boolean addEntity(Entity e){
        return entities.add(e);
    }

    public Entity findEntity(Entity e){
        int index = entities.indexOf(e);
        if(index == -1) return null;
        try {
           e = entities.get(index);
        }catch(NullPointerException ex){ return null; }
        return e;
    }

    public boolean removeEntity(Entity e){
        return entities.remove(e);
    }

    public int getNumLanes(){
        return numLanes;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }
    @Override
    public boolean keyUp(int keycode) {
        return false;
    }
    @Override
    public boolean keyTyped(char character) {
        return false;
    }
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }
    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }
    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }
    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }
    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
