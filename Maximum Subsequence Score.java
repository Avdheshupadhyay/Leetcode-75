class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int ans=Integer.MIN_VALUE;
        int n=nums1.length;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            int min=Integer.MAX_VALUE;;
            for(int j=i;j<k+i;j++){
              sum+=nums1[j];
              if(min>nums2[j]){
                min=nums2[j];
              }
            }
            int st=min*sum;
            System.out.println(st);
            if(ans<st){
                ans=st;
            }
        }
        return ans;
        
    }
}