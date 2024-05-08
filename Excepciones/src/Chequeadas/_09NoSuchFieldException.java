package Chequeadas;

import java.lang.reflect.*;
public class _09NoSuchFieldException {
    
////NoSuchFieldException se lanza cuando se intenta acceder a un campo de una clase que no existe.
//Se utiliza en operaciones de reflexión donde se espera un campo 
//pero no se encuentra uno con el nombre o especificaciones requeridas.

    @SuppressWarnings("unused")
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Field field = clazz.getField("nonexistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("Campo no encontrado: " + e.getMessage());
        }
    }

}
//Esta excepción se usa para controlar situaciones donde se intenta acceder a un 
//campo de una clase pero no se encuentra. Es especialmente útil para 
//operaciones de reflexión y garantiza que el programa maneje errores de manera 
//segura cuando no se puede acceder a un campo esperado.

