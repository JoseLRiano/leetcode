/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maxOperations = function(nums, k) {
    nums.sort((a,b) => a - b);
    let left = 0;
    let right = nums.length -1;
    let count = 0;
    while(left < right){
        (nums[left] + nums[right] == k) ? (left++, right--, count++) 
        : (nums[left] + nums[right] < k) ? left++
        : right--;
    }
    return count;
};