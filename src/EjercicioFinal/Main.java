package EjercicioFinal;
import java.util.Scanner;
import Ejercicio1.Libro;
import Ejercicio2.CuentaBancaria;
import Ejercicio3.Estudiante;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del libro
        System.out.println("DATOS DEL LIBRO");
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine();

        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Solicitar datos de la cuenta bancaria
        System.out.println("\nDATOS DE LA CUENTA BANCARIA");
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();

        System.out.print("Ingrese el saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(
                numeroCuenta,
                saldo,
                tipoCuenta
        );

        // Solicitar datos del estudiante
        System.out.println("\nDATOS DEL ESTUDIANTE");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el curso: ");
        String curso = scanner.nextLine();

        Estudiante estudiante = new Estudiante(
                nombre,
                edad,
                curso
        );

        // Mostrar la información ingresada
        System.out.println("\nINFORMACIÓN INGRESADA");
        System.out.println("\nLibro:");
        System.out.println(libro.toString());

        System.out.println("\nCuenta bancaria:");
        System.out.println(cuenta.toString());

        System.out.println("\nEstudiante:");
        System.out.println(estudiante.toString());

        scanner.close();
    }
}