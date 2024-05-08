package Chequeadas;

import java.io.IOException;
import java.net.*;
public class _20ProtocolException {
    
//ProtocolException se lanza cuando hay errores relacionados con protocolos de red o comunicación. 
//Se usa para indicar que algo salió mal durante la comunicación entre dispositivos 
//o sistemas que siguen un protocolo específico.

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws MalformedURLException, IOException {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL("http://example.com").openConnection();
            connection.setRequestMethod("INVALID_METHOD");  // Método HTTP inválido
        } catch (ProtocolException e) {
            System.out.println("Error de protocolo: " + e+" Message()");
        }
    }
}
//Se usa para controlar errores cuando se trabaja con protocolos de red, como HTTP.
//Capturar esta excepción permite manejar errores cuando se intenta usar un método o protocolo incorrecto, 
//garantizando que el programa pueda corregir errores y mantener la comunicación fluida.