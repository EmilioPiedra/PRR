import java.util.stream.IntStream;

public class test1 {
    private static final IntStream values = IntStream.range(100_00,1_000_000);
    public static void main(String[]args){
        var results = values.filter(test1::isPrime);
        System.out.printf("Numeros primos: %d\n",results.count());
    }

    private static boolean isPrime(int num) {
        if(num<2)return false;
        if (num==2)return true;
        if (num%2 ==0)return false;
        for(var i =2;i<num;i++){
            if (num%i==0)return false;
        }
        return true;
    }
}