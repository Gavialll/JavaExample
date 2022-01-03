package Lambda.Лямбда;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        // Узагальнені функціональні інтерфейси для лямбда виразу
        Calculator<Double> addition = (a, b) -> a + b;
        Calculator<Double> multiplication = (a, b) -> a * b;
        Calculator<Double> subtraction = (a, b) -> a - b;
        Calculator<Double> division = (a, b) -> a / b;

        List<Calculator<Double>> list = new ArrayList<>();
        list.add(addition);
        list.add(multiplication);
        list.add(subtraction);
        list.add(division);

        Double one = 5.0;
        Double two = 5.0;

        for(Calculator<Double> c : list) {
            System.out.println(c.sum(one, two));
        }

        //Передавання лямбди в якості параметра в метод
        System.out.println(test((a, b) -> a + b, one, two));

    }

    public static boolean test(Calculator<Double> calculator, Double one, Double two){
        if(calculator.sum(one, two) >= 10) return true;
        else return false;
    }
}
