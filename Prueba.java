public class Prueba {
    private static LibroDeTexto libroDeTextoUNIAJC;

    public static void main(String[] args) {

        LibroDeTexto libroDeTexto = new LibroDeTexto("Parcial1", "Oscar bautista", "TI");
        libroDeTexto.setPropietario("Esteban Parada");
        libroDeTexto.setPrecio(43000);
        
        Novela novela = new Novela("Progamacion", "Oscar Bautista", "Aventuras");
        novela.setPropietario("Propietario3");
        novela.setPrecio(30000);

        System.out.println("Libro de Texto:");
        libroDeTexto.imprimirDetalles();
        System.out.println();

        System.out.println("Libro de Texto UNIAJC:");
        libroDeTextoUNIAJC.imprimirDetalles();
        System.out.println();

        System.out.println("Novela:");
        novela.imprimirDetalles();
    }
}
