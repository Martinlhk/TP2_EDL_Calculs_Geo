package BE.AC.UMONS;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdditionTest{

    @Test
    public void addEquals() {
        System.out.println("Test addEquals");
        assertEquals(Addition.add(5, 3), 8);
    }

    @Test
    public void addNotEquals() {
        System.out.println("Test addNotEquals");
        assertNotEquals(Addition.add(1, 1), 3);
    }
}