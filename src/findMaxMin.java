public class findMaxMin {
    public static void minMax(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum element is " + min);
        System.out.println("Maximum element is " + max);
    }
}