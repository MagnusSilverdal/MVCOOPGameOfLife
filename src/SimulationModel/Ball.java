package SimulationModel;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class Ball {
    private double x;
    private double y;
    private double radious;
    private double mass;
    private int color;
    private double vx = 0;
    private double vy = 0;

    public Ball(double x, double y, double radious, double mass, int color) {
        this.x = x;
        this.y = y;
        this.radious = radious;
        this.mass = mass;
        this.color = color;
    }


}