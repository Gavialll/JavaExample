package CodeWars.Factorial;

public class Run {

    public static void main(String[] args) {
        Factorial fact = new Factorial();

        System.out.println(fact.factorial(3));
        System.out.println(fact.factorial(0));
        System.out.println(fact.factorial(13));
        System.out.println(fact.factorial(-1));


    }
    public static class Factorial {
        public int factorial(int n) {
            if(n < 0 || n > 12) throw new IllegalArgumentException();
            if(n == 0) return 1;
            int index = n;
            for(int i = 1; i < n; i++) {
                index *= i;
            }
            return index;
        }
    }
}

//        У математиці факториал цілого невід’ємного числа n,
//        що позначається n!, є добутком усіх натуральних чисел,
//        менших або рівних n. Наприклад: 5! = 5 * 4 * 3 * 2 * 1 = 120.
//        За умовою значення 0! становить 1.
//
//        Напишіть функцію для обчислення факторіала для заданого вхідного даних.
//        Якщо значення введеного значення нижче 0 або вище 12,
//        створіть виняток типу IllegalArgumentException (Java)
