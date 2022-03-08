package ru.iitdgroup.temperaturegames;

public class SimpleJustify {
    public static void main(String[] args) {
        String text = "Sabers have a base damage multiplier of 1.0x.";
        String[] separated = text.split(" ");

        partOne(separated);
        System.out.println();
        partTwo(separated);
        System.out.println();
        partThree(separated);
    }

    public static void partOne(String[] separated) {
        for (String word : separated) {
            System.out.println(word);
        }
    }

    public static void partTwo(String[] separated) {
        int maxLen = findLongestElement(separated);
        for (String word : separated) {
            System.out.println(getSpaces(word, maxLen, Alignment.RIGHT) + word);
        }
    }

    public static void partThree(String[] separated) {
        int maxLen = findLongestElement(separated);
        for (String word : separated) {
            System.out.println(getSpaces(word, maxLen, Alignment.CENTER) + word);
        }
    }

    private static int findLongestElement(String[] separated) {
        int max = 0;
        for (String currentElement : separated) {
            int currentLength = currentElement.length();
            if (currentLength > max) {
                max = currentLength;
            }
        }
        return max;
    }

    private static String getSpaces(String word, int maxLen, Alignment alignment) {
        int difference;
        final int temp = maxLen - word.length();
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