package day6;

//음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같다
//음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 리턴
public class ReturnNineRemainder {

	public int solution(String number) {
		int answer = 0;
		// 우선 문자열 number를 배열로 변환
		char[] newNumber = number.toCharArray();
		// 배열 내부의 모든 요소를 다 더한 후 9로 나눈 나머지 계산
		for (char num : newNumber) {
			//wrapper 클래스 중 char형에 대응되는 Character를 사용
			answer += Character.getNumericValue(num);
			// 산술연산자는 피연산자들이 byte, short, char 자료형일 경우
			// 모두 int자료형으로 변환 후 연산
			// 다만 이 경우 char에 입력된 값은 int로 변환 시 아스키코드 적용
			// char 1은 int 49 이런 식
			// answer+=num을 적용시키면 123 입력 시 49+50+51로 변환됨
			// 피연산자들이 모두 정수 자료형이고 long 자료형이 포함돼있을 경우
			// 모두 long 자료형으로 변환 후 연산
			// 피연산자 중 실수 자료형이 있을 경우
			// 허용 범위가 큰 실수 자료형으로 변환 후 연산
		}

		return answer % 9;
	}

	
}
