package practica3.ejer11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutStream {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Java", "PHP", "C++");

        WithoutStream ws = new WithoutStream();
        System.out.println("WithoutStream: " + ws.getFilterOutput(lines,"PHP"));
    }

    public List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();

        for (String line : lines) {
            if (!filter.equals(line)) {
                result.add(line);
            }
        }

        return result;
    }

}
