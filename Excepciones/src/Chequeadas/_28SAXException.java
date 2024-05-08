package Chequeadas;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class _28SAXException {
    
//Se lanza cuando hay errores durante el procesamiento de documentos 
//XML con la API Simple API for XML (SAX). Puede ser causado por problemas de análisis, 
//errores de validación o problemas generales con la estructura del XML.

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse("archivo.xml", new DefaultHandler());  // XML no válido
        } catch (SAXException e) {
            System.out.println("Error de SAX: " + e.getMessage());
        } catch (ParserConfigurationException | IOException e) {
            System.out.println("Error durante el análisis XML: " + e.getMessage());
        }
    }
}
//Se usa para controlar errores durante el análisis de XML. 
//Capturar SAXException permite manejar problemas como errores de sintaxis, 
//estructuras inválidas o problemas de validación, permitiendo al programa 
//reaccionar adecuadamente ante documentos XML malformados.