public class first{
    public static void main(String[] args) {

    }
    // O(1) - constant time
    public static int getFirstElement(int[] arr){
        return[0];
    }
    // O(log N) - second best algo
    public static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length -1;
        while(start <= end){
            int mid =  start + (end-start)/2
            if(arr[mid] == target) return mid;
            else if (arr[mid] < target) start = mid +1;
            else end = mid-1;
        }
        return -1;

    }
    // O(N) - searching each element;
    public static int linearSearch(int[] arr , int target){
        for(int i =0; i < arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
        
    }
    //fibonnaci - O(2^n)
    public static int fib(int n){
        if( n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);

    }
    
    
    
}
