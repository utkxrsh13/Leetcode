class Solution {
    public int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int n:arr){
            max = Math.max(max,n);
        }
        return max;
    }
    private int getSum(int[] arr){
        int sum =0;
        for(int n:arr){
            sum+= n;
        }
        return sum;
    }
    public int splitArray(int[] nums, int k) {
        int low = getMax(nums);
        int high = getSum(nums);
        while(low<high){
            int mid = (low+high)/2;
            if(canCount(nums,k,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean canCount(int[] arr, int x, int check){
        int count =1;
        int currSum =0;
        for(int n:arr){
            if(currSum+n <= check){
                currSum += n;
            }else{
                count++;
                currSum = n;
                if(count>x){
                    return false;
                }
            }
        }
        return true;
    }
}