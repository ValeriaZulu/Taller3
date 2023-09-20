import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        //Inicio del scanner
        Scanner scanner = new Scanner(System.in);

        // Interacción con el usuario
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("bienvenido " + nombre + ", por favor ingresa la cantidad de materias");
        int cantMaterias = scanner.nextInt();
        System.out.println("Ingrese la cantidad de notas de las materias");
        int cantNotas = scanner.nextInt();

        // Inicio de las matrices y array
        double[][] notas = new double[cantMaterias][cantNotas];
        double[][] porcentaje = new double[cantMaterias][cantNotas];
        String[] materias = new String[cantMaterias];

        // Ciclo de llenado de las matrices
        for (int i = 0; i < cantMaterias; i++) {
            System.out.println("Ingrese la materia " + (i + 1));
            materias[i] = scanner.next();

            for (int n = 0; n < cantNotas; n++) {
                System.out.println("Ingrese la nota " + (n + 1));
                notas[i][n] = scanner.nextDouble();
                System.out.println("Ingrese el porcentaje de la nota  " + (n + 1) + " de 0 a 100:");
                porcentaje[i][n] = scanner.nextDouble();
            }
        }

        // Proceso para calcular el promedio de cada materia:
        double[] promedio = new double[cantMaterias];

        for (int i = 0; i < cantMaterias; i++) {
            double sumatoria = 0;
            double sumatoria2 = 0;
            for (int n = 0; n < cantNotas; n++) {
                sumatoria += notas[i][n];
                sumatoria2 += porcentaje[i][n];
            }
            promedio[i] = ((sumatoria * (sumatoria2 / 100)) / cantNotas);
            System.out.println("El promedio de " + materias[i] + " es: " + promedio[i]);
        }
        
        // Proceso para calcular el promedio del semestre
        double sumaPromedio=0;

        for (double i : promedio) {
        sumaPromedio += i;
        }
        double promedioTotal= sumaPromedio /cantMaterias;
        System.out.println("El promedio del semestre es: " + promedioTotal);
        
        scanner.close();
    }
}
