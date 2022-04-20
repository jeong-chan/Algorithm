public class Main {

    static int[][] gear = new int[4][8];
    static int score = 0;
    static int[] dirArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //톱니바퀴 2차원배열 생성
        for (int i = 0; i < gear.length; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < arr.length; j++) {
                gear[i][j] = Integer.parseInt(arr[j]);
            }
        }

        //사이클 횟수
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int idx = Integer.parseInt(st.nextToken()) - 1;
            int dir = Integer.parseInt(st.nextToken());

            dirArr = new int[4];			// 방향 배열 초기화
            dirArr[idx] = dir;

            checkToothL(idx, dir*-1);	// 좌측 탐색
            checkToothR(idx, dir*-1);	// 우측 탐색

            for (int j = 0; j < dirArr.length; j++){
                // 회전 방향 모두 설정한 후 톱니바퀴를 회전시킨다
                rotate(j, dirArr[j]);
            }
        }

        for (int i = 0; i < gear.length; i++) {
            if (gear[i][0] == 1)
                score += 1 << i;
        }

        System.out.println(score);
    }

    public static void rotate(int idx, int dir) {
        int temp = 0;
        //시계방향이면
        if (dir == 1) {
            //마지막 위치 톱니 저장
            temp = gear[idx][7];
            //0번부터 한칸씩 밀기
            for (int i = gear[idx].length - 1; i > 0; i--) {
                gear[idx][i] = gear[idx][i - 1];
            }
            //0번위치에 저장했던 톱니 지정
            gear[idx][0] = temp;
        }
        //반시계 방향이면
        else if(dir == -1) {
            //처음 위치 톱니 저장
            temp = gear[idx][0];
            //1번부터 앞으로 한 칸씩 당김
            for (int i = 0; i < gear[idx].length - 1; i++) {
                gear[idx][i] = gear[idx][i + 1];
            }
            //마지막 위치에 저장했던 톱니 지정
            gear[idx][7] = temp;
        }
    }

    //오른쪽 탐색
    public static void checkToothR(int left, int dir) {
        //left에서 +1방향
        int right = left + 1;
        //마지막 톱니 넘어가면 종료
        if (right > 3) return;
        //왼쪽의 톱니의 2번 날과 오른쪽 톱니의 6번날이 다른 극이라면
        if (gear[left][2] != gear[right][6]) {
            //오른쪽 톱니의 회전방향 저장
            dirArr[right] = dir;
            //한칸 이동하면서 반대방향으로 회전
            checkToothR(right, dir*-1);
        }
    }

    //왼쪽 탐색
    public static void checkToothL(int rihgt, int dir) {
        //right에서 -1방향
        int left = rihgt - 1;
        //처음 톱니 지나면 종료
        if (left < 0) return;
        //왼쪽의 톱니의 2번 날과 오른쪽 톱니의 6번날이 다른 극이라면
        if (gear[left][2] != gear[rihgt][6]) {
            //왼쪽 톱니의 회전방향 저장
            dirArr[left] = dir;
            //한칸 이동하면서 반대방향으로 회전
            checkToothL(left, dir * -1);
        }
    }

}
