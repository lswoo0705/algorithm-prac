package programmers.programmers0.test_81to100;

public class Test_86_Suffix {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(i).equals(is_suffix)) {
                return 1;
            }
        }
        return answer;
    }
}
