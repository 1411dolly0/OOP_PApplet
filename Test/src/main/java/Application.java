import oop.Ball;
import processing.core.PApplet;

import java.util.ArrayList;

public class Application extends PApplet {
    private ArrayList<Ball> balls = new ArrayList<>();
    public static final int WIDTH_OF_WINDOW = 1000;
    public static final int HEIGHT_OF_WINDOW = 1000;
    public static final int DIAMETER_OF_BALL = 20;
    public static final int X_AXIS_DISTANCE_OF_BALL = 0;

    @Override
    public void settings() {
        size(WIDTH_OF_WINDOW, HEIGHT_OF_WINDOW);
        balls.add(new Ball(this, DIAMETER_OF_BALL, 1, X_AXIS_DISTANCE_OF_BALL, 200));
        balls.add(new Ball(this, DIAMETER_OF_BALL, 2, X_AXIS_DISTANCE_OF_BALL, 400));
        balls.add(new Ball(this, DIAMETER_OF_BALL, 3, X_AXIS_DISTANCE_OF_BALL, 600));
        balls.add(new Ball(this, DIAMETER_OF_BALL, 4, X_AXIS_DISTANCE_OF_BALL, 800));
        super.settings();
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.coverDistance();
            ball.render();
        }
    }


    public static void main(String[] args) {
        PApplet.main(Application.class, args);

    }

}
