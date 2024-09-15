package lesson3.SW;

public class FizzBizz {
    public static void main(String[] args) {
       FizzBizz fizzBizz = new FizzBizz();

        fizzBizz.fizzStringTest("fig");
        fizzBizz.fizzStringTest("dib");
        fizzBizz.fizzStringTest("fib");
    }

    public static void fizzStringTest(String word) {
        if(word.startsWith("f") && word.endsWith("b")) {
            System.out.println("FizzBuzz");
        }else if(word.startsWith("f")) {
            System.out.println("Fizz");
        }else if(word.endsWith("b")){
            System.out.println("Buzz");}

    }
}

