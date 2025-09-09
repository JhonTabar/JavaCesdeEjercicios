public class Main {
public static void main(String[] args) {
// Figura miFigura = new Figura("azul"); // ERROR! No se puede instanciar.
Circulo miCirculo = new Circulo("Rojo", 5.0);
miCirculo.mostrarColor(); // Llama al método concreto heredado
double area = miCirculo.calcularArea(); // Llama al método implementado
System.out.println("El área del círculo es: " + area);
}
}