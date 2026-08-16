package Ejercicio3;

public class InstanciarEstudiante {
    static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Sebastian", 17);
        Estudiante estudiante3 = new Estudiante("Samuel", 17, "Ingeniería");

        //Mostrar Constructor por defecto
        System.out.println("Estudiante 1: " + estudiante1.nombre + ", Edad: " + estudiante1.edad + ", Curso: " + estudiante1.curso);
        //Mostrar Constructor con nombre y edad
        System.out.println("Estudiante 2: " + estudiante2.nombre + ", Edad: " + estudiante2.edad + ", Curso: " + estudiante2.curso);
        //Mostrar Constructor con This
        System.out.println("Estudiante 3: " + estudiante3.nombre + ", Edad: " + estudiante3.edad + ", Curso: " + estudiante3.curso);

    }
}
