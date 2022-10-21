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
        System.out.println("WithStream: " + ws.getFilterOutput( lines.stream(),"PHP"));
    }

    public List<String> getFilterOutput(Stream<String> lines, String fil) {
        return lines.filter(e ->!fil.equals(e))
                .collect(Collectors.toList());
    }

}
