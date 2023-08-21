/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var maxVowels = function(s, k) {
    let count = 0;
    let max = 0;
    for(let i = 0; i < k; i++){
        if(isVowel(s.charAt(i))){
            count++;
        }
    }
    if(count == k) return k;
    max = count;
    for(let j = k; j < s.length; j++){
        if(isVowel(s.charAt(j))){
            count++;
        }
        if(!isVowel(s.charAt(j - k))){
            count --;
        }
        if(count == k) return count;
        max = Math.max(max, count);
    }
    return max;
}

let isVowel = function(ch){
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}