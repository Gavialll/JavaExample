package Рефлексия;

import java.lang.reflect.Field;

public class Run {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car("vaz", "red", 1.5);

        Field field = car.getClass().getDeclaredField("brand");

        field.setAccessible(true);

        String brand = (String) field.get(car);
        System.out.println(brand);

        field.set(car, "vazdolin");

        System.out.println(car.getBrand());
    }
}
