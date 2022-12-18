class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int count = 0;
        int start = 0;

        Map<Character, Integer> track = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(track.containsKey(c)){
                count=Math.max(i-start, count);
                start = Math.max(track.get(c)+1, start);
            }
            track.put(c, i);
        }
//System.out.println(start);
        count = Math.max(s.length()-start, count);

        return count;
    }
}