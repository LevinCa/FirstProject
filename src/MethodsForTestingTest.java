

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsForTestingTest {

    @Test
    void shouldBeSum() {
        int a = 7;
        int b = 5;

        int actual = MethodsForTesting.sum(a, b);

        assertEquals(a+b , actual);
    }

    @Test
    void shouldReturnTrueIfBiggerThan100() {
        int biggerThan100 = 120;

        boolean actual = MethodsForTesting.isNumberBigger100(biggerThan100);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseIfSmallerThan100() {
        int smallerThan100 = 99;

        boolean actual = MethodsForTesting.isNumberBigger100(smallerThan100);

        assertFalse(actual);
    }

    @Test
    void shouldReturnFalseIfEqual100() {
        int equal100 = 100;

        boolean actual = MethodsForTesting.isNumberBigger100(equal100);

        assertFalse(actual);
    }
}