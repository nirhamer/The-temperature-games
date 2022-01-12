import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\nir\\Desktop/The temperature games.csv";



        //opens file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //to read all lines of file
        Integer lineCounter = 1;
        while (inputFile.hasNext()) {

            final String currentLine = inputFile.nextLine();
            if (lineCounter != 1) {
                String[] parts = currentLine.split(",");
                final String maxString = parts[2];


                double maximum = Double.parseDouble(maxString);

                System.out.println(maximum);
            }
            lineCounter++;
        }
        //Close file
        inputFile.close();

        //Print out the lowest value in the list and highest
        //System.out.println("Min number is: " +min);
        //System.out.println("Max number is: " +max);
    }
}