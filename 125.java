class Solution {
    public boolean isPalindrome(String s) {
        
        //replace special symbols and transform to lower case
        s=s.toLowerCase();

        //left right pointer
        int left = 0;
        int right = s.length()-1;

        //result default as true
        boolean result = true;

        //compare character on two sides
        while(left<right){

            //get left character and right character
            Character charleft = s.charAt(left);
            Character charright = s.charAt(right);


            //if character not a alphanumeric then move iterator
            if(!isAlpha(charright)) right--;
            else if(!isAlpha(charleft)) left++;

            //compare two side
            else if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                result = false;
                break;
            }
        }

        return result;

    }

    private boolean isAlpha(Character character){
        if ((character >= '0' && character <= '9') || (character >= 'a' 
            && character <= 'z')){
            return true;
        }else{
        return false;
        }
    }
}
