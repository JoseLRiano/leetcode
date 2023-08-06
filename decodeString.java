class Solution{
    public String decodeString(String s){
        
        Stack <Character> res = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != ']'){
                res.push(c);
            } else{
                StringBuilder strHolder = new StringBuilder();
                while(!res.isEmpty() && Character.isLetter(res.peek())){
                    strHolder.insert(0, res.pop()); // Use insert insetad of append to add to the front of the StringBuilder
                }
                String tempStr = strHolder.toString();
                res.pop(); // Pop off the open square braket [
                
                StringBuilder digit = new StringBuilder();
                while(!res.isEmpty() && Character.isDigit(res.peek())){
                    digit.insert(0, res.pop());
                }

                int count = Integer.valueOf(digit.toString());
                while(count > 0){
                    for(char i : tempStr.toCharArray()){
                        res.push(i);
                    }
                    count--;
                }
            }
        }

        StringBuilder output = new StringBuilder();
        while(!res.isEmpty()){
            output.insert(0, res.pop());
        }

        return output.toString();
    }
}