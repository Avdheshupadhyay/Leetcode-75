class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] number={1,2,3,4,5,6,7,8,9};
        solve(0,number,k,n,new ArrayList<>());
        return ans;
    }
    public void solve(int index,int [] numbers,int k,int target,List<Integer> al){
        if(target==0 && al.size()==k){
            ans.add(new ArrayList<>(al));
            return;
        }
        if(al.size()>k){
            return;
        }
        for(int i=index;i<numbers.length;i++){
            al.add(numbers[i]);
            solve(i+1,numbers,k,target-numbers[i],al);
            al.remove(al.size()-1);
        }
    }
}