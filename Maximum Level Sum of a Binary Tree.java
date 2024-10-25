
class Solution {
    List<List<Integer>> a=new ArrayList<>();
    void solve(TreeNode root){
        if(root==null)  return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>b=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                b.add(temp.val);
                if(temp.left!=null)  q.add(temp.left);
                if(temp.right!=null)  q.add(temp.right);
            }
            a.add(b);
        }

    }
    public int maxLevelSum(TreeNode root) {
        solve(root);
        System.out.println(a);
        int []sum=new int[a.size()];
        int k=0;
        for(List<Integer> i:a){
            int s=0;
            for(int j=0;j<i.size();j++){
                s+=i.get(j);
            }
            sum[k]=s;
            k++;
        }
        int ans=0,max=Integer.MIN_VALUE;
      for(int i=0;i<sum.length;i++){
        if(max<sum[i]){
            ans=i;
            max=sum[i];
        }
      }
      return ans+1;
        
    }
}