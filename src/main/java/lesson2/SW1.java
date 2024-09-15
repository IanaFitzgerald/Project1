package lesson2;

public class SW1 {
    public static void main(String[] args) {
        nearHundred(93); //7<10
        nearHundred(90); //10=10
        nearHundred(89); //11>10
        nearHundred(105); //-5<10
        nearHundred(111); //-11<10 и вот тут схема ломается почему это n выпадает в false
    }

    public static void nearHundred(int n) {

        if (Math.abs(100 - n) <= 10) {
            System.out.println( "nearHundre" + "("+ n + ")"+ " "+ "true");
        } else {
            System.out.println("nearHundre" + "("+ n + ")"+ " "+ "false");
        }
    }
}


