public class KthSymbolGrammar {
    public static void main(String[] args) {
        int n = 3;
        int k = 4;
        System.out.println(solve(n, k));
    }

    private static int solve(int N, int K) {
        if(N == 1 && K == 1) {
            return 0;
        }
        
        if(N == 1) {
            return 1;
        }
        int mid = (int)Math.pow(2, N - 1);
        if(K <= mid) { 
            return solve(N - 1, K);
        } else {
            return (solve(N - 1, K - mid)^1);
        }
    }
}