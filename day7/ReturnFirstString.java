package day7;

//my_string의 앞의 n글자로 이루어진 문자열을 리턴
public class ReturnFirstString {
	public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }

}
