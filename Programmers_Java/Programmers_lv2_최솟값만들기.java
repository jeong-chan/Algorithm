import java.util.Arrays;

public class Programmers_lv2_최솟값만들기 {
    public int solution(int []A, int []B)
    {
        int answer1 = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<A.length; i++){
            answer1 += A[i]*B[A.length-1-i];
        }


        return answer1;
    }
}
