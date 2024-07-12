package day16;

//문자열 binomial은 "a op b" 형태의 이항식
//a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나
//주어진 식을 계산한 결과를 리턴
public class ReturnCalcurateString {

	public int solution(String binomial) {
//        int answer = Integer.parseInt(binomial);
//		  작동 x. 연산기호는 숫자가 아니기에 예외 발생
		int answer = 0;

		String[] cal = binomial.split(" ");
		int a = Integer.parseInt(cal[0]);
		int b = Integer.parseInt(cal[2]);
		String op = cal[1];

		switch (op) {
		case ("+"):
			answer = a + b;
			break;
		case ("-"):
			answer = a - b;
			break;
		case ("*"):
			answer = a * b;
			break;
		}
		return answer;
	}
}
