import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.Ints;
import ru.netology.IntsCalculator;

public class IntsCalculatorTest {

    private Ints intsCalc = new IntsCalculator();

    @Test
    @DisplayName("SUM operation test")
    public void sumTest() {
        int sum = intsCalc.sum(2, 2);
        Assertions.assertEquals(sum, 4);
    }

    @Test
    @DisplayName("MULT operation test")
    public void multTest() {
        int mult = intsCalc.sum(10, 22);
        Assertions.assertEquals(mult, 32);
    }

    @Test
    @DisplayName("POW operation test")
    public void powTest() {
        int pow = intsCalc.pow(2, 10);
        Assertions.assertEquals(pow, 1024);
    }
}
