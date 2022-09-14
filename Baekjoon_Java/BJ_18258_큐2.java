import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int number = 0;
            if(st.hasMoreTokens()){
                number = Integer.parseInt(st.nextToken());
            }

            if(command.equals("push")){
                q.offer(number);
            }
            else if(command.equals("pop")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(q.pop()).append("\n");
                }
            }
            else if(command.equals("size")){
                sb.append(q.size()).append("\n");
            }
            else if(command.equals("empty")){
                if(q.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            else if(command.equals("front")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(q.peek()).append("\n");
                }
            }
            else if(command.equals("back")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(q.getLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

}
