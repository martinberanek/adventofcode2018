import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Long, Long> result = Files.lines(Paths.get("input.txt"))
                .map(s -> Arrays.stream(s.split("")).collect(groupingBy(identity(), counting())))
                .flatMap(i -> i.values().stream().distinct())
                .collect(groupingBy(identity(), counting()));
        System.out.println(result.get(2L) * result.get(3L));
    }
}
