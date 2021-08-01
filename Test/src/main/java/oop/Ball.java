package oop;

import processing.core.PApplet;

public class Ball {

    private PApplet sketch;
    private float diameter;
    private float speed;
    private float xDistance;
    private float yDistance;

    public Ball(PApplet sketch, float diameter, float speed, float xDistance, float yDistance) {
        this.sketch = sketch;
        this.diameter = diameter;
        this.speed = speed;
        this.xDistance = xDistance;
        this.yDistance = yDistance;
    }


    public void coverDistance(){
        xDistance += speed;
    }

    public void render(){
        sketch.ellipse(xDistance,yDistance,diameter,diameter);
    }
}
