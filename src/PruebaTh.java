public class PruebaTh extends Thread{
    private String nombre;
    private int retardo;

    public PruebaTh(String nombre, int retardo) {
        this.nombre = nombre;
        this.retardo = retardo;
    }

    public void run(){
        try {
            sleep(retardo);
        }catch (InterruptedException e){

        }

        System.out.println("hola mundo"+nombre+" "+retardo);

    }
}
