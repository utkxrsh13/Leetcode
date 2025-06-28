class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total =0;
        for(int p:cardPoints) total += p;

        int leftSum =0;
        int rightSum = 0;
        for(int i=0;i<k;i++){
            leftSum += cardPoints[i];
        }
        int ans = leftSum;
        for(int i=0;i<k;i++){
            leftSum -= cardPoints[k-1-i];
            rightSum += cardPoints[n-1-i];
            ans = Math.max(ans, leftSum + rightSum);
        }
        return ans;
    }
}