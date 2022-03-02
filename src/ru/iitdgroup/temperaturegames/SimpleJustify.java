package ru.iitdgroup.temperaturegames;

public class SimpleJustify {
    public static void main(String[] args) {
        partOne();
        System.out.println();
        partTwo();
    }

    //TODO move out lines 16 and 17 outside of the methods
    //TODO create step 3 use find longest element helper function

    public static void partOne() {
        String text = "Sabers have a base damage multiplier of 1.0x.";
        String[] separated = text.split(" ");
        for (String word : separated) {
            System.out.println(word);
        }
    }

    public static void partTwo() {
        String text = "Sabers have a base damage multiplier of 1.0x.";
        String[] separated = text.split(" ");
        int maxLen = findLongestElement(separated);
        for (String word : separated) {
            System.out.println(getSpaces(word, maxLen) + word);

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

    private static String getSpaces(String word, int maxLen) {
        int difference = maxLen - word.length();
        String a = "";
        for (int i = 0; i < difference; i++) {
            a = a + " ";
        }
        return a;
    }
}