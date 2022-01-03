package ВнутрішніКласи;

public class Run {
    public static void main(String[] args){
        Car car = new Car("vaz", "red", 1100);

        KeyCar keyCar = new KeyCar(car, 500);
        keyCar.start();

        car.start();
        car.move();
    }
}
