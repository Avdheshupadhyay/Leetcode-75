class Solution {   
    public int countOnes(int n) {
       ArrayList<Integer> a=new ArrayList<>();
       while(n>0){
           a.add(n%2);
           n=n/2;
       }

       int count=0;
       for (int i = 0; i <a.size() ; i++) {
           if(a.get(i)==1){
               count++;
           }

       }
    
       return count;
    }
        public int[] countBits(int n) {
           int []ans=new int[n+1];
           ans[0]=0;
           for(int i=1;i<=n;i++){
               ans[i]=countOnes(i);

           }
           return ans;

   }
}