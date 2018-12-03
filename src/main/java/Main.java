import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> list = Files.lines(Paths.get("input.txt")).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                String result = samechars(list.get(i), list.get(j));
                if (result.length() == list.get(i).length() - 1) {
                    System.out.println(result);
                }
            }
        }
    }

    private static String samechars(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            result += s1.charAt(i) == s2.charAt(i) ? s1.charAt(i) : "";
        }
        return result;
    }

}
