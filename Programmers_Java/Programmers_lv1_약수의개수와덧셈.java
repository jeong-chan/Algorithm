public class Programmers_lv1_약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i<=right; i++){
            if(i == (int) Math.sqrt(i)*Math.sqrt(i)){
                answer -= i;
            }else{
                answer += i;
            }
            System.out.println(answer);
        }

        return answer;
    }
}
