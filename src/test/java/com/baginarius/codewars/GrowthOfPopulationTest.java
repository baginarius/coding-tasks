package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import static com.baginarius.codewars.GrowthOfPopulation.nbYear;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GrowthOfPopulationTest {

    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        assertEquals(nbYear(1500, 5, 100, 5000),15);
        assertEquals(nbYear(1500000, 2.5, 10000, 2000000), 10);
        assertEquals(nbYear(1500000, 0.25, 1000, 2000000), 94);
        assertEquals(nbYear(1500000, 0.0, 10000, 2000000), 50);
    }

}