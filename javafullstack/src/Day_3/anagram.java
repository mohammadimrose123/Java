package Day_3;

public class anagram {
    public static void main(String args[]) {
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
            return;
        }
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break; // Optional: exit loop early if mismatch found
            }
        }
        if (isAnagram) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}
