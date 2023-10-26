package com.cbfacademy;

import main.java.com.cbfacademy.shapes.*;

public class App {
    public static void main(String[] args) {
        
        Sphere ball = new Sphere(15);
        Rectangle desk = new Rectangle(35, 20);
        Cylinder tank = new Cylinder(10, 30);
        Paint paint = new Paint();

        paint.amount(ball);
        paint.amount(desk);
        paint.amount(tank);

    }
}