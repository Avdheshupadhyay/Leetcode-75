class Solution {
    boolean isVowel(char c){
        if(c=='a' || c=='A')   return true;
        else if(c=='e' || c=='E')   return true;
        else if(c=='i' || c=='I')   return true;
         else if(c=='o' || c=='O')   return true;
         else if(c=='u' || c=='U')   return true;
         else    return false;  
    }
    public String reverseVowels(String s) {
        char []c=s.toCharArray();
        int left=0,right=c.length-1;
        while(left<=right){
            char chl=c[left];
            char chr=c[right];
           if(isVowel(chl) && isVowel(chr)){
            c[left]=chr;
            c[right]=chl;
            left++;
            right--;

           }
           else if(isVowel(chl)){
            right--;

           }
           else if(isVowel(chr)){
            left++;

           }
           else{
            left++;
            right--;
           }
        }
        return new String(c);
     
    
    }
}