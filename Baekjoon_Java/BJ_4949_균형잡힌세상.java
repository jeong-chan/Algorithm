import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String input = br.readLine();
            Stack<String> stack = new Stack<>();

            if(input.equals(".")){
                break;
            }

            String[] sentence = input.split("");
            boolean flag = true;
            for (int i = 0; i < sentence.length; i++) {
                String str = sentence[i];
                if(str.equals("(")){
                    stack.push(str);
                }else if(str.equals("[")) {
                    stack.push(str);
                }else if(str.equals(")")){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }else{
                        if(stack.peek().equals("(")){
                            stack.pop();
                            flag = true;
                        }else{
                            flag = false;
                            break;
                        }
                    }
                }else if(str.equals("]")){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }else{
                        if(stack.peek().equals("[")){
                            stack.pop();
                            flag=true;
                        }else{
                            flag = false;
                            break;
                        }
                    }
                }else{
                    continue;
                }
            }

            if(!flag || !stack.isEmpty()){
                sb.append("no").append("\n");
            }
            else if(flag){
                sb.append("yes").append("\n");
            }
        }
        System.out.println(sb);
    }

}
