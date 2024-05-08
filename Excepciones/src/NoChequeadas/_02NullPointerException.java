public class _02NullPointerException {

//NullPointerException, esta excepción se lanza cuando se intenta acceder a un objeto que es null,
//es decir, que no apunta a ninguna dirección de memoria válida.

    @SuppressWarnings("null")
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); 
        } catch (NullPointerException excepcion) {
            System.out.println("Se ha producido una excepcion del tipo: NullPointerException");
        }
    }
}
//En este ejemplo, la excepción NullPointerException se lanza automáticamente cuando se llama al 
//método length() en una cadena nula. El bloque catch captura esta excepción y permite manejarla 
//de forma adecuada en lugar de que el programa se detenga.
