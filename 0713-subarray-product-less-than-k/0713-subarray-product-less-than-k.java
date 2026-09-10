class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int start=0;
        int end=0; int p=1;int ans=0;
 
 while(end <nums.length){
    p=p*nums[end];
        while(p>=k&&start<=end){
            p=p/nums[start];
            start++;
        }
        ans=ans+(end-start+1);
        end++;
 }return ans;
    
    } 

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna