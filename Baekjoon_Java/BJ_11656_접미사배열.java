import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String word = br.readLine();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            String str = word.substring(i,n);
            list.add(str);
        }
        Collections.sort(list);
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }

    }
}
