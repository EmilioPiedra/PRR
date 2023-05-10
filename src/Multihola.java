public class Multihola {
    public static void main(String[]args){
        PruebaTh t1,t2,t3;
        t1 = new PruebaTh("thread 1",(int)(Math.random()*2000));
        t2 = new PruebaTh("thread 2",(int)(Math.random()*2000));
        t3 = new PruebaTh("thread 3",(int)(Math.random()*2000));

        //run threads
        t1.start();
        t2.start();
        t3.start();

    }
}
