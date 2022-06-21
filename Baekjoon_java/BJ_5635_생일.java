import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Person implements Comparable<Person>{

        int year, month, day;
        String name;

        public Person(int year, int month, int day, String name) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            if(this.year == o.year){
                if(this.month == o.month){
                    return this.day-o.day;
                }
                return this.month-o.month;
            }
            return this.year-o.year;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Person> person_list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            person_list.add(new Person(year, month, day, name));
        }

        Collections.sort(person_list);

        System.out.println(person_list.get(num-1).name);
        System.out.println(person_list.get(0).name);
        
    }

}
