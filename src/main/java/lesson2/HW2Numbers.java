package lesson2;

public class HW2Numbers {
    public void main(String[] args) {
        HW2Numbers loops = new HW2Numbers();
        loops.numbersTemplate(100);


    }

    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {


            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " " + "Divisible by two and three");
            } else if (i % 3 == 0) {
                System.out.println(i + " " + "Divisible by three");
            }
            else if (i % 2 == 0) {
                System.out.println(i + " " + "Even");
            } else {
                if (i % 1 == 0) {
                    System.out.println(i + " " + "Odd");
                }
            }
        }


    }

}