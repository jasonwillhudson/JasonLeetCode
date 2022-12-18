class Solution {
    public String reverseWords(String s) {

        //store the word
        String tmp = "";

        //store result
        String res="";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ') tmp += s.charAt(i);
            else if(tmp != ""){
                if(res=="") res = tmp + res;
                else res = tmp + " " +res;

                //reset tmp
                tmp = "";
            }
        }

        //add a word if there has extra word after loop
        if(tmp != ""){
          if(res=="") res = tmp + res;
            else res = tmp + " " +res;  
        }
        

        return res;
    }
}
