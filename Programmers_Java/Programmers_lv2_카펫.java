import java.util.*;

public class Programmers_lv2_카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 3; i < sum; i++) {
            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);

                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        Queue<String> list1 = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<String> l = new ArrayList<>();
        return answer;
    }
}
