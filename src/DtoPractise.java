import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoPractise {

    public static void main(String[] args) throws IOException {

        String input1 = "C:\\Users\\nir\\Desktop\\file1.txt";
        String input2 = "C:\\Users\\nir\\Desktop\\file2.txt";

        BufferedReader br1 = new BufferedReader(new FileReader(input1));

        BufferedReader br2 = new BufferedReader(new FileReader(input2));

        String line1;
        String line2;

        String index1;
        String index2;

        while ((line2 = br2.readLine()) != null) {
            line1 = br1.readLine();

            index1 = line1.split(",")[0];
            index2 = line2.split(",")[0];
            System.out.println(index1 + "\t" + index2);

        }
    }
}