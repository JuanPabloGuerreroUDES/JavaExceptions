package Chequeadas;

import java.net.MalformedURLException;
import java.net.*;

public class _15MalformedURLException {
    
//MalformedURLException se lanza cuando se intenta crear una URL 
//con un formato incorrecto o no válido. 
//Es comúnmente utilizada cuando se trabaja con URLs y puede ser causada 
//por errores en la construcción de la URL, caracteres no válidos o esquemas incorrectos.

    @SuppressWarnings({ "deprecation", "unused" })
    public static void main(String[]args) {
        try {
            URL url = new URL("malformed-url");  // URL inválida
        } catch (MalformedURLException e) {
            System.out.println("URL mal formada: " + e.getMessage());
        }
    }
}
//Se usa para controlar errores cuando se trabaja con URLs, 
//asegurando que el programa maneje adecuadamente URLs mal formadas o incorrectas. 
//Capturar esta excepción permite informar al usuario sobre el error y tomar medidas para corregirlo, 
//evitando errores inesperados al trabajar con conexiones de red.
