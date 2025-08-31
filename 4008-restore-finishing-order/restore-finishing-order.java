class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> h = new HashSet<>();
        for(int n:friends){
            h.add(n);
        }
        int[] ans = new int[friends.length];
        int j=0;
        for(int i=0;i<order.length;i++){
            if(h.contains(order[i])){
                ans[j++] = order[i];
            }
        }
        return ans;
    }
}