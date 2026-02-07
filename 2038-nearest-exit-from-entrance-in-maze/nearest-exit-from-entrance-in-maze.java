class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;

        boolean[][] vis = new boolean[n][m];

        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);
        vis[entrance[0]][entrance[1]]=true;
        int cnt = 0;

        while(!q.isEmpty()){
            int s = q.size();
            cnt++;
            for(int k=0 ; k<s ; k++){
                int[] p = q.poll();
                int i = p[0];
                int j = p[1];

                if(i+1<n && (!vis[i+1][j] && maze[i+1][j]=='.')){
                    if(i+1==n-1 || j==0 || j==m-1) return cnt;
                    q.add(new int[]{i+1,j});
                    vis[i+1][j] = true;
                }
                if(j+1<m && (!vis[i][j+1] && maze[i][j+1]=='.')){
                    if(j+1==m-1 || i==0 || i==n-1) return cnt;
                    q.add(new int[]{i,j+1});
                    vis[i][j+1] = true;
                }
                if(i-1>=0 && (!vis[i-1][j] && maze[i-1][j]=='.')){
                    if(i-1==0 || j==0 || j==m-1) return cnt;
                    q.add(new int[]{i-1,j});
                    vis[i-1][j] = true;
                }
                if(j-1>=0 && (!vis[i][j-1] && maze[i][j-1]=='.')){
                    if(j-1==0 || i==0 || i==n-1) return cnt;
                    q.add(new int[]{i,j-1});
                    vis[i][j-1] = true;
                }
            }  
        }

        return -1;
    }
}