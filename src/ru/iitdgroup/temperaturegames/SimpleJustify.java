package ru.iitdgroup.temperaturegames;

public class SimpleJustify {
    public static void main(String[] args) {
        for (int i =0; i<3; i++){
            partTwo();
            System.out.println("\n");
        }
    }
    public static void partTwo(){
        String text = "Sabers have a base damage multiplier of 1.0x.";
        String[] separated = text.split(" ");

        for (String word : separated) {
            if (!word.trim().isEmpty()) {
                String padded = String.format("%"+word.length()+"s", "").replace('*', ' ');
                System.out.println(word + padded);
            }
        }
    }
}