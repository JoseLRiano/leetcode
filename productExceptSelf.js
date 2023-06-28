var productExceptSelf = function(nums) {
    let right = 1;
    let solution = [0];
    nums.forEach((item, index) => {
        item > 0 && (solution[index] = nums[index -1] * solution[index -1])
    });
    for(let i = nums.length -1; i >= 0; i--){
        solution[i] = solution[i] * right;
        right = right * nums[i];
    }
    return solution;
}