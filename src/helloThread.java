public class helloThread extends Thread {
    @Override
    public void run() {
        String hellosMes = String.format("Hola soy %s",Thread.currentThread().getName());
        System.out.println(hellosMes);
    }
}
class helloRunnable implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String hellosMes = String.format("Hola soy %s",threadName);
        System.out.println(hellosMes);
    }

        //var t1 = new helloThread();
        //var t2 = new Thread(new helloRunnable());
Thread myThread = new Thread(new helloRunnable(), "my-Thread");
Thread t3 = new Thread(()->{
    System.out.println();
});

 }
