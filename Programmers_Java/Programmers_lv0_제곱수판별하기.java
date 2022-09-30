public class Programmers_lv0_제곱수판별하기 {
        public int solution(int n) {
            int m = (int) Math.sqrt(n);
            return n == m * m ? 1 : 2;
        }
}
