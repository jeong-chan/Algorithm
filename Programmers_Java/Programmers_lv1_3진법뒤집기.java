import java.util.ArrayList;
import java.util.Stack;

public class Programmers_lv1_3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        while(true){
            if(n/3 == 0){
                stack.push(n%3);
                break;
            }

            stack.push(n%3);
            n = n/3;
        }

        int size = stack.size();

        for(int i=0; i<size; i++){
            answer += stack.pop()*Math.pow(3,i);
        }

        return answer;
    }

}
