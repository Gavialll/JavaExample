package CodeWars.LikePost;

public class Run {
    public static void main(String[] args) {
        whoLikesIt("Peter");
        whoLikesIt("Jacob", "Alex");
        whoLikesIt("Max", "John", "Mark");
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {

        String str;
        switch(names.length){
            case 0:{
                str = "no one likes this";
                break;
            }
            case 1:{
                str = names[0] + " likes this";
                break;
            }
            case 2:{
                str = names[0] + " and " + names[1] + " like this";
                break;
            }
            case 3:{
                str = names[0] + ", " + names[1]  + " and " + names[2] + " like this";
                break;
            }

            default:{
                str = names[0] + ", " + names[1]  + " and " + (names.length - 2) + " others like this";
                break;
            }
        }

        return str;
    }
}

//    Ви напевно знаєте систему «подобається» з Facebook та інших сторінок.
//    Люди можуть «лайкнути» публікації блогу, зображення чи інші елементи.
//    Ми хочемо створити текст, який має відображатися поруч із таким елементом.
//
//    Реалізуйте функцію, яка приймає масив, що містить імена людей,
//    яким подобається елемент. Він повинен повернути відображений текст,
//    як показано в прикладах:
//
//    [] --> "це нікому не подобається"
//    ["Пітер"] --> "Пітер любить це"
//    ["Jacob", "Alex"] --> "Jacob and Alex like this"
//    ["Макс", "Джон", "Марк"] --> "Макс, Джон і Марк такі"
//    ["Alex", "Jacob", "Mark", "Max"] --> "Alex, Jacob and 2 other like this"
