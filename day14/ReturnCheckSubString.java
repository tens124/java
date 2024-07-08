package day14;

//target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 리턴
public class ReturnCheckSubString {

	public int solution(String my_string, String target) {
        int answer = my_string.contains(target)?1:0;
        return answer;
    }
}
