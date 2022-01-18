import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class identifySeries {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(65);
        list.add(85);
        list.add(1);
        list.add(54);
        list.add(5);

        Collections.sort(list);

        for (int i = 0; i < 3; i++)
            System.out.println(list.get(i));
    }
}