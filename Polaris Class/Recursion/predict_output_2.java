class predict_output_2 {
    public static void main(String[] args) {
        print(3,4,5);
    }
    static void print(int n,int a,int b){
        if(n<=0){
            return;
        }
        print(n-1, a, b+n);
        System.out.println(n+" "+a+" "+b);
        print(n-1, b,a+n);
    }

}
