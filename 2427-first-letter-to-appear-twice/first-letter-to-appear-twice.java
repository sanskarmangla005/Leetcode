import java.util.HashSet;

class Solution {
    public char repeatedCharacter(String s) {

        // Character ko store krne ke liye HashSet
        HashSet<Character> set = new HashSet<>();

        // String ke har character ko check krenge
        for (char ch : s.toCharArray()) {

            // Agar character pehle aa chuka hai
            if (set.contains(ch)) {
                return ch;
            }

            // Pehli baar mila hai to store kr do
            set.add(ch);
        }

        return ' ';
    }
}