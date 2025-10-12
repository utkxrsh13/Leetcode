class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans =0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> mp = new HashMap<>();
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                mp.put(c,mp.getOrDefault(c,0)+1);
                if(helper(mp)){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
    private boolean helper(Map<Character,Integer> mp){
        if(mp.isEmpty()) return false;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int val:mp.values()){
            min = Math.min(min,val);
            max = Math.max(max,val);
        }
        return min==max;
    }
}