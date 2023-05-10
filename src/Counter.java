public class Counter {
    private int count;
    public void increment(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            count ++;
        }
    }
    public int getCount(){
        return count;
    }
}
