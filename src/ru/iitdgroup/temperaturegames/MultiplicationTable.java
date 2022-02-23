package ru.iitdgroup.temperaturegames;

public class MultiplicationTable {
    public static void main(String[] args) {
        printHalfOfTheTable(1);
        System.out.println();
        printHalfOfTheTable(6);
    }

    public static void printHalfOfTheTable(int startFrom) {
        for (int line = 1; line <= 10; line++) {
            for (int i = startFrom; i < startFrom + 5; i += 1) {
                System.out.print(i + "x" + line + "=" + (i * line) + "\t");
            }
            System.out.println();
        }
    }
}