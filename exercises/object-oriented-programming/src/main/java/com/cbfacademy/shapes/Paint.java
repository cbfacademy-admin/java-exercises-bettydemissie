package main.java.com.cbfacademy.shapes;

public class Paint {

    private double coverage;


    public Paint(){
        this.coverage = 3.0;
    }

    public double amount(Shape shape){

        return shape.area()*coverage;

    }


    

}
