package ТернарнийОператор;

public class Run {
    public static void main(String[] args) {
        int one = 10;
        int two = 20;
        int rez = two > one ? two : one;

        System.out.println("Більше число: " + rez);


        String strOne = "start";
        String strTwo = "start";
        String concat = strOne.equals(strTwo) ? "true" : "false";

        System.out.println("Рядки одинакові: " + concat);
    }
}
