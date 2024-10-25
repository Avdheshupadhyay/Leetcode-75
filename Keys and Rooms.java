class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      int total=rooms.size();
      boolean flag[]=new boolean[total];
      flag[0]=true;
      Queue<Integer>q=new LinkedList<>();
      for(int i=0;i<rooms.get(0).size();i++){
          q.add(rooms.get(0).get(i));
      }
      while(!q.isEmpty()){
          int curr=q.poll();
          if(flag[curr]==false){
              flag[curr]=true;
              for(int i=0;i<rooms.get(curr).size();i++){
                  q.add(rooms.get(curr).get(i));
              }
          }
      } 
      for(int i=0;i<total;i++){
          if(flag[i]==false) return false;
      }
      return true;
    }
}