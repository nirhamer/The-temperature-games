package ru.iitdgroup.temperaturegames;

public class MinAndMax {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 100;
        System.out.println(a + " " + b + " " + c);
        if (a>b) {
            System.out.println("max value is " + a);
        }
        else if (b>c){
            System.out.println("max value is " + b);
        }
        else {
            System.out.println("max value is " + c);
        }
    }
}