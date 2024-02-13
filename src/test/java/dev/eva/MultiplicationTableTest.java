package dev.eva;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    // Test with assertEquals

    @Test
    public void testGetMultiplicationTable() {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        String[] expectedTable = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };
        String[] actualTable = multiplicationTable.getMultiplicationTable(5);
        assertEquals(expectedTable.length, actualTable.length);
        for (int i =   0; i < expectedTable.length; i++) {
            assertEquals(expectedTable[i], actualTable[i]);
        }
    }

    // Tests with assertArrayEquals

    @Test
    public void testGetMultiplicationTable5() {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        String[] expectedTable = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };
        String[] actualTable = multiplicationTable.getMultiplicationTable(5);
        assertArrayEquals(expectedTable, actualTable);
    }

    @Test
    public void testCetMultiplicationTable6(){
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        String[] expectedTable = {
            "6 x 1 = 6",
            "6 x 2 = 12",
            "6 x 3 = 18",
            "6 x 4 = 24",
            "6 x 5 = 30",
            "6 x 6 = 36",
            "6 x 7 = 42",
            "6 x 8 = 48",
            "6 x 9 = 54",
            "6 x 10 = 60"
        };

        String [] actualTable = multiplicationTable.getMultiplicationTable(6);
        assertArrayEquals(expectedTable, actualTable);
    }
}
    
