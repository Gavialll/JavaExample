package Lambda.МетодРеференсДляМетодівЕкземпляраКласу;

public class Run {
    public static void main(String[] args) {
        Sum suma = new Sum(20);
        Sum suma1 = new Sum(30);
        Sum suma2 = new Sum(40);
        NumberSum numberSum = suma::sum;
        NumberSum numberSum1 = suma1::sum;
        NumberSum numberSum2 = suma2::sum;

        System.out.println(numberSum.sum(100));
        System.out.println(numberSum1.sum(100));
        System.out.println(numberSum2.sum(100));

        System.out.println(sum(suma::sum, 100));
    }

    public static Integer sum(NumberSum numberSum, int a){
        return numberSum.sum(a);
    }

    interface NumberSum{
        Integer sum(int one);
    }

    static class Sum{
        private Integer two;

        public Integer sum(int one){
            return one + two;
        }

        public Sum(Integer two) {
            this.two = two;
        }
    }
}
