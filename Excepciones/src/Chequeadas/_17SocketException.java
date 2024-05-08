package Chequeadas;

import java.net.Socket;
import java.net.SocketException;

public class _17SocketException {
    
//SocketException se lanza cuando hay problemas relacionados con sockets de red,
//como errores de conexión, cierres inesperados, o configuraciones incorrectas.
//Se usa para controlar errores en operaciones de red que involucran sockets.

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.setSoTimeout(-1);  // Configuración incorrecta
        } catch (SocketException e) {
            System.out.println("Error de socket: " + e.getMessage());
        }
    }
}
//SocketException es útil para controlar errores durante operaciones de red que utilizan sockets.
//Capturar esta excepción permite al programa manejar problemas de conexión, configuraciones incorrectas,
//o errores inesperados, evitando bloqueos o interrupciones en aplicaciones de red.
