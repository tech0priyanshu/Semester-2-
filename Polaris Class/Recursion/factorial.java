class factorial{
public static void main(String[] args) {
   System.out.println(print_factorial(5));
}
static int print_factorial(int n){
    if(n==1){
        return 1;
    }
    int ans=print_factorial(n-1);
    return ans*n;
   }
}