package lesson2;

public class SW6 {
    public static void main(String[] args) {
        equalSlices(11, 5, 2);
        equalSlices(11, 5, 3);
        equalSlices(8, 3, 2);
        equalSlices(8, 3, 3);
        equalSlices(24, 12, 2);


    }

    public static void equalSlices(int totalSlices, int noRecipients, int slicesEach) {
        int neededSlices = noRecipients * slicesEach;

        if (neededSlices <= totalSlices) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}