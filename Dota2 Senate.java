class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        int n = senate.length();
        for (int i=0;i<n;i++){
            if(senate.charAt(i)=='R') {
                rQueue.offer(i);
            } 
            else{
                dQueue.offer(i);
            }
        }
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rI = rQueue.poll();
            int dI = dQueue.poll();
            if(rI<dI){
                rQueue.offer(rI+n);
            } 
            else{
                dQueue.offer(dI+n);
            }
        }
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}