import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class test {
    //region define DTO
        public static void  dTO() throws FileNotFoundException {
            String filename = "C:\\Users\\nir\\Desktop/The temperature games.csv";
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);
            Integer lineCounter = 1;
        }
    //endregion


    //region define obtainData
    public static void  obtainData(Scanner inputFile, Integer lineCounter) {
        while (inputFile.hasNext()) {
            final String currentLine = inputFile.nextLine();
            if (lineCounter != 1) {
                String[] parts = currentLine.split(",");
                final String dateString = parts[0];
                final String minString = parts[1];
                final String maxString = parts[2];
                LocalDate date = LocalDate.parse(dateString);
                double minimum = Double.parseDouble(minString);
                double maximum = Double.parseDouble(maxString);
                System.out.printf("%s Min: %g, Max:%g\n", date.toString(), minimum, maximum);
            }
            lineCounter++;
        }
    }
    //endregion


    //region define endProcess
    public static void  closeFile(Scanner inputFile, Integer lineCounter){
        inputFile.close();
    }
    //endregion

}