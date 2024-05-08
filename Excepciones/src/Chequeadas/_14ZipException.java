package Chequeadas;

import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class _14ZipException {
    
//ZipException se lanza cuando hay problemas con archivos comprimidos (zip). 
//Se usa para indicar que el archivo zip está dañado, malformado, 
//o tiene otros problemas que impiden su lectura o manipulación.

    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) throws IOException {
        try {
            ZipFile zipFile = new ZipFile("invalid.zip");  // Archivo zip inválido
        } catch (ZipException e) {
            System.out.println("Error de archivo zip: " + e.getMessage());
        }
    }
}
//Se usa para manejar errores cuando se trabaja con archivos zip. 
//Capturar esta excepción permite al programa controlar problemas como archivos zip corruptos, 
//malformados o incompletos, tomando medidas para evitar fallas 
//inesperadas y posiblemente proporcionar mensajes de error útiles al usuario.
