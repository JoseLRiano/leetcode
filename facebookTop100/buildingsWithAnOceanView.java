
public class buildingsWithAnOceanView {
    public int[] findBuildings(int[] heights){
        Stack<Integer> s = new Stack<>();
        int n = heights.length - 1;
        //Add the last item in the array of buildings, thus it will have a view because it is the first building in front of the ocean 

        s.push(n);

        for(int i = n - 1; i >= 0; i--){
            int cur = heights[i];
            if(cur > heights[s.peek()]){
                s.push(i);
            }
        }

        int[] ans = new int[s.size()];
        int j = 0;
        while(!s.isEmpty()){
            ans[j++] = s.pop();
        }

        return ans;
    }
}
