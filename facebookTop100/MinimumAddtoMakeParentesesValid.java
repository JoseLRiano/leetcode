class MinimumAddtoMakeParentesesValid {
    public int minAddToMakeValid(String s){
        int ans = 0, bal = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                bal++;
            }else bal--;
            if(bal == -1){
                ans++;
                bal++;
            }
        }
        return bal + ans;
    }    
}
