public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] number = br.readLine().split("");
        int a = Integer.parseInt(br.readLine());

        number[number.length-1] = "0";
        number[number.length-2] = "0";

        String tmp = "";
        for (int i = 0; i < number.length; i++) {
            tmp += number[i];
        }

        long b = Long.parseLong(tmp);

        int c = (int) (b%a);
        if(c==0){
            String[] ans = String.valueOf(b).split("");
            String answer = "";
            answer += ans[ans.length-2];
            answer += ans[ans.length-1];

            System.out.println(answer);
        }else{

            b = b + (a-c);

            String[] ans = String.valueOf(b).split("");
            String answer = "";
            answer += ans[ans.length-2];
            answer += ans[ans.length-1];

            System.out.println(answer);
        }


    }
}


