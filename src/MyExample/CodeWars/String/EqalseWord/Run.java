package CodeWars.String.EqalseWord;

public class Run {
    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("javscripts","javascript"));
        System.out.println(scramble("aabbcamaomsccdd","commas"));

    }
    public static boolean scramble(String str1, String str2) {
        char[] chars = str2.toCharArray();
        boolean flag = false;

        for(int i = 0; i < chars.length; i++) {
            if(str1.contains(chars[i] + ""))
                flag = true;
            else return false;
            str1 = str1.replaceFirst(chars[i]+ "", "");
        }
        return flag;
    }
}

//    Завершіть функцію scramble(str1, str2),
//    яка повертає true, якщо частину символів str1 можна перегрупувати,
//    щоб відповідати str2, інакше повертає false.
//
//    Примітки:
//
//    Використовуватимуться лише малі літери (a-z). Розділові знаки чи цифри не включатимуться.
//    Необхідно враховувати продуктивність
//    Вхідні рядки s1 і s2 закінчуються нулем.


