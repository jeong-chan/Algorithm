public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String map[][] = new String[8][8];

        int ans = 0;
        for (int i = 0; i < 8; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < 8; j++) {
                map[i][j] = input[j];

                if(i%2 == 0){
                    if(j%2 == 0 && map[i][j].equals("F")){
                        ans++;
                    }
                }else{
                    if(j%2 == 1 && map[i][j].equals("F")){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
