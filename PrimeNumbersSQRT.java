public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 1;
        int flag = 0;
        // used sqrt method for range because after some times it starts to repeat
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1 || n <= 1)
        System.out.println("Not Prime");
        else System.out.println("prime");
    }
}
