public class Programmers_lv2_다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        String nBinary = Integer.toBinaryString(n);

        int nNumOfOne = 0;
        for(int i=0; i<nBinary.length(); i++){
            if(nBinary.charAt(i) == '1'){
                nNumOfOne++;
            }
        }

        for(int i=n+1; i<1000001; i++){
            String nextBinary = Integer.toBinaryString(i);
            int nextNumOfOne = 0;
            for(int j=0; j<nextBinary.length(); j++){
                if(nextBinary.charAt(j) == '1'){
                    nextNumOfOne++;
                }
            }
            if(nextNumOfOne == nNumOfOne){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
