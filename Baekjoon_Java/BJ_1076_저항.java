import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans = 0;
        for (int i = 0; i < 3; i++) {
            String color = br.readLine();
            if( i != 2 ){
                if(color.equals("black")){
                    ans += 0;
                }else if(color.equals("brown")){
                    ans += 1;
                }else if(color.equals("red")){
                    ans += 2;
                }else if(color.equals("orange")){
                    ans += 3;
                }else if(color.equals("yellow")){
                    ans += 4;
                }else if(color.equals("green")){
                    ans += 5;
                }else if(color.equals("blue")){
                    ans += 6;
                }else if(color.equals("violet")){
                    ans += 7;
                }else if(color.equals("grey")){
                    ans += 8;
                }else if(color.equals("white")){
                    ans += 9;
                }
                if( i == 0){
                    ans *= 10;
                }
            }else {
                if(color.equals("black")){
                    ans *= 1;
                }else if(color.equals("brown")){
                    ans *= 10;
                }else if(color.equals("red")){
                    ans *= 100;
                }else if(color.equals("orange")){
                    ans *= 1000;
                }else if(color.equals("yellow")){
                    ans *= 10000;
                }else if(color.equals("green")){
                    ans *= 100000;
                }else if(color.equals("blue")){
                    ans *= 1000000;
                }else if(color.equals("violet")){
                    ans *= 10000000;
                }else if(color.equals("grey")){
                    ans *= 100000000;
                }else if(color.equals("white")){
                    ans *= 1000000000;
                }
            }
        }

        System.out.println(ans);
    }

}
