package facebookTop100;

import java.util.Queue;

public class nestedListWeightSum {

    // public int dfs(List<NestedList> list, int depth){
    //     int sum = 0;
    //     for(NestedList nested : list){
    //         if(nested.isInteger()){
    //             sum += nested.getInteger() * depth;
    //         }else{
    //             sum += dfs(nested.getList(), depth + 1);
    //         }
    //     }
    //     return sum;
    // }

    public int depthSum(List<NestedInteger> nestedList){
        // return dfs(nestedList, 1);    

        Queue<NestedInteger> q = new LinkedList<>();
        q.addAll(nestedList);
        int sum = 0;
        int depth = 1;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                NestedInteger item = q.poll();
                if(item.isInteger()){
                    sum += item.getInteger() * depth;
                }else{
                    q.addAll(item.getList());
                }

            }
            depth++;
        }
        return sum;
    }
}
