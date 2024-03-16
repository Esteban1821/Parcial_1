/* Clase Novela que extiende Libro */
public class Novela extends Libro {
    private String tipo;

    /* Constructor */
    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    /* Getter y setter */
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    /* Método para imprimir detalles */
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tipo: " + tipo);
    }
}
