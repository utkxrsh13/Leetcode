class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i:nums){
            li.add(i);
        }
        int op = 0;
        while(!isNonDec(li)){
            int index = -1;
            int minSum = Integer.MAX_VALUE;
            for(int i=0;i<li.size()-1;i++){
                int currSum = li.get(i)+li.get(i+1);
                if(currSum<minSum){
                    minSum = currSum;
                    index = i;
                }
            }
                int mergedValue = li.get(index) + li.get(index + 1);
            li.remove(index + 1);
            li.set(index, mergedValue);
            op++;
        }
        return op;
    }
    private boolean isNonDec(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}