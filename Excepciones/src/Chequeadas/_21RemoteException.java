package Chequeadas;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class _21RemoteException {
    
//RemoteException se lanza cuando hay errores durante llamadas a métodos remotos (RMI).
//Es comúnmente utilizada para indicar que algo salió mal durante la comunicación 
//entre aplicaciones distribuidas o cuando se trabaja con servicios remotos.

    @SuppressWarnings("unused")
    public static void main(String[] args) throws NotBoundException, MalformedURLException {
        try {
            Remote remote = Naming.lookup("rmi://invalid-url");
        } catch (RemoteException e) {
            System.out.println("Error remoto: " + e+" Message()");
        }
    }
}
//Se usa para manejar errores cuando se trabaja con llamadas a métodos remotos. 
//Capturar esta excepción permite controlar errores durante la comunicación remota, 
//brindando una manera segura de manejar fallos en aplicaciones distribuidas o en entornos de servicios remotos.

