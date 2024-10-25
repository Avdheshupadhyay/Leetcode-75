class Solution 
{
    public int nearestExit(char[][] maze, int[] entrance) 
    {
        int dir[][] = {{0, 1},{-1, 0}, {1, 0}, {0, -1}};
        int m = maze.length , n = maze[0].length;
        boolean vis[][] = new boolean[m][n];
        int startRow = entrance[0], startCol = entrance[1];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startRow, startCol, 0});
        vis[startRow][startCol] = true;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size -- > 0)
            {
                int[] point = q.poll();
                int r1 = point[0], c1 = point[1];
				if(!(r1 == startRow && c1 == startCol) && (r1 == m-1 || r1 == 0 || c1 == n-1 || c1 == 0))    
					return point[2];
                
                for(int[] d: dir)
                {
                    int r = point[0] + d[0];
                    int c = point[1] + d[1];
                    if((r >= 0 && c >= 0 && r < m && c < n) && maze[r][c] == '.' && !vis[r][c])
                    {
                        q.add(new int[]{r, c , point[2] + 1});
                        vis[r][c] = true;
                    }
                }
            }
        }
        return -1;
    }
}