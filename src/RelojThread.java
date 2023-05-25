import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.State.RUNNABLE;

public class RelojThread extends Thread {
    private boolean running;

    public RelojThread() {
        this.running = true;
    }

    @Override
    public void run() {
        while (Thread.currentThread().getState() ==RUNNABLE) {
            // Obtener la hora actual
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String horaActual = sdf.format(new Date());

            // Imprimir la hora actual en la consola
            System.out.println(horaActual);

            try {
                // Esperar un segundo antes de imprimir la siguiente hora
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopReloj() {
        this.running = false;
    }

    public static void main(String[] args) {
        // Crear e iniciar el hilo del reloj
        RelojThread reloj = new RelojThread();
        reloj.start();

        // Esperar 5 segundos
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Detener el hilo del reloj
        reloj.stopReloj();
    }
}
