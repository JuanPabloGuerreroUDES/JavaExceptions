package Chequeadas;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

public class _24LineUnavailableException {
    
//LineUnavailableException se lanza cuando una línea de audio no está disponible.
//Es comúnmente utilizada cuando se trabaja con audio y hay problemas para obtener una línea de entrada o salida.

    public static void main(String[] args) {
        try {
            AudioFormat format = new AudioFormat(44100, 16, 2, true, true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
            TargetDataLine line = (TargetDataLine) AudioSystem.getLine(info);  // Línea no disponible
            line.open(format);
        } catch (LineUnavailableException e) {
            System.out.println("Línea de audio no disponible: " + e+" Message()");
        }
    }
}
//Se usa para controlar errores cuando se trabaja con dispositivos de audio. 
//Capturar esta excepción permite manejar situaciones donde no se puede 
//obtener acceso a una línea de audio, proporcionando una manera segura de tratar e
//rrores relacionados con hardware o recursos de audio.
