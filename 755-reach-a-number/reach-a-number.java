class Solution {
    public int reachNumber(int target) {

        target = Math.abs(target);
        int step =0;
        int total =0;
        while(total<target || (target-total)%2!=0){
            step++;
            total+=step;
        }

        return step;
        
    }
}