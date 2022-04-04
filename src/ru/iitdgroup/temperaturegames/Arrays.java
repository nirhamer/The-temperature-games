package ru.iitdgroup.temperaturegames;

public class Arrays {

    public static int[] swap(int[] array) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < array[minIndex])
                minIndex = i;
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }
        int t;
        if (maxIndex != minIndex) {
            t = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = t;
        }
        return array;
    }

    public static void partOne() {
        for (int i : (new int[]{3, 6, 84, 3, 4, 5, -1, -20}))
            System.out.println(i);
    }


    public static void partTwo() {
        for (int i : swap(new int[]{3, 6, 84, 3, 4, 5, -1, -20}))
            System.out.println(i);
    }

    public static void partThree() {
        for (int i : (new int[]{3, 6, 84, 3, 4, 5, -1, -20}))
            if (i % 2 == 0) {
                System.out.println("The integer number you entered " + i + " is divisible by 2 ");
            }
    }

    public static void main(String[] args) {
        partOne();
        System.out.println();
        partTwo();
        System.out.println();
        partThree();
    }
}