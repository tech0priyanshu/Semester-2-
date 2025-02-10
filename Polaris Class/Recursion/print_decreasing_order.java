public class print_decreasing_order {
public static void main(String[] args) {
    //Print on decreasing order
    print(10);}
static void print(int n){
    System.out.println(n);
    if(n==0){
        return;
    }
    print(n-1);
}
}
    
