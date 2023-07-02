public class stringCompression {
    public int compress(char[] chars){
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count > 1){
                for(char ch : Integer.toString(count).toCharArray()){
                    chars[indexAns++] = ch;
                }
            }
        }
        return indexAns;
    }
}
