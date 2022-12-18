class Solution {
    public boolean isOneEditDistance(String s, String t) {

        if(s.equals(t)|| Math.abs(s.length()-t.length()) > 1) return false;

        int endS = 0;
        int endT = 0;
        int state = 0;
        boolean changedOnce=false;

        //0, same length, 1, t should jump one, 2, s should jump one
        if(s.length()<t.length()){
          state=1; 
          s += " "; 
        } 
        else if(s.length()>t.length()){
           state=2; 
           t += " ";
        } 

        while(endS<s.length() && endT<t.length()){

            Character sC = s.charAt(endS);
            Character tC = t.charAt(endT);

            if(sC != tC){
                if(changedOnce) return false;
                
                if(state == 0){
                    endS++;
                    endT++;
                }
                else if(state == 1){
                    endT++;
                }
                else{
                    endS++;
                }

                changedOnce=true;
            }
            else{
                endS++;
                endT++;
            }
        }

        return true;
    }
}