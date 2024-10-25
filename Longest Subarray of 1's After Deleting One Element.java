class Solution {
    public int longestSubarray(int[] nums) {
        boolean zero_found = false;
        int prev_count = 0 ; int count = 0; int res = 0; int total = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0) {
                zero_found = true;
                total = prev_count + count;
                res = total > res ? total : res;
                prev_count = count;
                count = 0;
            }
            else {
                count+=1 ;
            }
        }
        total = prev_count + count;
        res = total > res? total : res;
        if(zero_found)
            return res;
        else
            return n-1;
    }
}