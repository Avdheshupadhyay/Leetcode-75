class Solution {
    public int largestAltitude(int[] gain) {
        int ans[]=new int[gain.length+1];
        ans[0]=0;
        for(int i=1;i<ans.length;i++){
           ans[i]=ans[i-1]+gain[i-1];
        }
        int ans2=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++){
            if(ans2<ans[i])   ans2=ans[i];
        }
        return ans2;
        
    }
}