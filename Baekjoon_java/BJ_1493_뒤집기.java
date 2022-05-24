public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        Stack<Integer> stack = new Stack<>();
        //데이터 입력
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            //입력값이 이전에 스택에 넣은 수와 다른 숫자인 경우에만 넣음
            if(stack.isEmpty() || !stack.peek().equals(Integer.parseInt(str))){
                stack.push(Integer.parseInt(str));
            }
        }
        
        //스택의 크기가 1이면 전부 똑같은 수 이므로 0출력
        if(stack.size()==1){
            System.out.println(0);
        }
        //그렇지 않으면, 0과 1중 적은 수의 갯수 출력
        else {

            int num_one = 0;
            int num_zero = 0;
            while (!stack.isEmpty()) {
                if (stack.pop() == 1) {
                    num_one++;
                } else {
                    num_zero++;
                }
            }
            System.out.println(Math.min(num_one,num_zero));
        }
    }
}


