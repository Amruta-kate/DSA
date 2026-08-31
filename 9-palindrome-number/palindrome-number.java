class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
       int lastdig;
       int num=x;
       while(x>0){
        lastdig=x%10;
        rev=lastdig+rev*10;
        x=x/10;
       }
       if(rev==num){
        return true;
       }
       else{
        return false;
       }
       

    }
}