public class Multihola {
    public static void main(String[]args){
        PruebaTh t1,t2,t3,t4,t5,t6,t7,t8,t9;
        t1 = new PruebaTh("thread 1",(int)(Math.random()*200000));
        t2 = new PruebaTh("thread 2",(int)(Math.random()*200000));
        t3 = new PruebaTh("thread 3",(int)(Math.random()*200000));
        t4 = new PruebaTh("thread 4",(int)(Math.random()*200000));
        t5 = new PruebaTh("thread 5",(int)(Math.random()*200000));
        t6 = new PruebaTh("thread 6",(int)(Math.random()*200000));
        t7 = new PruebaTh("thread 7",(int)(Math.random()*200000));
        t8 = new PruebaTh("thread 8",(int)(Math.random()*200000));
        t9 = new PruebaTh("thread 9",(int)(Math.random()*200000));
        //run threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
    }
}
