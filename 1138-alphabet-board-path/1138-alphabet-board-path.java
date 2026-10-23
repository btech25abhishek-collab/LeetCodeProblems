
class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder ans = new StringBuilder();

        int row = 0;
        int col = 0;

        for (char ch : target.toCharArray()) {
            int newRow = (ch - 'a') / 5;
            int newCol = (ch - 'a') % 5;

            while (row > newRow) {
                ans.append('U');
                row--;
            }

            while (col > newCol) {
                ans.append('L');
                col--;
            }

            while (row < newRow) {
                ans.append('D');
                row++;
            }

            while (col < newCol) {
                ans.append('R');
                col++;
            }

            ans.append('!');
        }

        return ans.toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna