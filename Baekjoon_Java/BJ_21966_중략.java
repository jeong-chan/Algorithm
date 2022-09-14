public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Slen = Integer.parseInt(br.readLine());
        String S = br.readLine();

        if(Slen<=25){
            System.out.println(S);
        }else {
            String[] S_split = S.split("");
            boolean flag = false;

            for (int i = 11; i < Slen-11; i++) {
                if(i!=Slen-11-1){
                    if(S_split[i].equals(".")) {
                        flag = true;
                        break;
                    }
                }else{
                    flag = false;
                }
            }

            if(!flag){

                for (int i = 0; i < 11; i++) {
                    sb.append(S_split[i]);
                }
                sb.append("...");
                for (int i = S_split.length-11; i < S_split.length; i++) {
                    sb.append(S_split[i]);
                }

            }else{

                for (int i = 0; i < 9; i++) {
                    sb.append(S_split[i]);
                }
                sb.append("......");
                for (int i = S_split.length-10; i <S_split.length; i++) {
                    sb.append(S_split[i]);
                }

            }

            System.out.println(sb);
        }

    }
}


