class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        if(n == 0 || (flowerbed.length == 1 && flowerbed[0] == 0)) return true;
        for(int i = 0; i < flowerbed.length ;i++){
            if(flowerbed.length < 2) break;
            int prev = i - 1, next = i + 1;
            if(i == 0 && flowerbed[i] == 0){
                if(flowerbed[next] == 0){
                    n--;
                    flowerbed[i] = 1;
                    if(n == 0) return true;
                }
            }else if(i == flowerbed.length - 1 && flowerbed[i] == 0){
                if(flowerbed[prev] == 0){
                    n--;
                    flowerbed[i] = 1;
                    if(n == 0) return true;
                }
            }else {
                if(flowerbed[i] == 0) {
                    if(flowerbed[prev] == 0 && flowerbed[next] == 0){
                        n--;
                        flowerbed[i]= 1;
                        if(n == 0) return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        Solution test = new Solution();
        int[] caseOne = {1,0,0,0,1};
        int caseOneNumb = 1;
        int[] caseTwo = {1,0,0,0,1};
        int caseTwoNumb = 2;
        System.out.println(test.canPlaceFlowers(caseOne, caseOneNumb));
        System.out.println(test.canPlaceFlowers(caseTwo, caseTwoNumb));
    }
    
}
