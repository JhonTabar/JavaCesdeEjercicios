public class centroVeterinario {
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private String tipo;

    public centroVeterinario(){

    }

    public centroVeterinario(String nit, String nombre){
        this.nit = nit;
        this.nombre = nombre;
    }

    public void mostrarInformacion(){
        System.out.println("Centro Veterinario patitas con amor");
        System.out.println("Centro veterinario huellitas");
    }


    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
