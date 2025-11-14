class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                if(i > start && nums[i] == nums[i-1]) continue;
                templi.add(nums[i]);
                backtrack(li, templi, nums, remain-nums[i], i+1);
                templi.remove(templi.size()-1);
            }
        }
    }
}