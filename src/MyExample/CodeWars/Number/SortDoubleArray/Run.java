package CodeWars.Number.SortDoubleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        for(int i : flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}})) {
            System.out.print(i + ", ");
        }
        for(int i : flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}})) {
            System.out.print(i + ", ");
        }
    }

    public static int[] flattenAndSort(int[][] array) {
        int sum = 0;
        for(int[] ints : array) {
            sum += ints.length;
        }

        int a = 0;
        int[] arr = new int[sum];
        for(int[] ints : array) {
            for(int anInt : ints) {
                arr[a] = anInt;
                a++;
            }
        }
        return Arrays.stream(arr).sorted().toArray();
    }
}
//        Завдання:
//
//        Враховуючи двовимірний масив цілих чисел,
//        поверніть сплощену версію масиву з усіма цілими числами в відсортованому
//        (зростанні) порядку.
//
//        приклад:
//
//        Враховуючи [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]],
//        ваша функція повинна повертати [1, 2, 3, 4, 5, 6, 7, 8 , 9].
