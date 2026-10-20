class Solution {
    public boolean isPalindrome(int x) {
    int original =x;
    long reverse =0,remainder;
    if(x<0){
        return false;
    }
    while(x !=0){
        remainder = x%10;
        reverse = reverse*10+remainder;
        x=x/10;
    }
    if (original==reverse){
        return true;
    }
    else{
        return false;
    }
        
        
    }
}