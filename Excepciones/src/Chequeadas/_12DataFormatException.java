package Chequeadas;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class _12DataFormatException {
    
//DataFormatException se lanza cuando hay problemas con el formato de datos, 
//especialmente en el contexto de compresión y descompresión de datos.
//Se usa cuando los datos tienen un formato incorrecto o inesperado, lo que dificulta su procesamiento.

    public static void main(String[] args) {
        try {
            byte[] data = {1, 2, 3};  // Datos incorrectos para descompresión
            Inflater inflater = new Inflater();
            inflater.setInput(data);
            byte[] output = new byte[100];
            inflater.inflate(output);
        } catch (DataFormatException e) {
            System.out.println("Formato de datos incorrecto: " + e.getMessage());
        }
    }
}
//Se utiliza para manejar problemas de formato de datos, 
//como cuando se trabaja con archivos comprimidos o flujos de datos.
//Capturar esta excepción permite manejar errores cuando los datos 
//no se pueden descomprimir o procesar correctamente,
//proporcionando información sobre el problema y evitando fallos inesperados.
