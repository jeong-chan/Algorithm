import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[] numbers = new int[100001];
        for (int i = 0; i < number; i++) {
            int a = Integer.parseInt(br.readLine());
            numbers[a]++;
        }
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
