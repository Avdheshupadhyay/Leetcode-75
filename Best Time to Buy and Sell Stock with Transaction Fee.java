class Solution {
    public int fun(int[][] dp, int[] arr, int i, int last, int n,int fee){
        if(i>=n)
            return 0;
        if(dp[i][last]!=-1)
            return dp[i][last];
        int buy = -1000000008 , sell = -1000000008;
        if(last==0)
            buy = -arr[i] + fun(dp,arr,i+1,1,n,fee);
        if(last==1)
            sell = arr[i] + fun(dp,arr,i+1,0,n,fee) - fee;
        int hold = fun(dp,arr,i+1,last,n,fee);
        return dp[i][last] = (int)Math.max((int)Math.max(buy,sell),hold);
    }
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for ( int i=0; i<=n; i++){
            for ( int j=0; j<2; j++)
                dp[i][j] = -1;
        }
        return fun(dp,prices,0,0,n,fee);
    }
}