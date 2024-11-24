class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,ls=0;
         for(int number:nums)  sum+=number;

         for(int i=0;i<nums.length;i++){
            if(ls*2==sum-nums[i]){
                return i;
            }
            ls+=nums[i];
         }
        return -1;
        
    }
}
