public class message{
public static void main(String[] args){ 

    // identify  if you can break down into problem into  smaller problem 

    // Write the recurrence relation if needed 
    // Draw recurive  tree
    // about the tree -> see the flow of function how they ate getting in stack,identify on right and left tree calls, draw a tree and pointer again and again using tree calls 
    // use a debugger to see the flow
    // see how valued returned at each step,see where the function call will come out of 

    //write s function that prints hello world 
  message();

}
static void message(){
        System.out.println("helloworld");
         message1();
    };
    static void message1(){
        System.out.println("helloworld");
        message2();
    };
    static void message2(){
        System.out.println("helloworld");
        message3();
    };
    static void message3(){
        System.out.println("helloworld");
        message4();
    };static void message4(){
        System.out.println("helloworld");
    };
}