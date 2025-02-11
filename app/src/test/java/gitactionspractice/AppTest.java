package gitactionspractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, App.factorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, App.factorial(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, App.factorial(5));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, App.factorial(10));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.factorial(-1);
        });
        assertEquals("n must be >= 0", exception.getMessage());
    }
}
