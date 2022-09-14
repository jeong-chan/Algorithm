import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        for (int i = 0; i < cycle; i++) {
            int car = Integer.parseInt(br.readLine());

            int num_of_option = Integer.parseInt(br.readLine());
            for (int j = 0; j < num_of_option; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                int price = Integer.parseInt(st.nextToken());

                car += num*price;
            }

            System.out.println(car);

        }
    }
}
