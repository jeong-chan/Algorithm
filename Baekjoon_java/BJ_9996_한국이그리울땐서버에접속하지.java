public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //테스트 문자 개수
        int N = Integer.parseInt(br.readLine());
        //패턴
        String[] pattern = br.readLine().split("");
        // '*'위치 기준으로 왼쪽패턴 오른쪽패턴으로 나눔
        int star_pos = 0;
        for (int i = 0; i < pattern.length; i++) {
            if(pattern[i].equals("*")){
                star_pos = i;
            }
        }
        //왼쪽 패턴
        String left_pattern = "";
        for (int i = 0; i < star_pos; i++) {
            left_pattern += pattern[i];
        }
        //오른쪽 패턴
        String right_pattern = "";
        for (int i = star_pos+1; i < pattern.length; i++) {
            right_pattern += pattern[i];
        }

        //테스트 문자 입력 및 확인
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            //패턴 둘 중 하나라도 없으면 NE
            if(!str.contains(left_pattern) || !str.contains(right_pattern) ){
                sb.append("NE").append("\n");
                continue;
            }

            //문자열이 왼쪽 패턴에 적합하면 '*'로 치환
            //문자열이 오른쪽 패턴에 적합하면 '#'으로 치환
            str = str.replace(left_pattern,"*");
            str = str.replace(right_pattern,"#");
            
            //문자열의 첫번째 문자가 *이고, 마지막 #의 위치가 문자열의 마지막이면 DA
            if(str.charAt(0) == '*' && str.lastIndexOf('#')==str.length()-1){
                sb.append("DA").append("\n");
                continue;
            }
            //아니면 NE
            else{
                sb.append("NE").append("\n");
                continue;
            }

        }

        System.out.println(sb);
    }
}
