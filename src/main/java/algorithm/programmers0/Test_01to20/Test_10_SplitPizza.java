package algorithm.programmers0.Test_01to20;

public class Test_10_SplitPizza {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n % slice != 0) {
            answer += n / slice + 1;
        } else {
            answer += n / slice;
        }
        return answer;
    }
}
