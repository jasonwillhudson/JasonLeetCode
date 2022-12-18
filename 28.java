class Solution {
    public int strStr(String haystack, String needle) {
        
        int left =0;
        int right = needle.length()-1;

        int res = -1;

        while(right <= haystack.length()-1){
            
            //compare string
            if(haystack.substring(left,right+1).equals(needle))
              return left;  
            left++;
            right++;
        }

        return res;
    }
}
