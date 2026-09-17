class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for( int j=1; j<nums.length;j++){
            if(nums[j]!=nums[j-1]){
                nums[k]=nums[j];
                k+=1;
            }
        } return k;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna