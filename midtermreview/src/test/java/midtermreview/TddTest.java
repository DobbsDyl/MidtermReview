package midtermreview;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TddTest {
    
    @Test
    public void testEven() {
        assertTrue(Tdd.isEven(2));
        assertFalse(Tdd.isEven(1));
        assertThrows(IllegalArgumentException.class, 
            () -> Tdd.isEven(101));
    }
}
