package Chequeadas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public class _23InvalidObjectException {
    
//InvalidObjectException se lanza cuando un objeto no es válido durante la deserialización. 
//Se usa para indicar que el objeto deserializado no cumple con las expectativas o está corrupto.

    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(new byte[0]));
            Object obj = ois.readObject();  // Error de objeto no válido
        } catch (InvalidObjectException e) {
            System.out.println("Objeto no válido: " + e+" Message()");
        }
    }
}
//Se usa para controlar errores durante la deserialización de objetos. 
//Capturar esta excepción permite tomar medidas correctivas cuando el objeto 
//deserializado no es el esperado o está dañado, evitando errores inesperados y proporcionando información sobre el problema.
