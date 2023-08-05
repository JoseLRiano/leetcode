class Solution{
    public String removeStar(String s){
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i= 0; i < arr.length; i++){
            if(arr[i] == '*'){
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(arr[i]);
            }
        }
        return ans.toString();
    }
}