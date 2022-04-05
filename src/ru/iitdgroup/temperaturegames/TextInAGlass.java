package ru.iitdgroup.temperaturegames;

@SuppressWarnings("java:S106") //don't mark System.out.println as a warning
public class TextInAGlass {

    public static void main(String[] args) {
        final int MARGIN = 25; //max line length to print
        final String text = "A very long english text with many additional-so-long-long-long words. Twice. A very long english text with many additional words.";

        //a utility block to visualize our printing area
        for (int i = 0; i < MARGIN; i++) {
            System.out.print("*"); //a number of stars in a line
        }
        System.out.println(); //a new line to start the text

        final String[] words = text.split("\\s+"); //from string to array. \\s+ allows to remove many spaces between words

        int wordIndex = 0; //a pointer to current processing word
        int lineLength = 0; //an accumulator for already printed line length

        while (wordIndex < words.length) { //plan to print all words

            String word = words[wordIndex]; //current word. will decide print or not below

            if (word.length() > MARGIN) { //A guard block to handle words (single word) which can't fit. Print them beyond the margin
                if (lineLength != 0) { //if there was something printed in current line
                    System.out.println(); //start the new one
                }
                System.out.print(word); //print the word even it will be printed beyond the margin
                lineLength = MARGIN; //fix reaching the margin fact for processing nex word on the next cycle turn
                ++wordIndex; //fix the fact that will take new word on the next turn
            } else {
                //main logic block
                final String separator = lineLength == 0 ? "" : " "; //if this is the first word in a line don't add space before
                final int printWordSize = separator.length() + word.length(); //the size of printing unit
                if (lineLength < MARGIN - printWordSize) { //if the printing unit can be printed before margin
                    System.out.print(separator + words[wordIndex]); //print it
                    lineLength += printWordSize; //and accumulate the printed length for current line
                    ++wordIndex; //take next word on the next cycle turn
                } else {
                    // logic block for the state where the next printing unit can't be printed before the margin
                    System.out.println(); //just starting new line
                    lineLength = 0; //and fix this fact
                    //we are not taking next word here
                }
            }
        }
    }
}