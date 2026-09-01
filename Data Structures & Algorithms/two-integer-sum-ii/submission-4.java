class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int curr=arr[l]+arr[r];
            if(curr==target){
                return new int[]{l+1,r+1};
            }
            else if(curr>target){
                r--;
            }
            else if(curr<target){
                l++;
            }
        }
        return null;
        
    }
}
