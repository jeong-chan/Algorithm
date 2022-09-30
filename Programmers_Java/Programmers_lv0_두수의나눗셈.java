public class Programmers_lv0_두수의나눗셈 {
    public int solution(int num1, int num2) {
        double tmp = (double) num1/num2*1000;
        return (int) Math.floor(tmp);
    }
}
