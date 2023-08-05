import java.util.Stack;

public class asteroidcollision {
    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer> s = new Stack<>();
        for(int a : asteroids){
            if(a > 0){
                s.push(a);
            }else{
                while(!s.isEmpty() && s.peek() > 0 && s.peek() + a < 0){
                    s.pop();
                }
                if(s.isempty() || s.peek() < 0){
                    s.push(a);
                }else if(a + s.peek() == 0){
                    s.pop();
                }
            }
        }
        int[] res = new int[s.size()];
        for(int i = res.length -1; i >= 0; i--){
            res[i] = s.pop();
        }
        return res;
    }
}
