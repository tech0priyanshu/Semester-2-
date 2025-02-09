
public class NumbersExample {
    public static void main(String[] args) {
        //  write a function that takes in a number and prints it 
        // print first 5 numbers 
        number_print(1);


    }
   static void  number_print(int n){
     System.out.println(n);
     number_print(3);
    }
}
