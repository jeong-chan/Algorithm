import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int map[][];
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0,0);
    }

    public static void sudoku(int row, int col){

        // 해당 행이 다 채워졌을 경우 다음 행의 첫 번째 열부터 시작
        if(col == 9){
            sudoku(row+1, 0);
            return;
        }

        // 행과 열이 모두 채워졌을 경우 출력 후 종료
        if(row == 9){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        // 만약 해당 위치의 값이 0 이면 1부터 9까지 중 가능한 수 탐색
        if(map[row][col] == 0){
            for (int i = 1; i <=9; i++) {
                if(check_sudo(row,col,i)){
                    map[row][col] = i;
                    sudoku(row, col+1);
                }
            }
            map[row][col] = 0;
            return;
        }
        sudoku(row, col+1);
    }

    public static boolean check_sudo(int row, int col, int value){

        // 같은 행에 원소들 중 겹치는 열 원소가 있는지 확인 한다.
        for (int i = 0; i < 9; i++) {
            if(map[row][i] == value){
                return false;
            }
        }

        //같은 열에 원소들 중 겹치는 행 원소가 있는지 확인한다.
        for (int i = 0; i < 9; i++) {
            if(map[i][col] == value){
                return false;
            }
        }

        //3x3 칸에 중복된 원소가 있는지 검사
        //3x3의 행, 열 첫 위치
        int first_row = (row/3)*3;
        int first_col = (col/3)*3;

        for (int i = first_row; i < first_row+3; i++) {
            for (int j = first_col; j < first_col+3; j++) {
                if(map[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }

}
