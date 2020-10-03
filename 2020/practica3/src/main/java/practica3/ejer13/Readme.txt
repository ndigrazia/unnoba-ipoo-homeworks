 la siguiente información:
a) ¿Qué son?
#Streams

Let’s start with a bit of theory. What’s the definition of a stream? A short definition is “a sequence of elements from a source that supports aggregate operations.” Let’s break it down:

Sequence of elements: A stream provides an interface to a sequenced set of values of a specific element type. However, streams don’t actually store elements; they are computed on demand.

Source: Streams consume from a data-providing source such as collections, arrays, or I/O resources.

Aggregate operations: Streams support SQL-like operations and common operations from functional programing languages, such as filter, map, reduce, find, match, sorted, and so on.

b) Cómo se crean / Creación de los mismos.

Using Collection: collection.stream()
Create a stream from specified values: Stream.of()
Create stream from an array: Arrays.stream()
Create an empty stream using Stream.empty()
Create a Stream using Stream.builder()
Create an infinite Stream using Stream.iterate()
Create an infinite Stream using Stream.generate() method
Create stream from a Pattern using Predicate

c) Operaciones intermedias
map(), filter(), distinct(), sorted(), limit(), skip()

d) Finalizadores u Operaciones terminales
forEach(), toArray(), reduce(), collect(), min(), sum(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()

e) ¿A que se refiere con que los Streams son Lazy?
Streams are lazy because intermediate operations are not evaluated until terminal operation is invoked. Each intermediate operation creates a new stream, stores the provided operation/function and return the new stream. The pipeline accumulates these newly created streams.
The time when terminal operation is called, traversal of streams begins and the associated function is performed one by one.

f) Orden de ejecución.

Obtener streams.Operaciones intermedias.Finalizadores u Operaciones terminales

g) Buenas prácticas de uso
