public class Main {

    public static class Person implements Comparable<Person>{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {

                return this.age-o.age;

        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input_age = Integer.parseInt(st.nextToken());
            String input_name = st.nextToken();
            list.add(new Person(input_age,input_name));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            sb.append(p.age).append(" ").append(p.name).append("\n");
        }

        System.out.println(sb);
    }
}


