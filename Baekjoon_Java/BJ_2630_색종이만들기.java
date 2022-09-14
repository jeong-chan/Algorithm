public class Main {

    static int[][] map;
    static int[] color;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        color = new int[2]; //0: while 1:blue

        //전부 흰색이거나 파란색인 경우
        boolean all_white = true;
        boolean all_blue = true;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1){
                    all_white = false;
                }else{
                    all_blue = false;
                }
            }
        }

        //전부 흰색인경우
        if(all_white && !all_blue){
            System.out.println(1);
            System.out.println(0);
            return;
        }
        //전부 파란색인 경우
        else if(!all_white && all_blue){
            System.out.println(0);
            System.out.println(1);
            return;
        }

        //섞여 있는 경우 재귀함수 호출
        ref(0,0,N);


        System.out.println(color[0]);
        System.out.println(color[1]);

    }

    public static void ref(int y, int x, int size){

        //한변의 길이가 1보다 작아지면 재귀종료
        if(size < 1){
            return;
        }

        //흰색과 파란색을 나타내는 변수
        boolean white = true;
        boolean blue = true;

        //지정된(분할된) 맵이 전부 같은 색으로 이루어졌는지 확인
        for (int i = 0+y; i <size+y ; i++) {
            for (int j = 0+x; j < size+x; j++) {
                if(map[i][j] == 1){
                    white = false;
                }else{
                    blue = false;
                }
            }
        }

        //전부 흰색이면 흰색 한장 추가
        if(white){
            color[0]++;
            return;
        }
        //전부 파란색이면 파란색 한장 추가
        if(blue){
            color[1]++;
            return;
        }

        //4사분면 으로 나눠서 재귀함수 실행
        
        //1사분면
        ref(y,x,size/2);
        //2사분면
        ref(y,x+size/2,size/2);
        //3사분면
        ref(y+size/2,x,size/2);
        //4사분면
        ref(y+size/2,x+size/2,size/2);


    }
}
