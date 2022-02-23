package ru.iitdgroup.temperaturegames;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int line = 1; line <= 10; line++) {
            for (int i = 1; i <= 10; i += 1) {
                System.out.print(i + "x" + line + "=" + (i * line) + "\t");
            }
            System.out.println();
        }
    }
}