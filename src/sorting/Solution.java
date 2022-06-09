package sorting;
class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Solution ll=new Solution();
        int nums[]=new int[]{2,1,8,6,9};
        ll.sortArray(nums);
    }
}
