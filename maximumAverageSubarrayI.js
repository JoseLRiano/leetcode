/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let sum = 0;
    for(let i= 0; i < k; i++){
        sum += nums[i];
    }
    let windowSum = sum;
    for(let j = k; j < nums.length; j++){
        sum += nums[j] - nums[j - k];
        windowSum = Math.max(sum, windowSum);
    }
    return windowSum/k;
};