package DataStructure.String;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int seqIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.length() > seqIndex && t.charAt(i) == s.charAt(seqIndex)) {
                seqIndex++;
            }
        }
        return seqIndex == s.length();
    }
}
