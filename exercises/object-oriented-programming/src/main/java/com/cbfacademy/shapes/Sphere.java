package main.java.com.cbfacademy.shapes;

public class Sphere extends Shape {

    private double radius;

    public Sphere(double radius) 
    {
        this.shapeName = "Sphere";
        this.radius = radius;

    }
 
    public double area()
    {
        return 4*Math.PI*Math.pow(radius, 2);
    }


}