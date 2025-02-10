class predict_output_1{
    public static void main(String[] args) {
        int ans=func(2);
        System.out.println(ans);
    }
    static int func(int n){
     if(n==4){
        return 4;
     }
    return 2*func(n+1);
    }
}