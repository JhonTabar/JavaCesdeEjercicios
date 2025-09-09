public class vehiculo {

    String marca = " ";
    String modelo = " ";
    int age = 0;
    int velocidad;


/* Acelera el vehiculo */
    public void acelerarvehiculo(int acelerar) {
        velocidad = velocidad + acelerar;
        System.out.println("El vehiculo esta acelerando y va a " + velocidad + " kilometros por hora");
    }
/* frena el vehiculo */
    public void frenarvehiculo() {
        System.out.println("El vehiculo esta frenando");
    }

    void mostrarInformacion() {
        System.out.println("La marca del vehiculo es: " + marca);
        System.out.println("El modelo del vehiculo es: " + modelo);
        System.out.println("La edad del vehiculo es: " + age);
    }
}
