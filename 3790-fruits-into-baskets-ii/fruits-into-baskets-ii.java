class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n =fruits.length;
		int count=n;  
		for(int i =0;i<n; i++){
			for(int j=0;j<n;j++){
				if(fruits[i]<=baskets[j]){
					count--;
					baskets[j]=-1;
					break;
				}
			}
		}
		return count;
    }
}