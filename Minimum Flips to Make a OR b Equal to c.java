class Solution {
    public int minFlips(int a, int b, int c) {
        int ans = 0; 
        int z = Math.max(c,Math.max(a,b));

        while(z>0){
            boolean aHasOne = (a & 1) == 1;
            boolean bHasOne = (b & 1) == 1;
            boolean cHasOne = (c & 1) == 1;
            if(aHasOne && bHasOne){
                if(!cHasOne)
                    ans += 2;
            }
            else if((aHasOne && !bHasOne) || (!aHasOne && bHasOne)){
                if(!cHasOne){
                    ans+=1;
                }
            }
            else{
                if(cHasOne)
                    ans+=1;
            }
            a = a>>1;
            b = b>>1;
            c = c>>1;
            z = z>>1;
        }
        return ans;

    }
}