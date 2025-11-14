class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(li, new ArrayList<>(), candidates, target, 0);
        return li;
    }
    private void backtrack(List<List<Integer>> li, List<Integer> templi ,int[] nums, int remain, int start){
        if(remain<0) return ;
        else if(remain == 0) li.add(new ArrayList<>(templi));
        else{
            for(int i=start;i<nums.length;i++){
                templi.add(nums[i]);
                backtrack(li, templi, nums, remain-nums[i], i);
                templi.remove(templi.size()-1);
            }
        }
    }
}