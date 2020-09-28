#Streams

Let’s start with a bit of theory. What’s the definition of a stream? A short definition is “a sequence of elements from a source that supports aggregate operations.” Let’s break it down:

Sequence of elements: A stream provides an interface to a sequenced set of values of a specific element type. However, streams don’t actually store elements; they are computed on demand.

Source: Streams consume from a data-providing source such as collections, arrays, or I/O resources.

Aggregate operations: Streams support SQL-like operations and common operations from functional programing languages, such as filter, map, reduce, find, match, sorted, and so on.