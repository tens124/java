package day17;

import java.math.BigInteger;

//0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 리턴
public class ReturnTwoStringSum {

	public static String solution(String a, String b) {
//        Long temp = Long.parseLong(a)+Long.parseLong(b);
//		  문자열은 long형의 저장범위를 초과한 숫자를 공급할 수도 있다
//		  따라서 크기 표현에 제한이 없는 BigInteger 사용
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        
        //answer += A.add(B);
        //단순히 이 코드를 사용해도 됨
        
        BigInteger temp = A.add(B);
//      BigInteger 자료형은 산술연산자 사용 불가. 메소드를 통해 계산
        String answer = String.valueOf(temp);
        return answer;
    }
	
	public static void main(String[] args) {
		solution("18446744073709551615", "287346502836570928366");
	}
}
