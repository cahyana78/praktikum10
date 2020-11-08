package org.d3ifcool.ima10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestJurnal01 {

    private static final String[] OUTPUT = {
            "1 4 9 16 25 36 49 64 81 100"
    };

    @Test
    public void testJurnal() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        Jurnal01.main(null);
        assertEquals(OUTPUT[i] + "\n", bos.toString());
        
        System.setOut(originalOut);
    }
}
