package ru.iitdgroup.gpb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DtoPractise {

    public static void main(String[] args) throws IOException {

        final TwoListsDto fileData = doReadFiles();
//        final TwoListsDto fileData = doInputData();

        doPrinting(fileData.listOne, fileData.listTwo);

        //findUnique(fileData.listOne, fileData.listTwo);
    }

    private static TwoListsDto doInputData() {
        throw new IllegalStateException("Not implemented yet");
    }


    private static TwoListsDto doReadFiles() throws IOException {
        String input1 = "C:\\Users\\nir\\Desktop\\file1.txt";
        String input2 = "C:\\Users\\nir\\Desktop\\file2.txt";

        BufferedReader br1 = new BufferedReader(new FileReader(input1));

        BufferedReader br2 = new BufferedReader(new FileReader(input2));

        String line1;
        String line2;

        String index1;
        String index2;

        List<Integer> file1Data = new ArrayList<>();
        List<Integer> file2Data = new ArrayList<>();

        while ((line2 = br2.readLine()) != null) {
            line1 = br1.readLine();

            index1 = line1.split(",")[0];
            index2 = line2.split(",")[0];
            file1Data.add(Integer.parseInt(index1));
            file2Data.add(Integer.parseInt(index2));

        }

        TwoListsDto returnData = new TwoListsDto();
        returnData.listOne = file1Data;
        returnData.listTwo = file2Data;

        return returnData;

    }

    public static List<Integer> doPrinting(List<Integer> listA, List<Integer> listB) {

        for (int i = 0; i < Math.min(listA.size(), listB.size()); i++) {
            System.out.printf("%d\t%d\n", listA.get(i), listB.get(i));
        }


        return null;
    }

    public static List<Integer> findUnique(List<Integer> listA, List<Integer> listB) {

        throw new IllegalStateException("Not implemented yet");

    }

    public static class TwoListsDto {
        public List<Integer> listOne;
        public List<Integer> listTwo;
    }
}
