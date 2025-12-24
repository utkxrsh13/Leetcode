class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total =0;
        for(int n : apple){
            total += n;
        }
        int count=0;
        Arrays.sort(capacity);
        for(int i =capacity.length-1;i>=0;i--){
            total -= capacity[i];
            count++;
            if(total <=0){
                break;
            }
        }
        return count;
    }
}