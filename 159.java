class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] count = new int[256];

        int start = 0;
        int max = 0;
        int distinctCount = 0;

        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            
            //increase distinct if already exists
            if(count[c] ==0 ){
                distinctCount++;
            }

            //check distinct and move start pointer
            while(distinctCount>2){
                count[s.charAt(start)]--;
                if(count[s.charAt(start)] == 0) distinctCount--;
                start++;
                    
            }

            //get max len
            max =Math.max(i-start+1, max);

            //increase current count
            count[c] ++;
        }

        //max = Math.max(s.length()-start, max);
        return max;
    }
}