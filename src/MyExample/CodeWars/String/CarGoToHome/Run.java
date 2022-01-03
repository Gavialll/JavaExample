package CodeWars.String.CarGoToHome;

public class Run {
    public static void main(String[] args) {

        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));

        System.out.println(bumps("______n___n_"));
    }

    public static String bumps(final String road) {
        int shock = road.replaceAll("_", "").toCharArray().length;
        if(shock > 15)
            return "Car Dead";
        else
            return "Woohoo!";
    }
}


//    Ваш автомобіль старий, легко ламається. Амортизатори зникли,
//    і ви думаєте, що він витримає ще близько 15 ударів, перш ніж повністю загине.
//
//    На жаль, ваш диск дуже нерівний! Враховуючи рядок,
//    що показує рівну дорогу ("_") або нерівності ("n"),
//    подумайте, чи безпечно ви добираєтеся додому. 15 ударів або менше,
//    повертають "Ууу!", більше 15 ударів повертають "Car Dead"
