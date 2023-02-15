public class Easy_IsSubsequence {
    public boolean isSubsequence(String s, String t){
        if(s.length() > t.length()) return false;
        if(s.isEmpty()) return true;
        int count = 0;
        for(int i = 0; i < t.length() && count < s.length(); i++){
            if(s.charAt(count) == t.charAt(i)){
                count++;
                if(count == s.length()) return true;
            }
        }
        if(count != s.length()) return false;
        return true;
    }
    public static void main(String[] args){
        Easy_IsSubsequence subsequence = new Easy_IsSubsequence();
        System.out.println(subsequence.isSubsequence("abc", "ahbgdc"));
    }
}
