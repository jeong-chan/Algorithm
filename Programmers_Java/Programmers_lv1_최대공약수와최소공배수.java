import java.util.Arrays;
import java.util.Stack;

public class Programmers_lv1_최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        Stack<Integer> stack = new Stack<>();
        int[] answers = {};

        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = n*m/answer[0];
        return answer;
    }

    public int gcd(int m, int n){
        if(n==0) return m;
        return gcd(n, m%n);
    }
}
