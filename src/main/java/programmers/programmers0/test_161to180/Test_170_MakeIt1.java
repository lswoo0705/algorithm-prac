package programmers.programmers0.test_161to180;

public class Test_170_MakeIt1 {
    public int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                if (num_list[i] % 2 == 0) {
                    num_list[i] = num_list[i] / 2;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                }
                answer++;
            }
        }

        return answer;
    }
}