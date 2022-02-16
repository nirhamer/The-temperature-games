package ru.iitdgroup.temperaturegames;

public class IfElse {
    public static void main(String[] args) {

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        int x = 50;
        int y = 10;
       if (x > y) {
            System.out.println("and Hello World");
        }

        int number=13;
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}