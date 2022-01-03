package CodeWars.String.SortString;

public class Run {
    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order(""));
    }

    public static String order(String words) {
        String[] str = words.split(" ");
        StringBuffer stringBuffer = new StringBuffer();

        if(words.isEmpty()) return "";

        for(Integer i = 0; i < str.length; i++) {
            for(int j = 0; j < str.length; j++) {
                Integer in = i + 1;
                if(str[j].contains(in.toString())) {
                    stringBuffer.append(str[j] + " ");
                }
            }
        }
        return stringBuffer.toString().trim();
    }
}

//        Ваше завдання - відсортувати заданий рядок. Кожне слово в рядку міститиме одне число.
//        Це число є позицією, яку слово має займати в результаті.
//
//        Примітка. Числа можуть бути від 1 до 9. Отже, 1 буде першим словом (а не 0).
//
//        Якщо вхідний рядок порожній, поверніть порожній рядок.
//        Слова у вхідному рядку будуть містити лише дійсні послідовні числа.
