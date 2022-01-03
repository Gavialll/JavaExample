package CodeWars.Number.MinNumber;

import java.util.TreeSet;

public class Run {
    public static void main(String[] args) {
        minValue(new int[] {1,3,1});
        minValue(new int[] {4, 7, 5, 7});
        System.out.println(minValue(new int[] {6, 7, 8, 7, 6, 6}));
    }
    public static int minValue(int[] values){
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int value : values) {
            set.add(value);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int value : set) {
            stringBuilder.append(value);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}

//        Завдання
//        Враховуючи список цифр, поверніть найменше число,
//        яке можна було б утворити з цих цифр,
//        використовуючи цифри лише один раз (ігноруйте дублікати).
//
//        Примітки:
//        У функцію будуть передані лише додатні цілі числа (> 0 ), ніяких від’ємних чи нулів.
//        Вхідні дані >> Приклади виведення
//        minValue ({1, 3, 1}) ==> повернення (13)
//        Пояснення:
//        (13) - це мінімальна кількість, яку можна утворити з {1, 3, 1} , без дублювання
//
//        minValue({5, 7, 5, 9, 7}) ==> повернення (579)
//        Пояснення:
//        (579) - це мінімальна кількість, яку можна утворити з {5, 7, 5, 9, 7}, без дублювання
//
//        minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return ==> (134679)
//        Пояснення:
//        (134679) — це мінімальна кількість, яку можна утворити з {1, 9, 3, 1, 7, 4, 6, 6, 7} ,
//        без дублювання