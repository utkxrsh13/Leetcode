class Solution {
    class Node {
        int val;
        Set<Pair<Node, Double>> neighbors;
        public Node() {
            this.val = 0;
            neighbors = new HashSet<>();
        }
    }
    Map<String, Node> mp = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int i = 0;
        for(List<String> e:equations) {
            Node a = mp.getOrDefault(e.get(0), new Node());
            Node b = mp.getOrDefault(e.get(1), new Node());
            a.neighbors.add(new Pair<>(b, values[i]));
            b.neighbors.add(new Pair<>(a, (double)(1/values[i])));
            mp.put(e.get(0), a);
            mp.put(e.get(1), b);
            i++;
        }
        i = 0;
        double[] res = new double[queries.size()];
        for(List<String> q:queries) {
            if(!mp.containsKey(q.get(0)) || !mp.containsKey(q.get(1))) {
                res[i] = -1;
            } else if(q.get(0).equals(q.get(1))) {
                res[i] = 1d;
            } else {
                Node a = mp.get(q.get(0));
                Node b = mp.get(q.get(1));
                res[i] = dfs(a, b, new HashSet<>());
                if(res[i]!=-1) {
                    a.neighbors.add(new Pair<>(b, res[i]));
                    b.neighbors.add(new Pair<>(a, (double)(1/res[i])));
                }
            }
            i++;
        }
        return res;
    }
    public double dfs(Node src, Node target, Set<Node> vis) {
        if(target==src) {
            return 1d;
        }
        if(!vis.contains(src)) {
            vis.add(src);
            for(Pair<Node, Double> p:src.neighbors) {
                double w = p.getValue();
                Node next = p.getKey();
                if(!vis.contains(next)) {
                    double r = w*dfs(next, target, vis);
                    if(r>=0) {
                        return r;
                    }
                }
            }
        }
        return -1;
    }
}