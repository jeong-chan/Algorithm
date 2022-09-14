public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[5];
        int ans =0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            ans += Math.pow(num[i],2);
        }
        System.out.println(ans%10);
    }
}


