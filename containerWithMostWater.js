/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let left = 0;
    let right = height.length - 1;
    let max = 0;
    while(left < right){
        let w = right - left;
        let h = Math.min(height[left], height[right]);
        let area = w * h;
        max = (area > max ? area : max);
        height[left] < height[right] ? left++
            : right--;
                
    }
    return max;
};