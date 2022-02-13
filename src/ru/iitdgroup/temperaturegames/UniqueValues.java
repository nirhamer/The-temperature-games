package ru.iitdgroup.temperaturegames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueValues {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\nir\\Desktop\\file1.txt"));
        Scanner scan = new Scanner(new File("C:\\Users\\nir\\Desktop\\file2.txt"));

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        while (input.hasNext()) {
            list1.add(input.next());
        }

        while (scan.hasNext()) {
            list2.add(scan.next());
        }

        // go over list 1
        for (int i = list1.size() - 1; i >= 0; i--) {
            // if there are two identical strings
            if (list2.contains(list1.get(i))) {
                // remove the String from list 2
                list2.remove(list2.indexOf(list1.get(i)));
                // remove the String from list 1
                list1.remove(i);
            }
        }

        // combine the lists
        list1.addAll(list2);

        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i).replace(".", ""));
        }
        System.out.println("Unique Values: " + list1);
    }

}