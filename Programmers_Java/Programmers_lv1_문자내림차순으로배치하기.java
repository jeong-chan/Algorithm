import java.util.Arrays;
import java.util.Collections;

public class Programmers_lv1_문자내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split("");

        Arrays.sort(sArray, Collections.reverseOrder());
        for(int i=0; i<sArray.length; i++){
            answer += sArray[i];
        }

        return answer;
    }
}
