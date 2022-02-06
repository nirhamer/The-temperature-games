import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class findMaxMin {
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\nir\\Desktop/file1.csv"))) {
            IntSummaryStatistics statistics = stream
                    .map(s -> s.split(",")[1])
                    .mapToInt(Integer::valueOf)
                    .summaryStatistics();
            System.out.println("Lowest:: " + statistics.getMin());
            System.out.println("Highest:: " + statistics.getMax());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}