package ar.edu.unnoba.ipoo.practica4.ejercicio12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static List<String> lines = Arrays.asList("Java", "PHP", "C++");
	
	public List<String> getFilterOutput(List<String> lines, String filter) {
		List<String> result = new ArrayList<String>();
		for(String line: lines) {
			if(!"PHP".equals(line)) {
				result.add(line);
			}
		}
		return result;
	}
	
	public List<String> getFilterOutputBetter(List<String> lines) {
		return lines.stream().filter(s -> !"PHP".equals(s)).sorted().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		Streams s = new Streams();
		System.out.println(s.getFilterOutput(Streams.lines, null));
		System.out.println(s.getFilterOutputBetter(Streams.lines));
	}
	
	/*a) ¿Qué retorna su ejecución?  
	 	[Java, C++]
	 * b) Re escriba el código usando Streams
	 
	 */
}
