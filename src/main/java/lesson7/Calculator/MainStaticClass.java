package lesson7.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainStaticClass {
    private static final Logger logger = LogManager.getLogger(MainStaticClass.class);


    public static void main(String[] args) {
        double result = Calculator.calculator(2, 3, null);
        logger.info("Result" + result);

        result = Calculator.calculator(244, 3, Calculator.Type.SUBTRACTION);
        logger.info("Result" + result);

        result = Calculator.calculator(244, 3, Calculator.Type.DIVISION);
        logger.info("Result" + result);


//        double result = Calculator.calculator(2, 3, Calculator.Type.MULTIPLICATION);
//        System.out.println(result);
//
//        result = Calculator.calculator(2, 3, Calculator.Type.SUMMARY);
//        System.out.println(result);
//
//        result = Calculator.calculator(244, 3, Calculator.Type.SUBTRACTION);
//        System.out.println(result);
//
//        result = Calculator.calculator(244, 3, null);
//        System.out.println(result);
//
//        result = Calculator.calculator(244, 3, Calculator.Type.DIVISION);
//        System.out.println(result);
//    }
    }
}
