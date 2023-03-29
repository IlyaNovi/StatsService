package ru.netology.statsservice.services;

public class StatsService {
    public int allSumSale(int[] sales) {// задание 1 сумма всех продаж
        int allSale = 0;
        for (int i : sales) {
            allSale += i;
        }
        return allSale;
    }

    public int averageAmountSale(int[] sales) {// задание 2 средняя сумма всех продаж
        int averageSale = allSumSale(sales) / sales.length;
        return averageSale;
    }

    public int maxDaySale(int[] sales) {   //максимальная сумма продаж (звадание 3)
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSale]) {
                maxSale = i;
            }
        }
        return maxSale + 1;
    }

    public int minDaySale(int[] sales) {   //минимальная сумма продаж (звадание 4)
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[0]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    public int salesBelowAverage(int[] sales) {// задание 5 кол-во месяцев продажи ниже среднего
        int min = averageAmountSale(sales);
        int belowAverage = 0;
        for (int t : sales) {
            if (t < min) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int aboveAverageSales(int[] sales) {// задание 6 кол-во месяцев продажи ниже среднего
        int min = averageAmountSale(sales);
        int aboveAverage = 0;
        for (int t : sales) {
            if (t > min) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}
