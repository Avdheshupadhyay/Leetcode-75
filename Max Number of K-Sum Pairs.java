class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1,count=0;
         int i=-1,j=-1;
        while(l<r){
            int sum=nums[l]+nums[r];
           
            if(sum==k && l!=i &&r!=j) {
                 count++;
                 i=l;
                 j=r;   
            }
            else if(sum>k) {
                   r--;
            }
            else if(sum<k) {
                  l++;
            }
            else{
            l++;
            r--;
            
              }

        }
        return count;


        
    }
}