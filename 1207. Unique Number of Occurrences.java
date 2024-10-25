class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
       int min=Integer.MAX_VALUE,max=0;
       for(int i=0;i<n;i++)  min=Math.min(min,arr[i]);
       for(int i=0;i<n;i++)  max=Math.max(max,arr[i]);
       int size=(max-min)+1;
        int []freq=new int[size];
        for (int i = 0; i <n; i++) {
            freq[arr[i]-min]++;
        }
      Set<Integer> set=new HashSet<>();
      Set<Integer> set2=new HashSet<>();
      for(int i:freq)  if(i>0)  set2.add(i);
      for(int i: arr)  set.add(i);
      System.out.println(set2);
     
         return set.size()==set2.size();   
    }
}