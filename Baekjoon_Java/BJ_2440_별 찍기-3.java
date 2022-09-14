public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = count; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
