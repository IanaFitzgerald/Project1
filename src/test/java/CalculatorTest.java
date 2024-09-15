import lesson7.Calculator.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.logging.LogManager;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

//    @BeforeAll
//    public static void ClassSetUp(){
//        System.out.println("Before all tests");
//    }
//
    @AfterAll
    public static void afterAll(){
        System.out.println("We finished");
    }
//
//    @AfterEach
//    public void AfterEach(){
//        System.out.println("***********");
//    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 27, 87328732, -87328732})
    public void  summaryParamsTest(int a){
        double b = 6;
        double expectedresult = b + a;


        double actualResult = Calculator.calculator(a, b, Calculator.Type.SUMMARY);

        assertEquals(expectedresult, actualResult, "Summery result not correct!!!");

    }
    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(2, 2, 4, Calculator.Type.SUMMARY),
                Arguments.of(4, 2, 2, Calculator.Type.DIVISION),
                Arguments.of(4, 2, 8, Calculator.Type.MULTIPLICATION),
                Arguments.of(5, 2, 3, Calculator.Type.SUBTRACTION)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest( double a, double b,double expectedResult, Calculator.Type type){
        double actualResult = Calculator.calculator(a,b,type);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"2,2,4,SUMMARY", "4,2,2,DIVISION"})
    public void csvSourceTest( double a, double b,double expectedResult, Calculator.Type type){
        double actualResult = Calculator.calculator(a,b,type);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void summeryTest(){
        double a = 5;
        double b = 6;
        double expectedresult = 11;


       double actualResult = Calculator.calculator(a, b, Calculator.Type.SUMMARY);

       assertEquals(expectedresult, actualResult, "Summery result not correct!!!");

    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void calculationTypeTest(Calculator.Type type){
        double a = 25;
        double b = 6;

        double actualResult = Calculator.calculator(a, b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult>0, "More then 0");

    }

    @Test

    public void divisionTest(){
        double a = 10;
        double b = 2;
        double expectedresult = 5;
        double actualResult = Calculator.calculator(a, b, Calculator.Type.DIVISION);
        assertNotNull(actualResult,"Null was returned");
        assertEquals(expectedresult, actualResult, "Division result not correct!!!");
        assertTrue(expectedresult == actualResult);
        assertTrue(actualResult>0);
        assertFalse(actualResult == 0);
    }

    @Test
    //@DisplayName("Nullpointer Expection test")
    public void errorTest(){
        double a = 10;
        double b = 2;
        double expectedresult = 5;
        assertThrows(NullPointerException.class, () -> {Calculator.calculator(a, b, null);});
    }
}
