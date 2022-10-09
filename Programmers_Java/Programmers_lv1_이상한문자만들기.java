public class Programmers_lv1_이상한문자만들기 {
    public String solution(String s) {
        String[] sList = s.split("");
        String answer = "";
        int index = 0;

        for(int i=0; i<sList.length; i++){
            if(sList[i].equals(" ")){
                index = 0;
            }else{
                if(index%2 == 0){
                    sList[i] = sList[i].toUpperCase();
                    index++;
                }else{
                    sList[i] = sList[i].toLowerCase();
                    index++;
                }
            }
            answer += sList[i];
        }
        return answer;
    }
}
