package ru.netology.statsservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void totalAllSales() { //задание 1
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actcual = service.allSumSale(sales);

        Assertions.assertEquals(expected, actcual);

    }

    @Test
    public void averageAmountSale() { // задание 2
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actcual = service.averageAmountSale(sales);

        Assertions.assertEquals(expected, actcual);

    }


    @Test
    public void maxDaySales() { //задание 3
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actcual = service.maxDaySale(sales);
        Assertions.assertEquals(expected, actcual);
    }

    @Test
    public void minDaySales() { //задание 4
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actcual = service.minDaySale(sales);

        Assertions.assertEquals(expected, actcual);

    }

    @Test
    public void salesBelowAverage() { //задание 5
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actcual = service.salesBelowAverage(sales);

        Assertions.assertEquals(expected, actcual);

    }

    @Test
    public void aboveAverageSales() { //задание 6
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actcualAbovAvarage = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actcualAbovAvarage);

    }
}
