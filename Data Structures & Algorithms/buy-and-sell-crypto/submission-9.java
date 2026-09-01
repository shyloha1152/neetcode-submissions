class Solution {
    public int maxProfit(int[] arr) {
        int minP=arr[0];
        int maxP=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minP){
                minP=arr[i];

            }
            else{
                maxP=Math.max(maxP,arr[i]-minP);
            }
        }
        return maxP;
        
    }
}
