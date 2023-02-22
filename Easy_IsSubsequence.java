public class Easy_IsSubsequence {
    public boolean isSubsequence(String s, String t){
        int count = 0;
        for(int i = 0; i < t.length() && count < s.length(); i++){
            if(s.charAt(count) == t.charAt(i)){
                count++;
            }
        }
        return count == s.length();
    }
    public static void main(String[] args){
        Easy_IsSubsequence subsequence = new Easy_IsSubsequence();
        System.out.println(subsequence.isSubsequence("abc", "ahbgdc"));
    }
}
