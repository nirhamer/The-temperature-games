import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] myArray = {5, 8, 12, 9, 50, 11, 4};

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(getThreeLowest(myArray)));
    }

    private static int[] getThreeLowest(int[] array) {
        int[] lowestValues = new int[3];
        Arrays.fill(lowestValues, Integer.MAX_VALUE);

        for (int n : array) {
            if (n < lowestValues[2]) {
                lowestValues[2] = n;
                Arrays.sort(lowestValues);
            }
        }
        return lowestValues;
    }
}