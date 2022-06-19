import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] strs = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].equals("(")){
                    stack.push(strs[j]);
                }else{
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }else{
                        stack.pop();
                        flag = true;
                    }
                }
            }

            if(flag && stack.isEmpty()){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
    }

}
