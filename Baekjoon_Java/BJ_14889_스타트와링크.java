import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int score[][];
    static int num;
    static boolean visit[];
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        score = new int[num][num];
        visit = new boolean[num];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                score[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(min);;
    }

    public static void dfs(int depth, int a){

        //4명이 선택되면 dfs 멈추기
        if(depth==num/2){
            diff();
            return;
        }

        //visit이 true이면 start팀
        //visit이 false이면 link팀
        //dfs로 재귀하면서 이전에 지정된 값들은 변경하지 않기 위해
        for (int i = a; i < num; i++) {
            visit[i] = true;
            dfs(depth+1, i+1);
            visit[i] = false;
        }
    }

    //팀 시너지 구하기
    public static void diff(){
        int start = 0;
        int link = 0;
        //score판 탐색
        for (int i = 0; i < num-1; i++) {
            for (int j = i+1; j < num ; j++) {
                //둘다 start팀인경우 시너지 합산
                if(visit[i] && visit[j]){
                    start += score[i][j];
                    start += score[j][i];
                }
                //둘다 link팀인경우 시너지 합산
                else if(!visit[i] && !visit[j]){
                    link += score[i][j];
                    link += score[j][i];
                }
            }
        }

        int value = Math.abs(start-link);

        if(value == 0){
            System.out.println(value);
            System.exit(0);
        }

        min=Math.min(min, value);
    }

}
