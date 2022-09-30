import java.util.Stack;

public class Programmers_lv2_올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '('){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)== '('){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }

            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
