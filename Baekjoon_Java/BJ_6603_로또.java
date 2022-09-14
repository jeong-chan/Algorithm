public class Main {

    static int N;
    static int[] numbers, ans;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            //N==0이면 종료
            if(N==0) break;
            //입력받을 숫자를 담을 배열
            numbers = new int[N];
            //정답 숫자를 담을 배열
            ans = new int[N];
            
            //입력 받은 수 저장
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            //조합
            permu(0,0);
            sb.append("\n");
        }
        System.out.println(sb);

    }

    //조합생성
    public static void permu(int cnt, int start){

        //6개의 숫자 선택 완료시
        if(cnt == 6){
            for (int i = 0; i < 6; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        //정답 배열에 입력받은 숫자를 차례로 넣어봄
        for (int i = start; i < N; i++) {
            ans[cnt] = numbers[i];
            permu(cnt+1, i+1);
        }
    }


}


