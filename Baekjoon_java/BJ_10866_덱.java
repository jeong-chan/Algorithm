import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        int num_of_command = Integer.parseInt(br.readLine());
        for (int i = 0; i < num_of_command; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int number = 0;
            if(st.hasMoreTokens()){
                number = Integer.parseInt(st.nextToken());
            }

            if(command.equals("push_back")){
                dq.addLast(number);
            }else if(command.equals("push_front")){
                dq.addFirst(number);
            }else if(command.equals("front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.getFirst()).append("\n");
                }
            }else if(command.equals("back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.getLast()).append("\n");
                }
            }else if(command.equals("size")){
                sb.append(dq.size()).append("\n");
            }else if(command.equals("empty")){
                if (dq.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(command.equals("pop_front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.pollFirst()).append("\n");
                }
            }else if(command.equals("pop_back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.pollLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

}
