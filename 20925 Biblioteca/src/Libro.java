public class Libro extends Publicacion {
    private int numPaginas;

    public Libro(int numPaginas, String Autor, String Titulo) {
        super(Titulo, Autor);
        this.numPaginas = numPaginas;

    }

    @Override
    public void MostrarFicha() {
        super.MostrarFicha();
        System.out.println("y el numero de paginas es " + numPaginas);
    }

}
