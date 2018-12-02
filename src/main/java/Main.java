import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Integer> input() throws IOException {
        return Files.lines(Paths.get("input.txt"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        Integer sum = 0;
        for (Integer i : input()) {
            sum += i;
        }
        System.out.println(sum);
    }
}
