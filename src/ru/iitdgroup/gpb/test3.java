package ru.iitdgroup.gpb;

import java.util.Random;

public class test3 {

    public static void main(String[] args) {
        //region define DTO
        int[] a = new int [100];
        int max = 0;
        //endregion
        //region obtain the data
        Random rnd = new Random ();

        for (int i = 0; i< a.length; i++) {
            a[i] = rnd.nextInt(99);
            System.out.println(a[i]);
        }
        //endregion
        //region process data
        for (int i = 0; i < a.length; i++) {
            a[i] = max;


            for (int j = i+1; j<a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }

            }
        }
        //endregion
        //region present the data
        System.out.println("Max element: " + max);
        //endregion
    }

    public static void  dTO(){
        int[] a = new int [100];
        int max = 0;
    }

    public static void  obtainTheData(int[] a){
        Random rnd = new Random ();

        for (int i = 0; i< a.length; i++) {
            a[i] = rnd.nextInt(99);
            System.out.println(a[i]);
        }
    }

    public static void  processData(int[] a, int max){
        for (int i = 0; i < a.length; i++) {
            a[i] = max;


            for (int j = i+1; j<a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
        }
    }

    public static void  presentTheData(int max){
        System.out.println("Max element: " + max);
    }
}