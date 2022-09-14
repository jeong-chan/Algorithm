public class Main {

    static char[][] map;
    static char[][] map_b= {
            {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'}
    };
    static char[][] map_w= {
            {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'}
    };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        char[][] selectedmap = new char[8][8];

        for (int i = 0; i < N; i++) {
            char[] line = br.readLine().toCharArray();
            map[i] = line;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(i+8<=N && j+8<=M){
                    selectedmap = selectmap(j,i);
                    min = Math.min(min,mapcheckB(selectedmap));
                    min = Math.min(min,mapcheckW(selectedmap));
                }
            }
        }

        System.out.println(min);
    }

    public static int mapcheckB(char[][] tmpmap){
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(tmpmap[i][j] != map_b[i][j]){
                    count++;
                }
            }
        }

        return count;
    }

    public static int mapcheckW(char[][] tmpmap){
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(tmpmap[i][j] != map_w[i][j]){
                    count++;
                }
            }
        }

        return count;
    }


    public static char[][] selectmap(int startx, int starty){
        char[][] selectedmap = new char[8][8];
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
                selectedmap[i][j] = map[starty+i][startx+j];
            }
        }
        return selectedmap;
    }
}




