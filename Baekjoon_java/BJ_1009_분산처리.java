public class Main {

    static int[][] number_map = {{1,1,1,1}, {6,2,4,8}, {1,3,9,7}, {6,4,6,4},{5,5,5,5},{6,6,6,6},{1,7,9,3},{6,8,4,2},{1,9,1,9}};
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < TC; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())%10;
            int b = Integer.parseInt(st.nextToken());

            if(a==0){
                sb.append(10).append("\n");
            }else {
                sb.append(number_map[a-1][b%number_map[a-1].length]).append("\n");
            }

        }
        System.out.println(sb);
    }
}
