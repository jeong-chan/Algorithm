class Programmers_lv0_k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int n = i; n<=j; n++){

            String str = n+"";
            for(int l = 0; l<str.length(); l++){
                if(str.charAt(l)-'0'==k) answer++;
            }

        }

        return answer;
    }
}