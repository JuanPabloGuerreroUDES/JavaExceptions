package Chequeadas;

public class _04ClassNotFoundException {
    
//ClassNotFoundException se lanza cuando un programa intenta cargar una clase usando su nombre,
//pero la clase no se encuentra disponible en el contexto actual. 
//Se utiliza comúnmente en operaciones de reflexión, 
//cargadores de clases o cuando se trabaja con aplicaciones que cargan clases en tiempo de ejecución.

    public static void main(String[] args) {
        try {
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}
//Esta excepción es útil para controlar errores cuando se usan técnicas de reflexión o se trabaja 
//con bibliotecas externas que pueden no estar disponibles en el entorno actual. 
//Al capturar ClassNotFoundException, 
//se puede informar al usuario o tomar medidas para corregir el problema sin interrumpir el flujo del programa.
