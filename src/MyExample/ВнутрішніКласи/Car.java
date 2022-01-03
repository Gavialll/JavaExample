package ВнутрішніКласи;

public class Car {
    private String brand;
    private String color;
    private Integer fuel;
    private boolean key = false;

    public void move() {
        Engine engine = new Engine();
        engine.start();
    }

    public void stop(){
        key = false;
    }
    public void start(){
        key = true;
    }

    class Engine{
        public void start() {
            System.out.println("Інформаця про автомобіль: " + brand + " " + color);
            do{
                key = fuel > 0 ? true : false;
                System.out.println("Двигун працює....... Залишилося пального: " + fuel);
                fuel--;
                try {
                    Thread.sleep(10);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            } while(key);
        }
    }

    public void setKey(boolean key) {
        System.out.println("Повернули ключ");
        this.key = key;
    }

    public Car(String brand, String color, Integer fuel) {
        this.brand = brand;
        this.color = color;
        this.fuel = fuel;
    }
}
