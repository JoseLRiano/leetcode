class Soltion() {
    public String reverseWords(String s){
        int start = s.length();
        int end = start + 1;
        StringBuilder result = new StringBuilder();
        while(start < end){
            end = --start;
            while(end >= 0 && Character.isSpaceChar(s.charAt(end))){
                end--;
            }
            start = end;
            while(start >=0 && !Character.isSpaceChar(s.charAt(start))){
                start--;
            }
            result.append(s.substring(++start, ++end)).append(" ");
        }
        return result.toString().trim();
    }
}