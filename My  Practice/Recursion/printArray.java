public class printArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        print(array,0);
    }
    static void print(int[] array,int n){
       if(n==array.length){
         return;
         }
         System.out.print(array[n]);
       print(array,n+1);
       if(n<0){
        return;
       }

    
        
    }
    
}
