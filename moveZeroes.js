var moveZeroes = function(nums){
    let countZeroes = 0;
    let temp = 0;
    for(let i = 0; i < nums.length; i++){
        nums[i] == 0 ? countZeroes++
            : (temp = nums[i],
                nums[i] = 0,
                nums[i - countZeroes] = temp);
    }
};