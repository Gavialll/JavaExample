package CodeWars.String.CleanString;

public class Run {
    public static void main(String[] args) {
        System.out.println(reverseLetter("ultr53o?n"));
        System.out.println(reverseLetter("krishan"));
        System.out.println(reverseLetter("ab23c"));
        System.out.println(reverseLetter("krish21an"));

        if(reverseLetter("ultr53o?n").equals("nortlu")) System.out.println(true);
        if(reverseLetter("krishan").equals("nahsirk")) System.out.println(true);
        if(reverseLetter("ab23c").equals("cba")) System.out.println(true);
        if(reverseLetter("krish21an").equals("nahsirk")) System.out.println(true);

    }

    public static String reverseLetter(final String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z]", "");
        StringBuffer stringBuffer = new StringBuffer(cleanStr);
        return stringBuffer.reverse().toString();
    }
}
//        Завдання
//        Для рядка str поверніть його, пропустивши всі неалфавітні символи.
//
//        Приклад
//        Для str = "krishan" вихід має бути "nahsirk".
//
//        Для str = "ultr53o?n" виведення має бути "nortlu".
//
//        Введення-виведення
//        [вхід] рядок str
//        Рядок складається з малих латинських літер, цифр і символів.
