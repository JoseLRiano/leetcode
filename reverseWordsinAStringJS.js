/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    start = s.length;
    end = start + 1;
    result = "";
    console.log(s.charAt(start));
    while(start !== end){
        end = --start;
        while(end >= 0 && s.charAt(end) === " "){
            end--;
        }
        start = end;
        while(start >= 0 && s.charAt(start) !== " "){
            start--;
        }
        
        result += s.substring(++start, ++end) + " ";      
    }
    
    return result.trim();
};