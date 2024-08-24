public class SetBits {
    public static void main(String[] args) {
        int num = 6;
        int n = num;
        int cnt = 0;
        while (n > 0){
            n = (n & (n-1));
            cnt++;
        }

        System.out.println(cnt);
        System.out.println(Integer.toBinaryString(num));
    }
}
