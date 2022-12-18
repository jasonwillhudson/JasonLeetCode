class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        int left = -1;
        int sign = 1;

        //find start point
        for(int i=0; i< s.length(); i++){
            Character c = s.charAt(i);
            if(c != ' '){
              if(c == '+' || c == '-' || Character.isDigit(c)){
                  sign = (c=='-' ? -1 : 1);
                  left = i;
                break;
                }
                else return 0;
            }

        }

        if(left == -1) return 0;

        int right = left+1;

        //find end point
        while(right<s.length()){
            Character c = s.charAt(right);
            if(!Character.isDigit(c)){
                break;
            }
            right++;
        }
        

        //convert result ro string
        String str = s.substring(left,right);

        //trim symbol and check empty
        if (str.length()==0) return 0;
        else if(str.charAt(0)=='+' || str.charAt(0)=='-') 
        str=str.substring(1, str.length());

        int res = 0;

        //get result
        for(int i=0; i<str.length(); i++){
            int number = str.charAt(i)-'0';

            //positive number overflow check
            if(sign == 1 && (res > Integer.MAX_VALUE/10 || 
            res == Integer.MAX_VALUE/10 && number > 7)) 
                return Integer.MAX_VALUE;

            //negative number overflow check
            else if(sign == -1 && (res * sign < Integer.MIN_VALUE/10 || 
            res * sign == Integer.MIN_VALUE/10&& number > 8)) 
                return Integer.MIN_VALUE;
            res = res*10 + (number);
        }

        return res * sign;
        
    }
}