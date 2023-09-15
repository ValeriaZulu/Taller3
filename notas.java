import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        //declaración de variables
        double promedio;
        Scanner scanner = new Scanner(System.in);

        //Interacción con el usuario
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("bienvenido " + nombre + ", por favor ingresa la materia");
        String materia = scanner.nextLine();
        System.out.println("Ingrese la cantidad de notas de " + materia);
        int noNotas = scanner.nextInt();

        //Inicio de los arreglos
        double[] arregloNotas = new double[noNotas];
        double[] arregloPorcentaje = new double[noNotas];

        //Ciclo de llenado de los arreglos
        for (int i = 0; i < noNotas; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            arregloNotas[i] = scanner.nextDouble();

            System.out.println("Ingrese el porcentaje de la nota  " + (i + 1) + " de 0 a 100:");
            arregloPorcentaje[i] = scanner.nextDouble();
        }

        //Proceso para calcular el promedio:
        //Sumatoria de notas y porcentajes
        double sumatoria = 0;
        double sumatoria2 = 0;

        for (int i = 0; i < noNotas; i++) {
            sumatoria += arregloNotas[i];
            sumatoria2 += arregloPorcentaje[i];
        }

        //Cálculo del promedio
        promedio = ((sumatoria * (sumatoria2 / 100)) / noNotas);

        //Impresión del promedio
        System.out.println("El promedio es: " + promedio);

        scanner.close();
    }
}
