public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                s.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("Merged String: " + solution.mergeAlternately(word1, word2)); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println("Merged String: " + solution.mergeAlternately(word1, word2)); // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println("Merged String: " + solution.mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}
