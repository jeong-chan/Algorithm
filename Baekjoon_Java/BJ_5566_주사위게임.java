public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mapsize = Integer.parseInt(st.nextToken());
        int dice = Integer.parseInt(st.nextToken());

        //맵입력
        int[] map = new int[mapsize];
        for (int i = 0; i < mapsize; i++) {
            map[i] = Integer.parseInt(br.readLine());
        }

        //현재위치를 담는 now변수
        int now = 0;
        
        //주사위를 굴린 횟수만큼 반복
        for (int i = 1; i <=dice ; i++) {
            int command = Integer.parseInt(br.readLine());

            //주사위에 나온 수 만큼 이동
            now += command;

            //도착하거나 도착지를 넘어가면 종료
            if(now>=mapsize-1){
                System.out.println(i);
                return;
            }

            //그렇지 않은경우 맵에 적힌 만큼 한 번 더 이동
            now += map[now];

            //도착하거나 도착지를 넘어가면 종료
            if(now>=mapsize-1){
                System.out.println(i);
                return;
            }

        }

    }


}


