
import java.util.*;

class Solution {

    public String[] spellchecker(String[] wordlist, String[] queries) {

        Set<String> exact = new HashSet<>();
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        for (String word : wordlist) {

            exact.add(word);

            String lower = word.toLowerCase();

            caseMap.putIfAbsent(lower, word);

            String masked = maskVowels(lower);

            vowelMap.putIfAbsent(masked, word);
        }

        String[] answer = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {

            String query = queries[i];

            if (exact.contains(query)) {
                answer[i] = query;
            }

            else {

                String lower = query.toLowerCase();

                if (caseMap.containsKey(lower)) {
                    answer[i] = caseMap.get(lower);
                }

                else {

                    String masked = maskVowels(lower);

                    if (vowelMap.containsKey(masked)) {
                        answer[i] = vowelMap.get(masked);
                    }

                    else {
                        answer[i] = "";
                    }
                }
            }
        }

        return answer;
    }

    private String maskVowels(String word) {

        StringBuilder sb = new StringBuilder();

        for (char ch : word.toCharArray()) {

            if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u') {

                sb.append('*');
            }

            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
