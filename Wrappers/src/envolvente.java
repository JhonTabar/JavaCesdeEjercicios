public class envolvente {
    public static void main(String[] args) {
    int numero = 5; /* Tipo primitivo */
    Integer numeroObjeto = numero; /* autoboxing: ser convierte automaticamente */
    int otroNumero = numeroObjeto; /* unboxing: de objeto a primitivo */

    int a = 10;
    double b = a;
    System.out.println(a);

    double x = 5.7;
    int y = (int) x;
    System.out.println(x);
    System.out.println(y);

    String texto = "456";
    int numeroTres = Integer.parseInt(texto);
    System.out.println(numeroTres);
    
    String textoDos = "True";
    boolean numeroUno = Boolean.parseBoolean(textoDos);
    System.out.println(numeroUno);
    System.out.println(textoDos);
    }
}
