
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public void mostrarColor() {
        System.out.println("El color de la figura es: " + this.color);
    }

    public abstract double calcularArea();
}