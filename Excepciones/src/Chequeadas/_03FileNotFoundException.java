package Chequeadas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _03FileNotFoundException {

//FileNotFoundException es una subclase de IOException que se lanza cuando se intenta acceder a un archivo que no existe.
//Es comúnmente utilizada cuando se trabaja con archivos y directorios para manejar 
//la posibilidad de que el archivo solicitado no esté presente en el sistema de archivos.
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("noexist.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
//Usar FileNotFoundException es necesario cuando se trabaja con archivos para asegurarse de que 
//el código pueda manejar la ausencia de archivos o directorios,
//proporcionando una manera segura de continuar el flujo del programa sin interrumpirlo abruptamente.

