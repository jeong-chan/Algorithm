public class Programmers_lv2_이진변환반복하기 {
    public int[] solution(String s) {


        int numOfZero = 0;
        int cycle = 0;

        while(!s.equals("1")){
            int numOfOne = 0;
            cycle++;

            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    numOfZero++;
                }else{
                    numOfOne++;
                }
            }
            s = Integer.toBinaryString(numOfOne);

        }

        int[] answer = {cycle, numOfZero};
        return answer;
    }
}
