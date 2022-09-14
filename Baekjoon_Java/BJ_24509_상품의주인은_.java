import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Student implements Comparable<Student>{

        int number, score;

        public Student(int number, int score) {
            this.number = number;
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {

            if(this.score == o.score){
                return this.number-o.number;
            }
            return o.score-this.score;
        }
    }
    static boolean[] visit;
    static int num;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        num = Integer.parseInt(br.readLine());
        visit = new boolean[num+1];
        ArrayList<Student> korea = new ArrayList<>();
        ArrayList<Student> english = new ArrayList<>();
        ArrayList<Student> math = new ArrayList<>();
        ArrayList<Student> science = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());

            korea.add(new Student(student, Integer.parseInt(st.nextToken())));
            english.add(new Student(student, Integer.parseInt(st.nextToken())));
            math.add(new Student(student, Integer.parseInt(st.nextToken())));
            science.add(new Student(student, Integer.parseInt(st.nextToken())));
        }
        Collections.sort(korea);
        Collections.sort(english);
        Collections.sort(math);
        Collections.sort(science);

        int king_korea = korea.get(0).number;
        visit[king_korea] = true;
        int king_english = check(english);
        int king_math = check(math);
        int king_science = check(science);
        sb.append(king_korea).append(" ").append(king_english).append(" ").append(king_math).append(" ").append(king_science).append(" ");
        System.out.println(sb);
    }

    public static int check(ArrayList<Student> list){
        int count = 0;
        while(true){
            if(visit[list.get(count).number]){
                count++;
                continue;
            }else{
                visit[list.get(count).number] = true;
                return list.get(count).number;
            }
        }
    }
}
