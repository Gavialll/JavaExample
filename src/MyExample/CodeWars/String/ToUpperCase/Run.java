package CodeWars.String.ToUpperCase;

import java.util.Locale;

public class Run {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    static String toCamelCase(String s){
        if(s.isEmpty())
            return "";
        String[] strArr = null;
        if(s.contains("-"))
            strArr =  s.split("-");
        else if(s.contains("_"))
            strArr = s.split("_");

        StringBuilder srtBuilder = new StringBuilder();
        srtBuilder.append(strArr[0]);
        for(int i = 1; i < strArr.length; i++) {
            String temp = strArr[i].substring(0,1).toUpperCase(Locale.ROOT) + strArr[i].substring(1);
            srtBuilder.append(temp);
        }

        return srtBuilder.toString();
    }
}

//    Завершіть метод/функцію, щоб вона перетворила слова, розділені тире/підчеркивання,
//    у верблюжий корпус. Перше слово у виводі має писати з великої літери.
//    тільки якщо вихідне слово було написано з великої літери (відоме як Верблюжий регістр,
//    також часто згадується як регістр Паскаля).
//
//    Приклади
//    "the-stealth-warrior" перетворюється на "theStealthWarrior"
//    "The_Stealth_Warrior" перетворюється на "TheStealthWarrior"


