package eje12;

import java.util.Arrays;
import java.util.List;

public class Streams {

    
	public static void main(String[] args) {
		System.out.println("Streams!!!");
		List<String> myList = Arrays.asList("a1", "b1", "c2", "c1");
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
	}
	
	/*a) ¿Qué retorna su ejecución?
	 	C1, C2
	  b) ¿Qué son los Stream?
	   A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
	   The features of Java stream are: 
	   
	   	A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.

		Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
		
		Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.
	  c) Brinde otro ejemplo de uso de los mismos 
	  final List<Field> filteredFields = 
	  		allFields.stream().filter(field -> !field.getName().startsWith("abc"))
	  			.collect(Collectors.toList());
     */
}
