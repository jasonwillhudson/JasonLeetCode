/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4); 
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */


    int pt = 0; //total pointer
    int lastPointer = 0; //last pointer in bf4
    char[] buf4 = new char[4]; //global array
    int size = 0; //size of the array

    public int read(char[] buf, int n) {
        if(size == 0){
           size = read4(buf4); 
           lastPointer = 0;
        } 

        int count = 0;

        //keep fetching data and copy if less than n
        while(size>0 && count<n){
            
            //copy array start from last saved point
            for(int i=lastPointer; i<size; i++){
                
                lastPointer = i;//update last pointer

                //stop the loop and return if reach n items in array
                if(count>=n) {
                    pt+=count;
                 return count;   
                }
            
                buf[count] = buf4[i];
                count++;
            }

            size = read4(buf4);
            lastPointer = 0;
            
        }
        
        return count;
    }
}