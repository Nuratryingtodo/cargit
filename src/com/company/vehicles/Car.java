package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String automark;
    private String clacc;
    private double weight;
    private Driver driver;
    private Engine motor;

    public void start(){
        System.out.println("GO!");
    }
    public void stop(){
        System.out.println("Stop!");
    }
    public void turnRight(){
        System.out.println("Turn right!");
    }
    public void turnLeft(){
        System.out.println("Turn left");}

    @Override
    public String toString() {
        return "Car" +
                "\n Auto mark: " + automark +
                "\n Class: " + clacc +
                "\n Weight: " + weight +
                "\n Driver: " + driver +
                "\n Motor: " + motor;
    }
}
