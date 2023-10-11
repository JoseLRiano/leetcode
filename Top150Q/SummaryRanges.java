package Top150Q;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        StringBuilder sb;
        List<String> res = new ArrayList<>();
        for(int r = 0; r < nums.length; r++){
            sb = new StringBuilder();
            int start = nums[r];

            while(r + 1 < nums.length && nums[r] + 1 == nums[r + 1]){
                r++;
            }
            if(start != nums[r]){
                sb.append(start + "->" + nums[r]);
                
            }else{
                sb.append(String.valueOf(start));
            }
            res.add(sb.toString());

        }
        return res;
    }
}
