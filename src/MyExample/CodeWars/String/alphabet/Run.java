package CodeWars.String.alphabet;

import java.util.Locale;

public class Run {
    public static void main(String[] args) {

        for(int i: solve(new String[]{"ABCDEFGHIJKLsddsgNOPQRSTUVWXYZ","ABc","xyzD"})) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for(int i: solve(new String[]{"abide","ABc","xyz"})) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for(int i: solve(new String[]{"IAMDEFANDJKL","thedefgh","xyzDEFghijabc"})) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for(int i: solve(new String[]{"encode","abc","xyzD","ABmD"})) {
            System.out.print(i + ", ");
        }
    }
    public static int[] solve(String[] arr){
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int[] intArr = new int[arr.length];
        StringBuilder stringBuilder = new StringBuilder();

        for(int j = 0; j < arr.length; j++) {
            char[] charArr = arr[j].toCharArray();
            for(int i = 0; i < charArr.length; i++) {
                if(alphabet.length == i) break;
                if(alphabet[i] == Character.toUpperCase(charArr[i])) {
                    stringBuilder.append(charArr[i]);
                }
            }
            intArr[j] = stringBuilder.length();
            stringBuilder.setLength(0);
        }
        return intArr;
    }
}



//        Розглянемо слово «abode». Ми бачимо,
//        що буква A знаходиться в позиції 1,
//        а B знаходиться в позиції 2. В алфавіті a і b також знаходяться в позиціях 1 і 2.
//        Зверніть також увагу, що D і E в abode займають позиції,
//        які вони займали б в алфавіті , які є позиціями 4 і 5.
//
//        За даним масивом слів, поверніть масив з кількістю літер,
//        які займають свої позиції в алфавіті для кожного слова.
//        Наприклад вирішити(["abode","ABc","xyzD"]) = [4, 3, 1]
//
//        Введення буде складатися з символів алфавіту, як верхнього,
//        так і нижнього регістру. Без пробілів.