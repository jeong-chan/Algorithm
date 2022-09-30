public class Programmers_lv2_JadanCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] sArray = s.split("");
        for(int i=0; i<sArray.length; i++){
            if(i==0 || sArray[i-1].equals(" ")){
                sArray[i] = sArray[i].toUpperCase();
            }
            answer += sArray[i];
        }

        return answer;
    }
}
