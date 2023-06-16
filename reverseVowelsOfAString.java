class Solution{
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s){
        int start = 0, end = s.length() - 1;
        char[] result = s.toCharArray();

        while(start < end){
            if(isVowel(s.charAt(start)) && isVowel(s.charAt(end))){
                char temp = result[start];
                result[start] = result[end];
                result[end] = temp;
                start++;
                end--;
            }else if(!isVowel(s.charAt(start))){
                start++;
            }else end--;
        }
        return new String(result);
    }
    public static void main(String[] args){
        Solution test = new Solution();
        String test1 = "hello";
        String test2 = "leetcode";
        String test3 = "CODING";
        System.out.println(test.reverseVowels(test1));
        System.out.println(test.reverseVowels(test2));
        System.out.println(test.reverseVowels(test3));
    }
}