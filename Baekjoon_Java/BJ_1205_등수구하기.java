import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Person implements Comparable<Person>{
        long grade;
        String name;

        public Person(long grade, String name) {
            this.grade = grade;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            return (int)(o.grade-this.grade);
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        if(N == 0){
            System.out.println(1);
            return;
        }
        long newgrade = Long.parseLong(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        Person tasu = new Person(newgrade, "tasu");

        ArrayList<Person> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(new Person(Long.parseLong(st.nextToken()),"input"));
        }
        list.add(tasu);

        Collections.sort(list);

        for (int i = 0; i < P; i++) {
            if(!list.get(i).name.equals("tasu")){
                continue;
            }else{
                int index = i;
                for (int j = 0; j <= index; j++) {
                    if(list.get(j).grade == newgrade){
                        System.out.println(j+1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
        return;
    }

}
