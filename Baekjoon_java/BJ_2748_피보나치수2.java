public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        long[] fibo = new long[91];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        fibo[3] = 2;
        fibo[4] = 3;
        for (int i = 5; i <=number ; i++) {
            fibo[i] = fibo[i-1]+fibo[i-2];
        }

        System.out.println(fibo[number]);
    }

}




