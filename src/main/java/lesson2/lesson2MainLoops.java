package lesson2;

public class lesson2MainLoops {
    public static void main(String[] args) {
        lesson2MainLoops loops = new lesson2MainLoops();
        //loops.countNumbers(1);
        //loops.countNumbers();
        loops.numbersTemplate(9);


    }

    public void countNumbers(int i) {

//        System.out.println(i);
//        System.out.println(i+1);
//        System.out.println(i+2);

        while (i <= 100) {
            System.out.println(i);
            //i = i + 1;
            i++;

        }
    }

    public void countNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //1
    //1 2
    //1 2 3

    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) continue;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
