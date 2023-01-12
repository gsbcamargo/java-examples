package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

// TODO
// create array partitions
// extract month and year from random generated dates
// evenly distribute extracted data to subpartitions using modulo function
// while incrementing partition number

public class Main {

    static ArrayList<LocalDate> partition1 = new ArrayList<>();
    static ArrayList<LocalDate> partition2 = new ArrayList<>();
    static ArrayList<LocalDate> partition3 = new ArrayList<>();
    static ArrayList<LocalDate> partition4 = new ArrayList<>();
    static ArrayList<LocalDate> partition5 = new ArrayList<>();
    static ArrayList<LocalDate> partition6 = new ArrayList<>();
    static ArrayList<LocalDate> partition7 = new ArrayList<>();
    static ArrayList<LocalDate> partition8 = new ArrayList<>();

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        distributeOverPartitions(10_000_000);

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed time in milliseconds: " + elapsedTime/1_000_000);
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    public static ArrayList<LocalDate> populateArray(int numberOfRandomDates) {
        LocalDate randomDate;
        ArrayList<LocalDate> dateArrayList = new ArrayList<>();

        for (int i = 0; i <= numberOfRandomDates; i++) {
            randomDate = createRandomDate(1985, 2022);
            dateArrayList.add(randomDate);
        }
        return dateArrayList;
    }

    public static void distributeOverPartitions(Integer numberOfDates) {
        ArrayList<LocalDate> populatedArray = populateArray(numberOfDates);
        for (LocalDate date : populatedArray) {
            int monthAndYearSum = date.getMonthValue() + date.getYear();
            if (monthAndYearSum % 8 == 0) {
                partition1.add(date);
            }
            if (monthAndYearSum % 8 == 1) {
                partition2.add(date);
            }
            if (monthAndYearSum % 8 == 2) {
                partition3.add(date);
            }
            if (monthAndYearSum % 8 == 3) {
                partition4.add(date);
            }
            if (monthAndYearSum % 8 == 4) {
                partition5.add(date);
            }
            if (monthAndYearSum % 8 == 5) {
                partition6.add(date);
            }
            if (monthAndYearSum % 8 == 6) {
                partition7.add(date);
            }
            if (monthAndYearSum % 8 == 7) {
                partition8.add(date);
            }
        }
        System.out.println("Partition 1: " + partition1.size() + ", Partition 2: " + partition2.size()
        + ", Partition 3: " + partition3.size() + ", Partition 4: " + partition4.size()
        + ", Partition 5: " + partition5.size() + ", Partition 6: " + partition6.size()
        + ", Partition 7: " + partition7.size() + ", Partition 8: " + partition8.size());
    }
}