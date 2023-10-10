package main.java.com.cbfacademy.shapes;

public class Cylinder extends Shape{

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {

        this.shapeName = "Cylinder";
        this.radius = radius;
        this.height = height;

    }

    public double area()
    {

        return height*Math.PI*Math.pow(radius, 2);

    }
}