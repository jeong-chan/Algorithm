public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        N = N-1;

        while(N>0){
            N -= (count*6);
            count++;
        }
        System.out.println(count);
    }


}
