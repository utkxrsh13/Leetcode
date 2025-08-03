class Solution {
    public int maxBalancedShipments(int[] weight) {
        int res=0;
        int max =0;
        for(int i:weight){
            max = Math.max(max,i);
            if(i<max){
                res++;
                max=0;
            }
        }
        return res;
    }
}