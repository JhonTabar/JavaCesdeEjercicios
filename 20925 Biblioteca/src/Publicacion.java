public class Publicacion {
    protected String Titulo;
    protected String Autor;

    public Publicacion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public void MostrarFicha() {
        System.out.println("El titulo del libro es: " + Titulo + " escrito por " + Autor);
    }
}
