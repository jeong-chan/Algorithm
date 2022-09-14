import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int count = 0;
            String[] sentence = br.readLine().split("");

            if(sentence[0].equals("#")){
                break;
            }

            for (int i = 0; i < sentence.length; i++) {
                if(sentence[i].equals("a") || sentence[i].equals("e") || sentence[i].equals("i") || sentence[i].equals("o") || sentence[i].equals("u") ||
                sentence[i].equals("A") ||sentence[i].equals("E") ||sentence[i].equals("I") ||sentence[i].equals("O") ||sentence[i].equals("U")){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

}
