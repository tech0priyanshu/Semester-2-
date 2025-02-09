public class fibonacci_number {
    public static void main(String[] args) {
    // find nth fibonacci number 
    // fibonacci number=sum of first previous and second 
    // 0th -> 0
    // 1st -> 1+0
    // 2nd -> 1+0+0
    // 3rd -> 1+1+0+0
    // 4th -> 2+1
    // 5th -> 3+2
    //Fn = Fn-1 + Fn-2  
    // when we write recursion into  formuala that is called recurrence relation
    // the base condition represented by answer we have 
    // F(0)-> 0
    // F(1)-> 1
    
    System.out.println(fibonacci_number(10));
    }
    static int fibonacci_number(int n){
        // base condition
        if(n<2){
            return n;
        }
       return  fibonacci_number(n-1)+fibonacci_number(n-2);
}
}
