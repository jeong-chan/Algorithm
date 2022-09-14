public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] num = new long[3];
        long ans = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Long.parseLong(st.nextToken());
            ans += num[i];
        }
        System.out.println(ans);
    }
}


