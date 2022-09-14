public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int plus = Integer.parseInt(br.readLine());

        if( minute + plus >= 60){
            int hourplus = (minute+plus)/60;
            minute=(minute+plus)%60;
            hour = hour+hourplus;
        }
        else{
            minute = minute+plus;
        }

        if(hour >= 24) hour= hour%24;

        sb.append(hour+" "+minute);
        System.out.println(sb);
    }

}





