// Clase LibroDeTextoUNIAJC que extiende LibroDeTexto
public class LibroDeTextoUNIAJC extends LibroDeTexto {
    private String facultad;

    // Constructor
    public LibroDeTextoUNIAJC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    // Getter y setter
    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }

    // Redefinición del método para imprimir detalles
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Facultad: " + facultad);
    }
}
