package Рефлексия;

import Анотації.Run;

public class Car {
    private String brand;
    private String color;
    private double hoursPower;

    public Car(String brand, String color, double hoursPower) {
        this.brand = brand;
        this.color = color;
        this.hoursPower = hoursPower;
    }

    public void move(){
        System.out.println("~~~");
    }
    public void moveLeft(){
        System.out.println("->");
    }
    public void moveRight(){
        System.out.println("<-");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHoursPower() {
        return hoursPower;
    }

    public void setHoursPower(double hoursPower) {
        this.hoursPower = hoursPower;
    }
}
