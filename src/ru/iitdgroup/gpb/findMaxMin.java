package ru.iitdgroup.gpb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class findMaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\nir\\Desktop/file1.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();

        String line = bufReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
        System.out.println( "ArrayList Min Value: " + Collections.min(listOfLines) );
        System.out.println( "ArrayList Max Value: " + Collections.max(listOfLines) );
        bufReader.close();

        System.out.printf(String.valueOf(listOfLines));
    }
}