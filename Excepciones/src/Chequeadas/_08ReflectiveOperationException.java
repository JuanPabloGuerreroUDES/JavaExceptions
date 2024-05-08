package Chequeadas;

public class _08ReflectiveOperationException {
    
////ReflectiveOperationException es una clase base para varias excepciones 
//relacionadas con la reflexión, como NoSuchMethodException, NoSuchFieldException,
//entre otras. Se utiliza cuando se realizan operaciones de reflexión, 
//como obtener métodos, campos o constructores, y algo sale mal.

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            clazz.getMethod("nonExistentMethod");
        } catch (ReflectiveOperationException e) {
            System.out.println("Error en operaciones de reflexión: " + e.getMessage());
        }
    }
}
//ReflectiveOperationException proporciona un mecanismo unificado 
//para manejar errores relacionados con la reflexión. Al usar esta excepción, 
//se puede controlar y responder a errores cuando se trabaja con técnicas avanzadas de reflexión, 
//lo que permite una mayor flexibilidad y seguridad al manipular clases y objetos de manera dinámica.