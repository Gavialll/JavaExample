package Анотації;

public class Run {
    public static void main(String[] args) {

        System.out.println(241%10);
        System.out.println(241%100);
        System.out.println(241%1000);
    }


    @Print(value = "txt")
    public static String get(String str){
        return str;
    }

    @interface Print{
        String value();
    }
}
