package Chequeadas;

public class _06InterruptedException extends Thread {

//InterruptedException se lanza cuando un hilo en ejecución es interrumpido 
//por otro hilo o por una operación que requiere atención. 
//Es comúnmente utilizado en programación concurrente, 
//donde un hilo puede ser interrumpido por diversos motivos, 
//como para detener un proceso largo o para manejar señales de interrupción.

    public void run() {
        try {
            Thread.sleep(10000);  // Simula una operación larga
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        _06InterruptedException thread = new _06InterruptedException();
        thread.start();
        thread.interrupt();  // Interrumpe el hilo
    }

}
//InterruptedException se usa para manejar situaciones donde un 
//hilo puede ser interrumpido antes de completar su tarea. 
//Esto es especialmente útil para controlar procesos largos que 
//podrían necesitar ser detenidos o reiniciados de manera segura, 
//permitiendo una gestión eficiente de recursos y evitando bloqueos innecesarios.
