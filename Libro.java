/* Clase base Libro */
public class Libro {
    private String titulo;
    private String autor;
    private String propietario;
    private double precio;

    /* Constructor */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /* Getters y setters */
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    /* Método para imprimir detalles del libro */
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Propietario: " + propietario);
        System.out.println("Precio: " + precio);
    }
}