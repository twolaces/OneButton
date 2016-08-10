package com.twolaces.onebutton;

/**
 * Created by toomeyt0 on 8/3/2016.
 */
public abstract class Entity {
    private float x, y; // Graphical X & Y - Not lane indexes
    private int lane;

    public Entity(){
        this.x = 0;
        this.y = 0;
        this.lane = 1;
    }

    public Entity(int lane){
        this.lane = lane;
    }
    public Entity(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Entity(int lane, float x, float y){
        this.x = x;
        this.y = y;
        this.lane = lane;
    }

    public void shift(int dst){
        this.lane += dst;
    }

    // Getters & Setters
    public int getLane(){
        return this.lane;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public void setLane(int lane){
        this.lane = lane;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float Y){
        this.y = y;
    }
}
