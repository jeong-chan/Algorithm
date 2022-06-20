import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Word implements Comparable<Word>{
        int len;
        String word;

        public Word(int len, String word) {
            this.len = len;
            this.word = word;
        }

        @Override
        public int compareTo(Word o) {
            if(this.len == o.len){
                return this.word.compareTo(o.word);
            }
            return this.len - o.len;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        PriorityQueue<Word> pq = new PriorityQueue<>();
        for (int i = 0; i < num; i++) {
            String word = br.readLine();
            pq.offer(new Word(word.length(), word));
        }

        for (int i = 0; i <num ; i++) {
            Word tmp = pq.poll();
            if(!pq.isEmpty()) {
                if (tmp.word.equals(pq.peek().word)) {
                    continue;
                } else {
                    sb.append(tmp.word).append("\n");
                }
            }else{
                sb.append(tmp.word);
            }
        }

        System.out.println(sb);
    }

}
