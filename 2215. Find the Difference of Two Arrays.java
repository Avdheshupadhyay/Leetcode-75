class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> a=new ArrayList<>();
        Set<Integer> set=new HashSet();
        Set<Integer> set2=new HashSet();
        for(int i:nums1){
            set.add(i);
        }
         for(int i:nums2){
            set2.add(i);
        }
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        for(int i:set){
            if(!set2.contains(i))  b.add(i);
        }
        for(int i:set2){
            if(!set.contains(i))  c.add(i);
        }
        a.add(b);
        a.add(c);
        return a;

    }
}