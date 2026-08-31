class Solution {
    public int myAtoi(String s) {
        int sign=1;
        long num=0;
        int i=0;
       while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() &&s.charAt(i)=='-'){
           sign=-1;
           i++;
        }
        else if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() &&s.charAt(i)>='0' && s.charAt(i)<='9'){
           
       int digit=s.charAt(i)-'0';
       if(num>214748364 || num==214748364 && digit>(sign==1?7:8)){
        if(sign==1){
            return 2147483647;
        }
        else{
            return -2147483648;
        }
       }
       num=num*10+digit;
       i++;
        }
       int num1=(int)(num*sign); 
       
       return num1;
    }
}