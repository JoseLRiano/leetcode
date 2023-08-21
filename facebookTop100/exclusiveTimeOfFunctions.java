import java.util.List;
import java.util.Stack;

class Solution {
    public int[] exclusive(int n, List<String> logs){
        Stack<Log> s = new Stack<>();
        int[] ans = new int[n];
        for(String content : logs){
            Log log = new Log(content);
            if(log.isStart){
                s.push(log);
            }else {
                Log top = s.pop();
                ans[top.id] +=(log.time - top.time + 1);
                if(!s.isEmpty()){
                    ans[s.peek().id] -= (log.time - top.time + 1);
                }
            }
        }
        return ans;
    }    
    public class Log{
        int id;
        boolean isStart;
        int time;

        public Log(String content){
            String[] log = content.split(":");
            id = Integer.parseInt(log[0]);
            isStart = log[1].equals("start");
            time = Integer.parseInt(log[2]);
        }
    }
}


