import java.util.Arrays;
import java.util.Locale;

public class Programmers_lv1_문자열다루기기본 {
    public boolean solution(String s) {
        boolean[] answer = new boolean[s.length()];
        if(s.length() != 4 && s.length() != 6){
            System.out.print(s.length());
            return false;
        }
        Arrays.fill(answer, false);

        String n = "0123456789";
        String[] nArray = n.split("");
        String[] sArray = s.split("");

        for(int i =0; i<sArray.length; i++){
            boolean flag = false;
            for(int j=0; j<nArray.length; j++){
                if(nArray[j].equals(sArray[i])){
                    flag = true;
                    break;
                }
            }

            if(flag){
                answer[i] = true;
            }
        }

        for(int i=0; i<answer.length; i++){
            if(!answer[i]){
                return false;
            }
        }
        return true;
    }
}
