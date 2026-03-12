class Solution {
     class DSU {
        int[] parent, rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        boolean union(int a, int b) {
            int pa = find(a), pb = find(b);
            if (pa == pb) return false;

            if (rank[pa] < rank[pb]) parent[pa] = pb;
            else if (rank[pb] < rank[pa]) parent[pb] = pa;
            else {
                parent[pb] = pa;
                rank[pa]++;
            }
            return true;
        }
    }

    public int maxStability(int n, int[][] edges, int k) {

        int maxStrength = 0;
        for (int[] e : edges)
            maxStrength = Math.max(maxStrength, e[2]);

        int left = 0, right = maxStrength * 2;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canBuild(n, edges, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean canBuild(int n, int[][] edges, int k, int X) {

        DSU dsu = new DSU(n);
        int used = 0;

        List<int[]> good = new ArrayList<>();
        List<int[]> upgrade = new ArrayList<>();

        // process edges
        for (int[] e : edges) {
            int u = e[0], v = e[1], s = e[2], must = e[3];

            if (must == 1) {
                if (s < X) return false;
                if (!dsu.union(u, v)) return false;
                used++;
            } else {
                if (s >= X) good.add(e);
                else if (2 * s >= X) upgrade.add(e);
            }
        }

        // add good edges
        for (int[] e : good) {
            if (dsu.union(e[0], e[1])) {
                used++;
                if (used == n - 1) return true;
            }
        }

        // add upgrade edges
        int upgrades = 0;
        for (int[] e : upgrade) {
            if (upgrades == k) break;
            if (dsu.union(e[0], e[1])) {
                upgrades++;
                used++;
                if (used == n - 1) return true;
            }
        }

        return used == n - 1;
    }
}