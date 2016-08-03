package com.twolaces.onebutton;

import java.util.ArrayList;

/**
 * Created by toomeyt0 on 8/3/2016.
 */
public class Gameboard {
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
}
