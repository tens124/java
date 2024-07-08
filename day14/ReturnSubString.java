package day14;

//str1이 str2의 부분 문자열이라면 1을 부분 문자열이 아니라면 0을 리턴
public class ReturnSubString {

	public int solution(String str1, String str2) {
        int answer = str2.contains(str1)?1:0;
        return answer;
    }
}
