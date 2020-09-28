package practica3.ejer11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStream {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Java", "PHP", "C++");

        WithStream ws = new WithStream();
        System.out.println("WithStream: " + ws.getFilterOutput(lines,"PHP"));
    }

    public List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = lines.stream()
                .filter(e ->!filter.equals(e))
                .collect(Collectors.toList());
        return result;
    }

}
