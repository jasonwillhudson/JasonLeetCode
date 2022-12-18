

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;


        int[] temp = nums.clone();
        Arrays.sort(temp);

        //store number result
        int[] numberResult = new int[2];
        int[] result = new int[]{-1,-1};

        //find the number group
        while(left< right){
            if(temp[right] + temp[left] >target) right--;
            else if(temp[right] + temp[left] < target) left++;
            else{
                numberResult[0] = temp[left];
                numberResult[1] = temp[right];
                break;
            }
        }


        //find their index
        for(int i=0; i<nums.length; i++){
            if(nums[i] == numberResult[0] || nums[i] == numberResult[1]){

                if(result[0] != -1 &&result[1] != -1) break;
                if(result[0] == -1) result[0] = i;
                else result[1] = i;
            }
        }
        return result;
    }
}