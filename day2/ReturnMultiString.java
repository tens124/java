package day2;

//문자열과 정수 k가 주어지면 문자열을 k번 반복해서 리턴
public class ReturnMultiString {
	public String solution(String my_string, int k) {
		String answer = "";
		
		for(int i = 0;i<k;i++)
			answer += my_string;
		
		//repeat 메소드를 이용하는 것도 가능
		//return my_string.repeat(k);
		//알아서 k번 반복 후 저장
		return answer;
	}
}
