public class SetBits2 {
    public static void main(String[] args) {
        int num = 51;
        int n = num;
        int cnt = 0;
        while (n > 0){
            n -= (n&-n);
            cnt++;
        }
        System.out.println(cnt);
        System.out.println(Integer.toBinaryString(num));
    }
}
