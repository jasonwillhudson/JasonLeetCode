class Solution {
    public boolean isNumber(String s) {
        
        s = s.toLowerCase();
        boolean hasE = false;
        boolean hasSymbol = false;
        boolean hasDot = false;
        boolean hasNumberAroundDot = false;
        boolean hasNumberAfterE=false;
        boolean hasNumber=false;

        for(int i=0; i<s.length(); i++){

            //check sign
            if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                if(hasSymbol) return false; //repeated sign, false
                else if(i!=0 && !hasE) return false;
                else if(hasE && (s.charAt(i-1) != 'e')) //symbol is not after e
                return false;
                else hasSymbol = true;
            }

            //check dot
            else if(s.charAt(i) == '.'){
                if(hasE || hasDot) return false; //repeated dot or after e, false
                else hasDot = true;

                //check if has number before dot
                if(i>0 && Character.isDigit(s.charAt(i-1)))
                hasNumberAroundDot = true;
            }