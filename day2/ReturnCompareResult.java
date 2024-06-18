package day2;

public class ReturnCompareResult {
//두 정수를 붙여 쓴 값을 반환하는 부호 ⊕
//a ⊕ b와 2 * a * b 중 더 큰 값을 리턴
	public int solution(int a, int b) {
        int answer = 0;
        
        int A = Integer.parseInt(""+a+b);
        int B = 2*a*b;
        
        answer = A>B?A:B;
        //삼항연산자 사용. 조건식이 참이면 A를,거짓이면 B를 반환
        
        return answer;
        //max메소드를 통해 한 줄로 처리도 가능
        //return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
        //String.valueOf를 통해 a와 b를 문자열로 변환한 후 이어붙임
        //그 후 parseInt메소드를 통해 결과값을 int형으로 변환 
        //Math.max 메소드를 통해 해당값과 2*a*b를 비교 후 더 큰 값을 리턴
	}
}
