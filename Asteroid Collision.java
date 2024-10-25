class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<asteroids.length; i++) {
            if(asteroids[i] >= 0) {
                s.push(i);
                continue;
            }
            while(!s.isEmpty()) {
                if(Math.abs(asteroids[s.peek()]) > Math.abs(asteroids[i])) {
                    asteroids[i] = 0;
                    break;
                } else if(Math.abs(asteroids[s.peek()]) < Math.abs(asteroids[i])) {
                    asteroids[s.pop()] = 0;
                } else {
                    asteroids[s.pop()] = 0;
                    asteroids[i] = 0;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i : asteroids) {
            if(i != 0) {
                ans.add(i);
            }
        }
        int arr[] = ans.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}