import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        //gets filename
        //Scanner keyboard = new Scanner("C:\\Users\\nir\\Desktop/The temperature games.csv");
        //System.out.println("C:\\Users\\nir\\Desktop/The temperature games.csv");
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
                //System.out.println(lineCounter + " " + currentLine);
                final String dateString = parts[-0];
                final String minString = parts[1];
                final String maxString = parts[2];
                //System.out.println(lineCounter + " Date:" + dateString + " Min: " + minString + " max: " + maxString);

                LocalDate date = LocalDate.parse(dateString);
                double minimum = Double.parseDouble(minString);
                double maximum = Double.parseDouble(maxString);
                System.out.printf("%s Min: %g, Max:%g\n", date.toString(), minimum,maximum);
                //System.out.println(date);
                //System.out.println(minimum);
                //System.out.println(maximum);
            }
            // TOD print our real representation
            lineCounter++;
        }
        //Close file
        inputFile.close();

        //Print out the lowest value in the list and highest
        //System.out.println("Min number is: " +min);
        //System.out.println("Max number is: " +max);
    }
}