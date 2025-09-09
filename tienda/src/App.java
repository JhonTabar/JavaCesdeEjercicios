/* public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        tienda miproducto = new tienda();

        miproducto.documento = "06781";
        miproducto.nombre = "product";
        miproducto.precio = 10.4;
        miproducto.stock = 5;

        miproducto.mostrarInformacion();
        miproducto.vender();

    }
} */

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        vehiculo carrito = new vehiculo();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la marca: ");
        carrito.marca = leer.nextLine();
        System.out.println("Ingrese el modelo: ");
        carrito.modelo = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        carrito.age = leer.nextInt();
        System.out.println("A que velocidad va el carro: ");
        carrito.velocidad = leer.nextInt();

        int velocidades = 0;
        System.out.println("A cuantos km quere acelerar: ");
        velocidades = leer.nextInt();


        carrito.acelerarvehiculo(velocidades);
        carrito.frenarvehiculo();
        carrito.mostrarInformacion();

        leer.close();
    }
}

/* FINISH AT HOME XD */
/* Add switch statements to allow users to decide whether to acelerate or to brake */