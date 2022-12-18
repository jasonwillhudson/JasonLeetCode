class Solution {
    public void reverseWords(char[] s) {

        reverse(0,s.length-1,s);

        int left = 0;
        for(int i=0; i<s.length; i++){
            if(s[i] == ' '){
                reverse(left, i-1,s);
                left = i+1;
            }
        }

        reverse(left, s.length-1,s);

    }

    private void reverse(int left, int right, char[] s){

        while(left<right){
            Character tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left ++;
            right --;
        }
    }
}
