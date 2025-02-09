
public class NumbersExample {
    public static void main(String[] args) {
        //  write a function that takes in a number and prints it 
        // print first 5 numbers 
        number_print(1);


    }
   static void  number_print(int n){
    if(n==5){
        System.out.println(n);
        return;
    } // this base condition where excustion end 
     System.out.println(n);
     
     number_print(n+1); // this is last function call 
     //this is  called as Tail recursion 
    }
}
 // recursion solution into iteration & vice-versa 
 // sc is not constant because of recursive call 