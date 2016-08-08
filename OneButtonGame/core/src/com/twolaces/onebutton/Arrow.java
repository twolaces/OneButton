package com.twolaces.onebutton;

import com.badlogic.gdx.math.MathUtils;
import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by toomeyt0 on 8/8/2016.
 */
public class Arrow extends Entity {
    private int direction;

    public Arrow(){
        newDirection();
    }


    public void newDirection(){
        if(MathUtils.random(1,10) % 2 == 0) {
            this.direction = -1;
        } else this.direction = 1;
    }

    public void setDirection(int direction){
        this.direction = direction;
    }

    public int getDirection(){
        return this.direction;
    }

}

