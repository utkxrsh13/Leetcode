class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans=0, temp =0;
        for(int i=citations.length-1;i>=0;i--){
            temp= Math.min(citations[i],temp+1);
            ans = Math.max(ans, temp);
        }
        return ans ;
    }
}