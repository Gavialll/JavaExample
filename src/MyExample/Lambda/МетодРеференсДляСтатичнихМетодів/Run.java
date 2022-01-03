package Lambda.МетодРеференсДляСтатичнихМетодів;


public class Run {

    public static void main(String[] args) {
        // Виклик методів StringTest через метод референс томущо вони підходять
        // під тип функціонального інтервейсу
        String str = "testStrTest";

        boolean start = get(StringTest::startWithTest, str);
        boolean end = get(StringTest::endsWithTest, str);
        boolean contains = get(StringTest::containsWithTest, str);
        System.out.println("Починається на - test: " + start);
        System.out.println("Закінчується на - Test: " + end);
        System.out.println("Містить - Str: " + contains);
    }

    // Метод який приймає функціональний інтерфейс
    public static boolean get(Test t, String str){
        return t.test(str);
    }

    interface Test {
        boolean test(String str);
    }


    static class StringTest{
        public static Boolean startWithTest(String str){
            return str.startsWith("test");
        }

        public static Boolean endsWithTest(String str){
            return str.endsWith("Test");
        }

        public static Boolean containsWithTest(String str){
            return str.contains("Str");
        }
    }
}

