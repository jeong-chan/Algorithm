import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] stu = new boolean[31];
        for (int i = 0; i < 28; i++) {
            stu[Integer.parseInt(br.readLine())] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if(!stu[i]){
                System.out.println(i);
            }
        }
    }

}
