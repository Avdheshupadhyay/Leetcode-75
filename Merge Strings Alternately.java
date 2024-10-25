class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int n=word1.length();
        int m=word2.length();
        int size=Math.max(m,n);
        for(int i=0;i<size;i++){
            if(n>i){
                ans+=word1.charAt(i)+"";
            }
            if(m>i){
                ans+=word2.charAt(i)+"";
            }
        }
        return ans;
        
    }
}