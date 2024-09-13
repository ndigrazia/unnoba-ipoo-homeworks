package practica2.eje4;

public class Main {

    public static void main(String[] args) {
        Operacion num1 = new Numero(10);
        Operacion num2 = new Numero(5);
        Operacion num3 = new Numero(2);

        // Crear expresiones usando clases concretas para cada operación
        Operacion sumaResta = new Resta(new Suma(num1, num2), num3);
       
        Operacion multiDiv = new Division(new Multiplicacion(num1, num2), num3);
        // Calcular
        System.out.println("Suma y Resta: " + sumaResta.calcular());
        System.out.println("Multiplicación y División: " +
        multiDiv.calcular());
    }

}
