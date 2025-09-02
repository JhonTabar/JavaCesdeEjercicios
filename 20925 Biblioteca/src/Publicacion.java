public class Publicacion {
    protected String Titulo;
    protected String Autor;

    public Publicacion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public void MostrarFicha() {
        Publicacion Libro = new Publicacion("1984", "George Orwell");
        System.out.println("El titulo del libro es: " + Libro.Titulo + " escrito por " + Libro.Autor);
    }
}
