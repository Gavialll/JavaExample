package StaticТаСтатичніБлоки;

public class StaticClass {
    static String name;
    static String surName;

    static {
        System.out.println("Виконання статичного блоку");
        name = "Agent";
        surName = "47";
    }

    public static void print(){
        System.out.println("Вивід даних");
        System.out.println("Ваше повне імя: " + name + " " + surName);
    }
}
