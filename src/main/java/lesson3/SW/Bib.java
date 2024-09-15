package lesson3.SW;

import java.io.FilterOutputStream;

public class Bib {
    public static void main(String[] args) {
        Bib bib = new Bib();
        boolean result = bib.bigThere("babht");
        System.out.println(result);
    }

    public boolean bigThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {

            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}
