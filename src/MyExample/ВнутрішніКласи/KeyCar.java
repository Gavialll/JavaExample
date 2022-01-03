package ВнутрішніКласи;

public class KeyCar extends Thread{
    private Car car;
    private Integer workTime;

    public KeyCar(Car car, Integer workTime) {
        this.car = car;
        this.workTime = workTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(workTime);
            car.stop();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
