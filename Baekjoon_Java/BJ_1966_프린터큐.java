import javax.management.QueryEval;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static class Paper{
        int index, cost;

        public Paper(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        //테스트케이스만큼 반복
        for (int tc = 0; tc < TC; tc++) {
            //Paper객체를 갖는 리스트 생성 (q처럼 사용)
            LinkedList<Paper> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            //리스트에 입력 순으로 객체 삽입
            for (int i = 0; i <N; i++) {
                q.offer(new Paper(i, Integer.parseInt(st.nextToken())));
            }

            //출력순서를 나타낼 변수
            int count = 0;

            //q사이즈 만큼 반복
            while(!q.isEmpty()){
                //가장 앞에 있는 paper객체 꺼내오기
                Paper now = q.poll();
                boolean max = true;

                //남은 q사이즈 만큼 반복
                for (int i = 0; i < q.size(); i++) {

                    //꺼내온 paper객체보다 q에있는 paper객체의 cost가 더 큰게 있는경우
                    if(now.cost < q.get(i).cost){

                        //꺼내온 객체를 맨 뒤에 넣고
                        q.offer(now);
                        //방금 찾은 cost가 더 높은 객체가 나올 때까지 q의 맨 뒤로 삽입
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        //가장 큰게 아닌경우
                        max = false;
                        break;
                    }
                }
                //우선순위가 가장 큰게 아닌 경우
                if(!max){
                    continue;
                }

                //우선순위가 가장 큰경우
                //출력 카운트 1증가
                count++;
                //현재 꺼내온게 내가 찾는 Paper인 경우
                if(now.index==M){
                    //스탑
                    break;
                }
            }
            //출력양식
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
