import java.util.HashSet;

public class LongestSubstringWithoutRepetation {

    public int longestSubstring() {
        String s = "abcabcbb";
        int n = s.length();
        int maxLength = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(maxLength);
        return maxLength;
    }
}
