public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfStudent = Integer.parseInt(st.nextToken());
        int totalTime = Integer.parseInt(st.nextToken());

        boolean[] times = new boolean[totalTime+1];
        for (int i = 0; i < numOfStudent; i++) {
            int student = Integer.parseInt(br.readLine());

            for (int j = 0; j < times.length; j++) {

                if(times[j]){
                    continue;
                }

                if(j!=0 && j%student==0){
                    times[j] = true;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < times.length; i++) {
            if(times[i]){
                ans++;
            }
        }

        System.out.println(ans);
    }
}


