
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] freq = new int[121];

        for (int age : ages) {
            freq[age]++;
        }

        int requests = 0;

        for (int x = 1; x <= 120; x++) {
            if (freq[x] == 0) {
                continue;
            }

            for (int y = 1; y <= 120; y++) {
                if (freq[y] == 0) {
                    continue;
                }

                if (y > 0.5 * x + 7 && y <= x) {
                    requests += freq[x] * freq[y];

                    if (x == y) {
                        requests -= freq[x];
                    }
                }
            }
        }

        return requests;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna