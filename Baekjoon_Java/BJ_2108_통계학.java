public class Main {

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        double sum = 0;
        int avg = 0;
        int middle = 0;
        int mod= 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            min = Math.min(arr[i],min);
            max = Math.max(arr[i],max);
            sum += (double) arr[i];
        }
        int range = 0;
        if(max>=0 && min >=0){
            range = max-min;
        }else if(max>=0 && min <0){
            range = max-min;
        }else if(max<0 && min <0){
            range = Math.abs(min)+max;
        }
        for (int num : arr) {
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        int numbers = 0;
        for(int key : hashMap.values()) {
            numbers = Math.max(numbers, key);
        }
        for (int key : hashMap.keySet()) {
            if(hashMap.get(key) == numbers){
                list.add(key);
            }
        }

        Collections.sort(list);
        if(list.size()>=2){
            mod = list.get(1);
        }else{
            mod = list.get(0);
        }
        double tmp = sum/N;
        avg = (int) Math.round(tmp);
        middle = arr[N/2];

        sb.append(avg).append("\n");
        sb.append(middle).append("\n");
        sb.append(mod).append("\n");
        sb.append(range).append("\n");
        System.out.println(sb);
    }

}
