import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    void testAdd() {
        var MathOperation=new Addition();
        int result=MathOperation.add(2,4);
        Assertions.assertEquals(6, result);
    }

    @Test
    void testSub() {
        var MathOperation=new Addition();
        int result=MathOperation.sub(6,4);
        Assertions.assertEquals(2, result);
    }

    @Test
    void testSwap() {
        Swap MathOperation = new Swap();
        int[] result = MathOperation.swap(6, 4);
        Assertions.assertEquals(4, result[0]);
         Assertions.assertEquals(6, result[1]);
    }
}
