public class print_array {
    static void print_array(int[] array, int n){
         if(n==array.length){
            return;
        }
        System.out.println(array[n]);
        print_array(array,n+1);
    }
    public static void main(String[] args) {
        int[] array={1,5,8,2};
        print_array(array,0);
        int a=array.length-1;
        print_reverse(array,a);
    }
    static void print_reverse(int[] array,int a){
        if (a<0) {
            return;
        }
        System.out.println(array[a]);
        print_reverse(array,a-1);
    }
}
