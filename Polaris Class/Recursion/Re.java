public class Re{
    public static void foo(int i){
        if(i<0){
            return;
        }
        System.out.println("Start "+i);
        foo(i-1);
        System.out.println("end "+i);
     }
    public static void main(String[] args) {
        foo(3);
    }
}