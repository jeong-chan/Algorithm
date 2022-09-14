public class Main {

    //입력받은 문자와 문자의 길이를 담고있는 Word객체
    //Word객체는 비교시, len(문자의 길이)가 긴 순에서 짧은 순으로 정렬됨
    public static class Word implements Comparable<Word>{
        String value;
        int len;

        public Word(String value, int len) {
            this.value = value;
            this.len = len;
        }

        @Override
        public int compareTo(Word o){
            return o.len-this.len;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력받은 문자들을 저장하고 문자의 길이 순으로 정렬할 List
        ArrayList<Word> wordlist = new ArrayList<>();
        //접두어의 부분집합이 될 List
        ArrayList<String> ansList = new ArrayList<>();
        //입력받을 문자의 갯수
        int N = Integer.parseInt(br.readLine());

        //문자를 입력받고, wordList에 추가
        for (int i = 0; i < N; i++) {
            String tmp_word = br.readLine();
            wordlist.add(new Word(tmp_word,tmp_word.length()));
        }

        //wordList 정렬
        Collections.sort(wordlist);

        //입력받은 문자중에서 길이가 가장 긴 것을 부분집합 리스트에 추가
        //문자가 길 수록 다른 문자의 접두어가 될 확률이 낮기 때문
        ansList.add(wordlist.get(0).value);
        
        //첫번째 문자는 이미 들어갔으니 인덱스 1부터 시작
        for (int i = 1; i < wordlist.size(); i++) {
            //부분집합에 접두어로 포함되는 단어가 있는지 나타내는 boolean 변수
            boolean ishave = true;
            //입력받은 문자 중에서 접두어가 되는지 확인할 문자
            String compareA = wordlist.get(i).value;
            
            //ansList(접두어 부분집합)만큼 반복
            for (int j = 0; j < ansList.size(); j++) {
                //접두어 부분집합에서 문자를 하나씩 꺼냄
                String compareB = ansList.get(j);
                //접두어 부분집합에서 꺼낸 문자와 입력받은 문자가 접두어 관계인지 확인
                //접두어가 아닌경우
                if(!find(compareB, compareA)){
                    //false 처리
                    ishave = false;
                }
                //접두어인 경우
                else{
                    //true 처리
                    ishave = true;
                    //이미 하나의 단어와 접두어 관계이므로 입력받은 다른 부분집합 원소와 비교 불필요
                    //다른 단어로 대체하기 위해 break
                    break;
                }
            }
            //접두어가 아닌경우
            if(!ishave){
                //부분집합에 추가
                ansList.add(compareA);
            }
        }

        //부분집합의 크기 출력
        System.out.println(ansList.size());
    }

    public static boolean find(String a, String b){
        //접두어인지 확인하기 위해 한 글자씩 나눠서 배열로 만듦
        String[] a_arr = a.split("");
        String[] b_arr = b.split("");

        //접두어인지 체크하는 변수
        boolean check = true;
        //둘 중 더 짧은 배열의 크기만큼 반복
        for (int i = 0; i < Math.min(a_arr.length, b_arr.length); i++) {
            //각 문자열을 담는 변수
            String a_detail = a_arr[i];
            String b_detail = b_arr[i];
            //문자가 같다면
            if(a_detail.equals(b_detail)){
                //다음 인덱스의 문자 확인
                continue;
            }
            //문자가 다르다면
            else{
                //다른 단어임을 체크(false 처리)
                check = false;
                //이어지는 문자열 확인 종료
                break;
            }
        }

        //변수 값 return
        return check;
    }
}
