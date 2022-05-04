
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String firstToken = st.nextToken();
        while(st.hasMoreTokens()){
            Stack<String> stack = new Stack<>();

            sb.append(firstToken);

            String[] val = st.nextToken().split("");
            for (int i = 0; i <val.length; i++) {
                stack.push(val[i]);
            }
            while(!stack.isEmpty()){
                String chr = stack.peek();
                if(chr.equals(",")){
                    stack.pop();
                    continue;
                }else if(chr.equals("&")){
                    sb.append(chr);
                    stack.pop();
                    continue;
                }else if(chr.equals("]")){
                    stack.pop();
                    sb.append(stack.pop());
                    sb.append(chr);
                    continue;
                }else if(chr.equals("*")) {
                    sb.append(chr);
                    stack.pop();
                }else if(chr.equals(";")){
                    stack.pop();
                    continue;
                }else{

                    sb.append(" ");
                    String tmp="";
                    while (!stack.isEmpty()){
                        tmp += stack.peek();
                        stack.pop();
                    }
                    String ttmp="";
                    String[] tmps = tmp.split("");
                    for (int i = tmps.length-1; i >= 0; i--) {
                        ttmp += tmps[i];
                    }
                    sb.append(ttmp);
                    break;
                }
            }
            sb.append(";").append("\n");

        }

        System.out.println(sb);
    }
}
