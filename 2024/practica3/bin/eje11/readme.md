Static import is a feature introduced in the Java programming language that allows members (fields and methods) which have been scoped within their container class as public static, to be used in Java code without specifying the class in which the field has been defined

Ambiguity
If two static members of the same name are imported from multiple different classes, the compiler will throw an error, as it will not be able to determine which member to use in the absence of class name qualification. For example, the following code will fail to compile:

import static java.lang.Integer.*;
import static java.lang.Long.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
    }
}
In this case, MAX_VALUE is ambiguous, as the MAX_VALUE field is an attribute of both java.lang.Integer and java.lang.Long. Prefixing the field with its class name will disambiguate the class from which MAX_VALUE is derived, but doing so makes the use of a static import redundan