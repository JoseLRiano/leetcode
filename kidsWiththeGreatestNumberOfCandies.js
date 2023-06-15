/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    // let result = new Array();
    const max = Math.max(...candies);
    // candies.forEach((candie, index) => {
    //     if(candie + extraCandies >= max){
    //         result[index] = true;
    //     } 
    //     else result[index] = false;
    // });
    return candies.map((candie) => (candie + extraCandies) >= max);
};