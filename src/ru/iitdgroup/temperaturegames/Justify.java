package ru.iitdgroup.temperaturegames;

public class Justify {


    public static void main(String[] args) {
        partOne();
        System.out.println();
        partTwo();
        System.out.println();
        partThree();
    }


    public static void partOne() {
        String text = "A third issue I want to raise here is the type of texts we" +
                " ask students to write As previously" +
                " mentioned these are often quite long and this in itself" +
                " is a problem as the texts students are more likely to need to write are short texts such as messages notes and instructions" +
                " The features of these texts differ radically from long texts and yet students seem to be expected to be able to produce short texts" +
                " with almost no teaching having taken place";
        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (line.length() + word.length() > 40) {
                //System.out.println(line.length());
                System.out.println((getSpaces(line, 40, Alignment.CENTER)) + line);
                line = new StringBuilder();
            }
            line.append(word);
            if (line.length() < 40) {
                // do not add spaces if the next word will not fit into the line
                // not fit into the line means that the line + space + the next word will be grater than 40
                line.append(" ");
            }
        }
    }

    public static void partTwo() {
        String text = "A third issue I want to raise here is the type of texts we" +
                " ask students to write As previously" +
                " mentioned these are often quite long and this in itself" +
                " is a problem as the texts students are more likely to need to write are short texts such as messages notes and instructions" +
                " The features of these texts differ radically from long texts and yet students seem to be expected to be able to produce short texts" +
                " with almost no teaching having taken place";
        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();
        for (String word : words) {
            if (line.length() + word.length() > 40) {
                //System.out.println(line.length());
                System.out.println((getSpaces(line,40,Alignment.RIGHT)) + line);
                line = new StringBuilder();
            }
            line.append(word);
            if (line.length() < 40) {
                line.append(" ");
            }
        }
    }


    public static void partThree() {
        String text = "A third issue I want to raise here is the type of texts we" +
                " ask students to write As previously" +
                " mentioned these are often quite long and this in itself" +
                " is a problem as the texts students are more likely to need to write are short texts such as messages notes and instructions" +
                " The features of these texts differ radically from long texts and yet students seem to be expected to be able to produce short texts" +
                " with almost no teaching having taken place";
        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();
        for (String word : words) {
            if (line.length() + word.length() > 40) {
                //System.out.println(line.length());
                System.out.println((getSpaces(line,40,Alignment.CENTER)) + line);
                line = new StringBuilder();
            }
            line.append(word);
            if (line.length() < 40) {
                line.append(" ");
            }
        }
    }


    private static String getSpaces(StringBuilder line, int max, Alignment alignment) {
        int difference;
        final int temp = max - line.length();
        switch (alignment) {
            case LEFT:
                difference = 0;
                break;
            case RIGHT:
                difference = temp;
                break;
            case CENTER:
                difference = (temp) / 2;
                break;
            default:
                difference = 0;
                System.err.println("Unknown alignment " + alignment);
        }
        //System.out.println(difference);
        String a = "";
        for (int i = 0; i < difference; i++) {
            a = a + " ";
        }
        return a;
    }

    enum Alignment {
        LEFT, RIGHT, CENTER
    }
}