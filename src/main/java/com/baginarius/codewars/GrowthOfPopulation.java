package com.baginarius.codewars;

public class GrowthOfPopulation {

    public static int nbYear(int initialPopulation, double percentGrowthPerYear, int newComers, int expectedPopulation) {
        int yearsToAchievePopulation = 0;
        int population = initialPopulation;
        while (population < expectedPopulation) {
            population = population + (int) (population * percentGrowthPerYear / 100) + newComers;
            yearsToAchievePopulation++;
        }

        return yearsToAchievePopulation;
    }

}
