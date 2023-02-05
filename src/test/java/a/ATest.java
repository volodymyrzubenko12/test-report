package a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATest {

    @Test
    void test() {
        assertEquals(1, 1);
    }

    @Test
    void t() {

        new A();
        String[] strings = new String[1];
        A.main(strings);
    }

}