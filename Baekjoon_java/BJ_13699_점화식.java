public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n+1];

        arr[0] = 1;

        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < k; i++) {
                arr[k] += arr[i] * arr[k-1-i];
            }
        }

        System.out.println(arr[n]);
    }
}
