import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\nir\\Desktop/The temperature games.csv";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        int lineCounter = 1;
        List<DataPointDto> fileLInes = new ArrayList<>();
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
                DataPointDto thisDataPoint = new DataPointDto();
                thisDataPoint.date = date;
                thisDataPoint.minimum = minimum;
                thisDataPoint.maximum = maximum;
                System.out.printf("%s Min: %g, Max:%g\n", date.toString(), minimum, maximum);
                fileLInes.add(thisDataPoint);
            }
            lineCounter++;
        }
        //Close file
        inputFile.close();
    }
}