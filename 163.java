class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] >= lower && nums[i] <= upper){
                if(nums[i] - lower == 1) result.add(String.valueOf(lower));
                else if(nums[i] - lower>1){
                    String s = String.valueOf(lower)+"->"+String.valueOf(nums[i]-1);
                    result.add(s);
                }

                 lower = nums[i]+1;
            }

        }

        if(upper == lower) result.add(String.valueOf(upper));
        else if(upper - lower>0){
                    String s = String.valueOf(lower)+"->"+String.valueOf(upper);
                    result.add(s);
        }

        return result;
    }
}