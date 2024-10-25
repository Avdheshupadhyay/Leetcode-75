class Solution {
    public int[] successfulPairs(int[] sp, int[] pos, long suc) {
     int n = sp.length;
        int m = pos.length;
        int[] ans = new int[n]; 
        Arrays.sort(pos);
        for (int i = 0; i < n; i++) {
            int count = 0;
            int left = 0;
            int right = m - 1;
            int mid;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if ((long) sp[i] * pos[mid] >= suc) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            count = m - left;
            ans[i] = count;
        }
        
        return ans; 
    }
}