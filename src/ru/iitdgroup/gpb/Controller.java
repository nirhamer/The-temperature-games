package ru.iitdgroup.gpb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        List<DtoStage1> readData = readData();
        List<DtoStage2> processedData = processData(readData);
        presentDataToUser(processedData);
    }

    private static List<DtoStage1> readData() {
        System.out.println("readData");
        return new ArrayList<DtoStage1>(Arrays.asList(
                new DtoStage1(55),
                new DtoStage1(30),
                new DtoStage1(100)
        ));
    }

    private static List<DtoStage2> processData(List<DtoStage1> dataToProcess){
        System.out.println("processData");
        List<DtoStage2> returnList = new ArrayList<>();
        for (DtoStage1 data : dataToProcess){
            System.out.println(dataToProcess);
            final DtoStage2 thisObject = new DtoStage2("PD "+data.getData());
            returnList.add(thisObject);
            System.out.println(thisObject);

        }
        return returnList;
    }


    private static void presentDataToUser(List<DtoStage2> processedData){
        System.out.println("presentData");
        for (DtoStage2 processedDatum : processedData) {
            System.out.println(processedDatum);
        }
    }

}
