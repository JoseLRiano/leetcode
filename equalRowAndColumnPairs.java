class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        int[][] trans = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                trans[i][j] = grid[j][i];
            }   
            // System.out.println(Arrays.toString(trans[i]));        
        }
        
        for(int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                if(Arrays.equals(grid[i], trans[j])){
                    count++;
                }
            }
        }

        return count;

        // Map<String, Integer> row = new HashMap<>();
        // Map<String, Integer> col = new HashMap<>();
        // int max =0;

        // for(int i = 0; i < grid.length; i++){
         
        //     String countRow = "";
        //     String countCol = "";
        //     for(int j = 0; j < grid.length; j++){
        //             countRow += Integer.toString(grid[i][j]) + "-"; 
        //             countCol += Integer.toString(grid[j][i]) + "-";
                
                
        //     }
        //     row.put(countRow, row.getOrDefault(countRow, 0) +1);
        //     col.put(countCol, col.getOrDefault(countCol, 0) +1);
        // }
        // for(Map.Entry<String, Integer> entry : row.entrySet()){
        //     String rowKey = entry.getKey();
        //     if(col.containsKey(rowKey)){
        //         max += col.get(rowKey) * row.get(rowKey); 
        //     }
        // }

        // return max;
    }
}