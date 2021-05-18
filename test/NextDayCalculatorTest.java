import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDay() {
        int day =1;
        int month = 1;
        int year = 2018;
        String hope = "Ngày tiếp theo là " + 2 + "-" + 1 + "-" + 2018;
        String result = NextDayCalculator.nextDay(1,1,2018);
        assertEquals(hope, result);
    }
}