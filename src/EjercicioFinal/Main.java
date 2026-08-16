package EjercicioFinal;
import java.util.Scanner;
import Ejercicio1.Libro;
import Ejercicio2.CuentaBancaria;
import Ejercicio3.Estudiante;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DATOS DEL LIBRO
        System.out.println("DATOS DEL LIBRO");

        System.out.print("Ingrese el título: ");
        String titulo = input.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = input.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int numeroPaginas = input.nextInt();
        input.nextLine();

        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Otro constructor de Libro
        Libro libro1 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                417
        );

        // CUENTA BANCARIA
        System.out.println("\nDATOS DE LA CUENTA BANCARIA");

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = input.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = input.nextLine();
        System.out.print("Ingrese el saldo: ");
        double saldo = input.nextDouble();
        input.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(
                numeroCuenta,
                saldo,
                tipoCuenta
        );

        // Otros constructores de CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria(
                "12345",
                "Ahorros"
        );
        CuentaBancaria cuenta3 = new CuentaBancaria(
                "67890",
                500000,
                "Corriente"
        );

        // ESTUDIANTE
        System.out.println("\nDATOS DEL ESTUDIANTE");

        System.out.print("Ingrese el nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = input.nextInt();
        input.nextLine();
        System.out.print("Ingrese el curso: ");
        String curso = input.nextLine();

        Estudiante estudiante = new Estudiante(
                nombre,
                edad,
                curso
        );

        // Otros constructores de Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(
                "Sebas",
                17
        );
        Estudiante estudiante3 = new Estudiante(
                "Sebas",
                17,
                "Programación"
        );

        // Mostrar información ingresada
        System.out.println("\nINFORMACIÓN INGRESADA");

        System.out.println("\nLibro:");
        System.out.println(libro.toString());

        System.out.println("\nCuenta bancaria:");
        System.out.println(cuenta.toString());

        System.out.println("\nEstudiante:");
        System.out.println(estudiante.toString());

        input.close();
    }
}