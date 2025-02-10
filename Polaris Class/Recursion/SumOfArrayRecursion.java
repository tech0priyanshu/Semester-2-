public class SumOfArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {13, 12, 12, 45, 23, 22};
        int ans = sum(arr, 0);
        System.out.println(ans);
    }
      static int sum(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }
        return arr[n] + sum(arr, n + 1);
    }
}
