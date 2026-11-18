class Solution {
    public static int temp(String s){
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        int most = 0, least =  Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++){
            most = Math.max(freq[s.charAt(i)], most);
            least = Math.min(freq[s.charAt(i)], least);
        }
        return most-least;
    }
    public int beautySum(String s) {
        int n=s.length();
        int ans = 0;
         for( int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               ans += temp(s.substring(i,j+1));
            }
        }
        return ans;
    }
}