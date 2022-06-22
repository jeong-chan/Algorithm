import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Position{
        char alpa;
        int count;

        public Position(char alpa, int count) {
            this.alpa = alpa;
            this.count = count;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] king = st.nextToken().split("");
        String[] stone = st.nextToken().split("");
        Position pos_king = new Position(king[0].charAt(0),Integer.parseInt(king[1]));
        Position pos_stone = new Position(stone[0].charAt(0),Integer.parseInt(stone[1]));
        int num = Integer.parseInt(st.nextToken());
        for (int i = 0; i < num; i++) {
            String command = br.readLine();

            if(command.equals("B")){
                if(pos_king.count>1){
                    pos_king.count--;
                    if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                        pos_stone.count--;
                        if(pos_stone.count < 1){
                            pos_stone.count++;
                            pos_king.count++;
                        }
                    }
                }
            }else if(command.equals("L")){
                if(pos_king.alpa > 'A'){
                    pos_king.alpa--;
                    if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                        pos_stone.alpa--;
                        if(pos_stone.alpa < 'A'){
                            pos_king.alpa++;
                            pos_stone.alpa++;
                        }
                    }

                }
            }else if(command.equals("R")){
                if(pos_king.alpa < 'H'){
                    pos_king.alpa++;
                    if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                        pos_stone.alpa++;
                        if (pos_stone.alpa > 'H') {
                            pos_king.alpa--;
                            pos_stone.alpa--;
                        }
                    }
                }

            }else if(command.equals("T")){
                if(pos_king.count <8){
                    pos_king.count++;
                    if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                        pos_stone.count++;
                        if(pos_stone.count >8){
                            pos_king.count--;
                            pos_stone.count--;
                        }
                    }
                }
            }else if(command.equals("LB")){
                if(pos_king.alpa > 'A' && pos_king.count >1){
                    pos_king.count--;
                    pos_king.alpa--;
                    if(pos_king.count<1){
                        pos_king.count++;
                        pos_king.alpa++;
                        continue;
                    }
                    if(pos_king.alpa<'A'){
                        pos_king.count++;
                        pos_king.alpa++;
                        continue;
                    }
                    if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                        pos_stone.count--;
                        pos_stone.alpa--;
                        if(pos_stone.count <1 || pos_stone.alpa < 'A'){
                            pos_king.count++;
                            pos_king.alpa++;
                            pos_stone.count++;
                            pos_stone.alpa++;
                        }
                    }
                }
            }else if(command.equals("RB")){
                pos_king.count--;
                pos_king.alpa++;
                if(pos_king.count<1){
                    pos_king.count++;
                    pos_king.alpa--;
                    continue;
                }
                if(pos_king.alpa>'H'){
                    pos_king.count++;
                    pos_king.alpa--;
                    continue;
                }
                if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                    pos_stone.count--;
                    pos_stone.alpa++;
                    if(pos_stone.count <1 || pos_stone.alpa > 'H'){
                        pos_king.count++;
                        pos_king.alpa--;
                        pos_stone.count++;
                        pos_stone.alpa--;
                    }
                }

            }else if(command.equals("LT")){
                pos_king.count++;
                pos_king.alpa--;
                if(pos_king.count>8){
                    pos_king.alpa++;
                    pos_king.count--;
                    continue;
                }
                if(pos_king.alpa < 'A'){
                    pos_king.alpa++;
                    pos_king.count--;
                    continue;
                }
                if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                    pos_stone.count++;
                    pos_stone.alpa--;
                    if(pos_stone.count >8 || pos_stone.alpa < 'A'){
                        pos_king.count--;
                        pos_king.alpa++;
                        pos_stone.count--;
                        pos_stone.alpa++;
                    }
                }

            }else if(command.equals("RT")){
                pos_king.count++;
                pos_king.alpa++;
                if(pos_king.count>8){
                    pos_king.alpa--;
                    pos_king.count--;
                    continue;
                }
                if(pos_king.alpa > 'H'){
                    pos_king.alpa--;
                    pos_king.count--;
                    continue;
                }
                if(pos_king.count == pos_stone.count && pos_king.alpa == pos_stone.alpa){
                    pos_stone.count++;
                    pos_stone.alpa++;
                    if(pos_stone.count >8 || pos_stone.alpa > 'H'){
                        pos_king.count--;
                        pos_king.alpa--;
                        pos_stone.count--;
                        pos_stone.alpa--;
                    }
                }
            }
        }
        System.out.println(String.valueOf(pos_king.alpa)+pos_king.count);
        System.out.println(String.valueOf(pos_stone.alpa)+pos_stone.count);
    }

}
