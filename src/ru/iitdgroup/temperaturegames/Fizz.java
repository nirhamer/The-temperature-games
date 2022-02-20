package ru.iitdgroup.temperaturegames;

public class Fizz {
    public static void main(String[] args) {

        for (int i = 1; i < 16; i++) {
            System.out.print(i + " -> ");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


//If a number can be divided without remainder:
//by 3: print “Fizz”
//by 5: print “Buzz”
//by 3 and 5: print "FizzBuzz"
//if it can't - print the number itself


//1 -> "1"
//2 -> "2"
//3 -> "Fizz"
//4 -> "4"
//5 -> "Buzz"
//...
//14 -> 14
//15 -> "FizzBuzz"
//16 -> 16


//TODO recreate the multiplication table like in the image via programing