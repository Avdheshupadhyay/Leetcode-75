class Solution {
    public int findPeakElement(int[] nums) {
        int start=0,end=nums.length-1;
        int n=nums.length;
        if(n==1)  return 0;
        if(nums[n-1]>nums[n-2])  return n-1;
        for(int i=0;i<n-2;i++){
            if(nums[i]<nums[i+1] && nums[i+1]>nums[i+2])  return i+1;
       
           
        }
        return 0;
        
    }
}