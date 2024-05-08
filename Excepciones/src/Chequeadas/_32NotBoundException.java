package Chequeadas;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class _32NotBoundException {
    
//Se lanza cuando se intenta acceder a un objeto por un nombre que no está enlazado, 
//como en RMI o JNDI. Indica que el nombre o referencia no está asociado a ningún objeto en el registro.

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Remote obj = registry.lookup("noEnlazado");  // No existe
        } catch (NotBoundException e) {
            System.out.println("Nombre no enlazado: " + e.getMessage());
        } catch (RemoteException e) {
            System.out.println("Error remoto: " + e. getMessage());
        }
    }
}
//Capturar NotBoundException permite controlar errores cuando 
//se busca un objeto por un nombre que no existe en el registro, 
//lo que evita caídas inesperadas y proporciona una forma de corregir el problema.