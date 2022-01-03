package CodeWars.String.SortPeople;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        String s = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        System.out.println(meeting(s));
    }

    public static String meeting(String s) {
        class User {
            String FirstName;
            String LastName;
            public User(String firstName, String lastName) {
                FirstName = firstName;
                LastName = lastName;
            }
        }

        List<String> strArr =Arrays.asList(s
                .toUpperCase(Locale.ROOT)
                .replaceAll(":", ", ")
                .split(";"));

        List<User> users = new ArrayList();
        for(String user : strArr) {
            users.add(new User(user.split(", ")[0], user.split(", ")[1]));
        }

        Comparator<User> firstName = (o1, o2) -> o1.FirstName.compareTo(o2.FirstName);
        Comparator<User> lastName = (o1, o2) -> o1.LastName.compareTo(o2.LastName);
        users.sort(lastName.thenComparing(firstName));


        StringBuilder stringBuilder = new StringBuilder();
        for(User user: users) {
            stringBuilder.append("(" + user.LastName + ", " + user.FirstName + ")");
        }
        return stringBuilder.toString();
    }
}

//    Джон запросив друзів. Його список:
//
//    s = "Фред:Корвілл; Вілфред:Корвіл;
//          Барні:Торнбулл;
//          Бетті:Торнбулл;
//          Бджон:Торнбулл;
//          Рафаель:Корвілл;
//          Альфред:Корвілл";
//    Чи не могли б ви створити програму, що
//
//    робить цей рядок у верхньому регістрі
//    дає його відсортовано в алфавітному порядку за прізвищем.
//    Якщо прізвища збігаються, відсортуйте їх за іменем. Прізвище та ім’я гостя входять у результат між дужками, розділеними комою.
//
//    Отже, результатом функціональних зустрічей(-й) буде:
//
//    "(КОРВІЛ, АЛЬФРЕД)(КОРВІЛ, ФРЕД)(КОРВІЛ, РАФАЕЛ)(КОРВІЛ, ВІЛФРЕД)(ТОРНБУЛ, БАРНІ)(ТОРНБУЛ, БЕТТІ)(ТОРНБУЛ, БДЖОН)"
//    Може статися так, що в двох різних сім’ях з однаковим прізвищем дві людини також мають однакове ім’я.
