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

    public static void partOne(int[] sources) {
        for (int i : sources)
            System.out.print(i + " ");
    }


    public static void partTwo(int[] sources) {
        for (int i : swap(sources))
            System.out.print(i + " ");
    }

    public static void partThree(int[] sources) {
        for (int i : sources)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
    }

    public static void main(String[] args) {
        int[] i = new int[]{3, 6, 84, 3, 4, 5, -1, -20};

        partOne(i);
        System.out.println();
        partTwo(i);
        System.out.println();
        partThree(i);
    }
}