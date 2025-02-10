class power_of_linear{
    public static void main(String[] args) {
       System.out.println(n_power_x(5,3));
    }
    static int n_power_x(int n,int x){
        if(x==1){
            return n;
        }
        int ans=n_power_x(n, x-1);
        return ans*n;
    }
}