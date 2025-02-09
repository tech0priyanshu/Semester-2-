public class binary_search {
    public static void main(String[] args) {
      // working with variable ->Arguments ->will go into next function call
      //                       ->Return type 
      //                       -> Body of function-> specific to that call 
      // Binary search with recursion
      // F(n)=O(1){comparsion}+F(n/2){dividing arr in half } -> recurrence relation
      // type of recurrence realtion ->linear,divide & conquer
      // Sc-> O(2^n) somewhat correct 
      // Sc ->(golden ratio)^n golden ratio=1.618
      
      int[] arr={1,5,8,68,5555,3363,7257};
      int target=3363;
      System.out.println(search(arr, target, 0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
    if(start>end){ // not found the ans 
      return -1;
    }
    int mid=start+(end-start)/2;
    if(arr[mid]==target){
      return mid;
    }
    if(target < arr[mid] ){
        return search(arr, target, start, mid-1);
      }
  
    return search(arr, target , mid+1, end);
    }
}
