package lesson2;

public class HW2Sum {
    public static void main(String[] args) {
        HW2Sum loops = new HW2Sum();
        loops.totalSum(1,3);
        //loops.totalSum2();

    }

    public void totalSum(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++)
            sum += i;

        System.out.println(sum + "=" + a + "+" + (a + 1) + "+" + b);

            //Я знаю - я читер) Но на этом задании, в какой-то момент логическая цепочка сломалась.
            //Я почитала и нашла правильный вариант,но честно я сама не додумалась и более того я и не поняла. Надо обсудить.
    }

    public void totalSum2() {
        int a = 1;
        int b = 3;
        int sum = 0;

        StringBuilder equation = new StringBuilder();

        for (int i = a; i <= b; i++) {
            sum += i;
            equation.append(i);
            if (i < b) {
                equation.append("+");
            }
        }
        equation.append("=").append(sum);
        System.out.println(equation.toString());

    }

}




