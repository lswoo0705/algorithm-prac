package programmers.programmers0.test_101to120;

public class Test_106_DiceGame1 {
    public int solution(int a, int b) {
        int answer = 0;

        if (a % 2 == 1 && b % 2 == 1) {
            answer = a * a + b * b;
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }

        return answer;
    }
}
