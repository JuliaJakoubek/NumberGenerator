package at.technikum.numbergenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberGeneratorTests {
    private NumberGenerator gen;

    @BeforeEach
    public void initGenerator(){
        gen = new NumberGenerator();
    }

    @Test
    public void testHigh(){
        int result = gen.random();
        int high = 101;
        assertTrue(high > result);
    }
    @Test
    public void testLow(){
        int result = gen.random();
        int low = -1;
        assertTrue(low < result);
    }

}
