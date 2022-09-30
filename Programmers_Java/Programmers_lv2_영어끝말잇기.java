import java.util.ArrayList;

public class Programmers_lv2_영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int number = 0;
        int cycle = 0;
        int[] answer = new int[2];
        ArrayList<String> beforeWords = new ArrayList<>();
        beforeWords.add(words[0]);

        for(int i=1; i<words.length; i++){
            String word = words[i];
            String lastWord = beforeWords.get(beforeWords.size()-1);

            if(!beforeWords.contains(word) && lastWord.charAt(lastWord.length()-1) == word.charAt(0)){
                beforeWords.add(word);
            }else{
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}
