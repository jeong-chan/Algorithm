public class Programmers_lv2_숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i==n){
                answer++;
                break;
            }
            int number = 0;
            for(int j=i; j<=n; j++){
                number +=j;
                if(number == n){
                    answer++;
                }else if(number > n){
                    break;
                }
            }
        }
        return answer;
    }
}
