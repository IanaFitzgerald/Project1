import lesson7.Calculator.Calculator;
import lesson8.Week;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.logging.LogManager;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

public class DayOfWeekTest {
    @Test
    @DisplayName("Расшифровочка1")

    public void getDayOfTheWeek() {
        String exprectedResult = "Monday";
        String actualResult = Week.getDay(2);
        assertEquals(exprectedResult, actualResult);



    }

    @Test
    @DisplayName("Расшифровочка2")

    public void getDayOfTheWeek2() {
        assertEquals("Sunday", Week.getDay(1));
        assertEquals("Monday", Week.getDay(2));
        assertEquals("Tuesday", Week.getDay(3));
        assertEquals("Wednesday", Week.getDay(4));
        assertEquals("Thursday", Week.getDay(5));
        assertEquals("Friday", Week.getDay(6));
        assertEquals("Saturday", Week.getDay(7));



    }


    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday")
        );
    }

        @ParameterizedTest
        @MethodSource("dataProvider")
        public void methodSourceTest (int dayNumber, String exprectedResult ){
            String actualResult = Week.getDay(dayNumber);
            assertEquals(exprectedResult, actualResult);

        }


    @ParameterizedTest
    @CsvSource({"2, Monday"})
    public void CsvSourceTest (int dayNumber, String exprectedResult ){
        String actualResult = Week.getDay(dayNumber);
        assertEquals(exprectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"8, Monday", "0, Friday"})
    public void CsvNegSourceTest (int dayNumber, String exprectedResult ) {
        String actualResult = Week.getDay(dayNumber);
        assertEquals(exprectedResult, actualResult);

    }

    @Test
    public void errortest() {
        assertThrows(NullPointerException.class, () -> {
            Week.getDay(null);
        });

    }
}
