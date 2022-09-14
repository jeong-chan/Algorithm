import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int[] color;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        color = new int[3]; // 0: Minus, 1: Zero, 2: One

        //맵 전부 같은 색인 경우를 판별하기 위한 변수
        boolean all_Minus = true;
        boolean all_Zero = true;
        boolean all_One = true;

        for (int i = 0; i < N; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == -1){
                    all_Zero = false;
                    all_One = false;
                }else if(map[i][j] == 0){
                    all_Minus = false;
                    all_One = false;
                }else{
                    all_Minus = false;
                    all_Zero = false;
                }
            }
        }

        //맵 전체가 -1인 경우
        if(all_Minus){
            System.out.println(1);
            System.out.println(0);
            System.out.println(0);
            return;
        }

        //맵 전체가 0인 경우
        if(all_Zero){
            System.out.println(0);
            System.out.println(1);
            System.out.println(0);
            return;
        }

        //맵 전체가 1인경우
        if(all_One){
            System.out.println(0);
            System.out.println(0);
            System.out.println(1);
            return;
        }

        //섞여 있는 경우
        //재귀함수 실행
        ref(0,0,N);
        
        //출력
        System.out.println(color[0]);
        System.out.println(color[1]);
        System.out.println(color[2]);
    }

    public static void ref(int y, int x, int size){

        //부분맵의 크기가 1보다 작아지는 경우 종료
        if(size<1){
            return;
        }

        //각 부분맵에 들어있는 숫자 확인을 위한 변수
        boolean minus =true;
        boolean zero =true;
        boolean one =true;

        //부분 맵 확인
        for (int i = 0+y; i < size+y; i++) {
            for (int j = 0+x; j < size+x; j++) {
                if(map[i][j] == -1){
                    zero = false;
                    one = false;
                }else if(map[i][j] == 0){
                    minus = false;
                    one = false;
                }else{
                    minus = false;
                    zero = false;
                }
            }
        }

        //부분맵이 -1인 경우 -1 한 장 추가
        if(minus){
            color[0]++;
            return;
        }
        //부분맵이 0인 경우 0 한 장 추가
        if(zero){
            color[1]++;
            return;
        }
        //부분맵이 1인 경우 1 한 장 추가
        if(one){
            color[2]++;
            return;
        }

        //맵을 9개로 나눠서 확인
        
        //위쪽
        //왼쪽 위
        ref(y,x,size/3);
        //가운데 위
        ref(y,x+size/3,size/3);
        //오른쪽 위
        ref(y,x+(size/3)*2,size/3);
        
        //중앙
        //왼쪽 중앙
        ref(y+size/3,x,size/3);
        //정중앙
        ref(y+size/3,x+size/3,size/3);
        //오른쪽 중앙
        ref(y+size/3,x+(size/3)*2,size/3);
        
        //아래쪽
        //왼쪽 아래
        ref(y+(size/3)*2,x,size/3);
        //가운데 아래
        ref(y+(size/3)*2,x+size/3,size/3);
        //오른쪽 아래
        ref(y+(size/3)*2,x+(size/3)*2,size/3);

    }
}
