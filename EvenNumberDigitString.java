class Solution {
    public int findNumbers(int[] nums) {
        
        int cnt = 0;
        String[] nums2 = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            nums2[i] = Integer.toString(nums[i]);
        }

        for(int i = 0;i<nums.length;i++){
            if ( (nums2[i].length()&1)!=1 ){
                cnt++;
            }
        }

        return cnt;
    }
}
