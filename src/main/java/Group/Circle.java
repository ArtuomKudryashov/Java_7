package Group;

import java.util.Map;

public class Circle {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double square(int radius){
        return Math.PI*radius*radius;
    }


}
