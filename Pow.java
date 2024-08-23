class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        double tmp = x;

        if(n == 0){
            return 1;
        }

        else if(n < 0){
            n = Math.abs(n);
            while (n > 0){
            if ((n & 1) == 1){
                ans *= x;
            }
            x = x * x;
            n = n >>1;
        }
        return Math.round((1/ans) * 100000)/100000.0;
        }

    else{
        while (n > 0){
            if ((n & 1) == 1){
                ans *= x;
            }
            x = x * x;
            n = n >>1;
        }

        return ans;
    }
    }
}
