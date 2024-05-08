package Chequeadas;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

public class _34SAXNotRecognizedException {
    
// Se lanza cuando una propiedad o característica SAX no es reconocida. 
//Esto puede ocurrir cuando se intenta usar una propiedad desconocida o no compatible en un analizador SAX.

    public static void main(String[] args) throws SAXNotSupportedException {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setFeature("http://xml.org/sax/features/unknown", true);  // Propiedad desconocida
        } catch (SAXNotRecognizedException e) {
            System.out.println("Propiedad SAX no reconocida: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            System.out.println("Error de configuración del parser: " + e. getMessage());
        }
    }
}
//Capturar SAXNotRecognizedException permite manejar errores cuando 
//se intenta usar una propiedad SAX desconocida. Esto ayuda a evitar 
//fallos inesperados y a proporcionar una forma de corregir problemas de configuración en el análisis de XML.

