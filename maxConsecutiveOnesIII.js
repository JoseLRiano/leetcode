var longestOnes  = function(nums, k){
    let j = 0;
    let i = 0;
    for( i; i < nums.lenght; i++){
        if(nums[i] == 0) k--;
        if(k < 0 && nums[j++] == 0) k++;
    }
    return i -j;
}