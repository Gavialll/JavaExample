package CodeWars;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        nbMonths(2000, 8000, 1000, 1.5);
    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        double vOld = (startPriceOld * percentLossByMonth) / 100;

        double result = startPriceOld;
        int twoMonth = 2;
        int i = 0;
        while(result < startPriceNew){
            if(i == twoMonth){
                System.out.println(" + 0.5%");
                vOld =(startPriceOld * (percentLossByMonth + 0.5)) / 100;
                twoMonth += 2;
            }
            result += 1000;
            result -= vOld;
            startPriceOld -= vOld;
            startPriceNew -= vOld;

            System.out.println("Old: " + startPriceOld);
            System.out.println("New: " + startPriceNew);
            i++;
        }

        System.out.println();
        System.out.println();
        System.out.println("Size: " + result);
        System.out.println("Month: " + i);
        System.out.println("Old: " + startPriceOld);
        System.out.println("New: " + startPriceNew);

        return null;
    }
}

//    Почнемо з прикладу:
//
//        У чоловіка досить стара машина вартістю 2000 доларів.
//        Він побачив вживану машину вартістю 8000 доларів.
//        Він хоче зберегти свою стару машину, поки не зможе купити вживану.
//
//        Він думає, що може заощадити 1000 доларів щомісяця,
//        але ціни на його стару та нову машину знижуються на 1,5 відсотка на місяць.
//        Крім того, цей відсоток збитків збільшується на 0.5 відсотків в кінці кожні два місяці.
//        Нашій людині важко зробити всі ці розрахунки.
//
//        Ти можеш йому допомогти?
//
//        Скільки місяців йому знадобиться, щоб накопичити достатньо грошей,
//        щоб купити автомобіль, який він хоче, і скільки грошей у нього залишиться?
//
//        Параметри та повернення функції:
//
//        parameter (positive int or float, guaranteed) startPriceOld (Old car price)
//        parameter (positive int or float, guaranteed) startPriceNew (New car price)
//        parameter (positive int or float, guaranteed) savingperMonth
//        parameter (positive float or int, guaranteed) percentLossByMonth
//
//        nbMonths(2000, 8000, 1000, 1.5) should return [6, 766] or (6, 766)
//        Деталі наведеного вище прикладу:
//        end month 1: percentLoss 1.5 available -4910.0
//        end month 2: percentLoss 2.0 available -3791.7999...
//        end month 3: percentLoss 2.0 available -2675.964
//        end month 4: percentLoss 2.5 available -1534.06489...
//        end month 5: percentLoss 2.5 available -395.71327...
//        end month 6: percentLoss 3.0 available 766.158120825...
//        return [6, 766] or (6, 766)
//        де 6– кількість місяців, по закінченні яких він може купити новий автомобіль,
//        і 766найближче ціле число до 766.158...(округлення 766.158дає 766).
//
//        Примітка:
//
//        Продаж, купівля та заощадження зазвичай здійснюються в кінці місяця.
//        Розрахунки обробляються в кінці кожного розглянутого місяця,
//        але якщо випадково з самого початку вартість старого автомобіля більша
//        за вартість нового або дорівнює, економити не потрібно, не потрібно чекати,
//        тому він можна на початку місяця купити новий автомобіль:
