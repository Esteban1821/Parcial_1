/* Clase LibroDeTexto que extiende Libro*/
public class LibroDeTexto extends Libro {
    private String curso;
 
    // Constructor
    public LibroDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }
 
    // Getter y setter
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
 
    // Redefinición del método para imprimir detalles
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Curso: " + curso);
    }
}
