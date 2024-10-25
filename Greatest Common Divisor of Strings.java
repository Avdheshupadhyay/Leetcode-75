class Solution {
  
    public String gcdOfStrings(String s1, String s2) {
       if(s2.length()>s1.length())  return gcdOfStrings(s2,s1);
       if(s2.equals(s1))   return s1;
       if(s1.startsWith(s2))   return gcdOfStrings(s1.substring(s2.length()),s2);
       return "";

        
        
        
    }
}