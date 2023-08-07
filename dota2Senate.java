class Solution{
    public String predictPartyVictory(String senate){
        Queue<Interger> qR = new LinkedList<>();
        Queue<Interger> qD = New LinkedList<>();
        int n = senate.length(); // helper to check every round

        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R') {
                qR.add(i);
            }else qD.add(i);
        }
        while(!qR.isEmpty && !qD.isEmpty){
            int r = qR.poll();
            int d = qD.poll();
            if(r < d){
                qR.add(r + n);
            }else qD.add(d + n);
        }

        return qR.size() > qD.size() ? "Radiant" : "Dire";
    }
}