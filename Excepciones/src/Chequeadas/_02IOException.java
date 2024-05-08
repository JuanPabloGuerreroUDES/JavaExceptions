package Chequeadas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _02IOException {
    
//La clase IOException representa errores relacionados con operaciones de entrada/salida, 
//como lectura o escritura de archivos, errores de red o problemas con dispositivos de entrada/salida. 
//Se utiliza para indicar problemas con operaciones de disco, red o flujos de datos. 
//Muchas clases en Java, como las que trabajan con archivos o conexiones de red,
//lanzan IOException para señalar problemas inesperados.
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nonexistentfile.txt"));
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
//Se usa IOException cuando trabajas con archivos, sockets, o flujos de datos,
//y puede capturar cualquier problema de entrada/salida. 
//Es especialmente útil para tratar con errores de hardware o de red que podrían ser impredecibles.
