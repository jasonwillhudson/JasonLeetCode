class TwoSum {

    private int[] arr;
    private boolean isSorted = false;

    public TwoSum() {
        arr = new int[0];
    }
    
    public void add(int number) {
        int[] tmp = new int[arr.length+1];

        for(int i=0; i< arr.length; i++){
            tmp[i] = arr[i];
        }
        tmp[arr.length] = number;

        arr = tmp;
        isSorted = false;
    }
    
    public boolean find(int value) {
        if(arr.length<2) return false;

        if(!isSorted){
          Arrays.sort(arr);
        isSorted = true;  
        }

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[right]+arr[left]>value) right--;
            else if(arr[right]+arr[left]==value) return true;
            else{
                left++;
            }

        }

        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
