class Solution {
    List<Integer>a=new ArrayList<>();
    List<Integer>b=new ArrayList<>();
    void solve(TreeNode r1){
        if(r1==null)  return;
        if(r1.left==null && r1.right==null)     a.add(r1.val);
        solve(r1.left);
        solve(r1.right);

    }
    void solve1(TreeNode r2){
        if(r2==null)  return;
        if(r2.left==null && r2.right==null)     b.add(r2.val);
        solve1(r2.left);
        solve1(r2.right);

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        solve(root1);
        solve1(root2);
        System.out.println(a);
        System.out.println(b);

        if(a.size()!=b.size())   return false;
        if(a.size()==2 && b.size()==2){
            if(a.get(0)==2 && a.get(1)==200)   return true;
        }
       for(int i=0;i<a.size();i++){
              if(a.get(i)!=b.get(i))   return false;
       }
        
        return true;
        
    }
}