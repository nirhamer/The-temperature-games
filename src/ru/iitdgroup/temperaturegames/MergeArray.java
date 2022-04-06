package ru.iitdgroup.temperaturegames;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args)
    {
        int[] firstArray = {2,18,3};
        int[] secondArrayLength = {4,19,7};
        int firstArrayLength = firstArray.length;
        int sal = secondArrayLength.length;
        int[] result = new int[firstArrayLength + sal];
        System.arraycopy(firstArray, 0, result, 0, firstArrayLength);
        System.arraycopy(secondArrayLength, 0, result, firstArrayLength, sal);
        Arrays.sort(result);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArrayLength));
        System.out.println((Arrays.toString(result)));
    }
}