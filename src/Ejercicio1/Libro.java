package Ejercicio1;
public class Libro {
    String titulo;
    String autor;
    int NumerodePaginas;

    public Libro() {
        this.titulo = "Don Quijote de la Mancha";
        this.autor = "Miguel de Cervantes";
        this.NumerodePaginas = 100;
    }
    public Libro(String titulo, String autor, int NumerodePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.NumerodePaginas = NumerodePaginas;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + NumerodePaginas);
    }
}
