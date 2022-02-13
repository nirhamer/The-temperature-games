package ru.iitdgroup.temperaturegames;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class findMaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nir\\Desktop/The temperature games.csv"));
        reader.readLine();
        String line;
        ArrayList<Double> listOfLines = new ArrayList<>();
        while ((line = reader.readLine()) != null){
            double lineString = Double.parseDouble(line);
            listOfLines.add(lineString);
        }
        System.out.println( "ArrayList Min Value: " + Collections.min(listOfLines) );
        System.out.println( "ArrayList Max Value: " + Collections.max(listOfLines) );
        reader.close();

        System.out.printf(String.valueOf(listOfLines));
    }
}