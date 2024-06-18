package day2;

//두 수의 크기를 기호 대신 문자를 통해 비교
//ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나. 이때 !는 없는 것으로 인식. > 혹은 <
//n과 m이 주어진 ineq와 eq의 조건에 맞으면 1을, 틀리면 0을 리턴
public class ReturnCompareByString {
	
	int answer = 0;

	public int solution(String ineq, String eq, int n, int m) {
		
		//네 가지 경우의 수가 존재
		//>=/<=/>!/<!
		//느낌표의 경우는 없는 것으로 인식. 즉 > 혹은 <을 의미
		//음...ineq 값에 따라 다른 시나리오를 쓸까?
		
        return ineq.equals(">")?left(ineq,eq,n,m):right(ineq,eq,n,m);
    }
	
	int left(String ineq, String eq, int n, int m) {
		
		lEqual(eq,n,m);
		
        return answer;
	}
	
	int right(String ineq, String eq, int n, int m) {
		
		rEqual(eq,n,m);
		
        return answer;
	}
	
	int lEqual(String eq, int n, int m) {
		if(eq.equals("=")) {
			answer = n>=m?1:0;
		}else {
			answer = n>m?1:0;
		}
		return answer;
	}
	
	
	int rEqual(String eq, int n, int m) {
		if(eq.equals("=")) {
			answer = n<=m?1:0;
		}else {
			answer = n<m?1:0;
		}
		return answer;
	}
	
}

//다른 답안을 참고해보자! 스위치문을 사용한 경우

//class Solution {
//    public int solution(String ineq, String eq, int n, int m) {
//        boolean answer = false;
//
//        switch(eq) {		//eq가 어떤 기호인지에 따라 달라지도록 설정
//            case "!": 	//eq가 !일 경우
//                switch(ineq) {	//2중 스위치문. ineq가 어떤 기호인가?
//                    case "<":		//ineq가 <일 경우
//                        answer = n < m;	//수식 결과에 따라 참/거짓 판별
//                        break;			//그 후 정지
//                    case ">":		//ineq가 >일 경우
//                        answer = n > m;	//수식 결과에 따라 참/거짓 판별
//                        break;			//그 후 정지
//                }
//                break;		//eq가 !라면 여기서 정지
//            case "=":			//eq가 =라면 정지하지 않고 여기가 실행
//                switch(ineq) {	//2중 스위치문. ineq가 어떤 기호인가?
//                    case "<":		//ineq가 <일 경우
//                        answer = n <= m;	//수식 결과에 따라 참/거짓 판별
//                        break;			//그 후 정지
//                    case ">":		//ineq가 >일 경우		
//                        answer = n >= m;	//수식 결과에 따라 참/거짓 판별
//                        break;			//그 후 정지
//                }
//                break;		//eq가 =라면 여기서 정지
//        }
//
//        return answer?1:0;	//answer이 참/거짓인지에 따라 1 혹은 0 리턴
//    }
//}


//이중스위치 대신  ineq.concat(eq)을 이용하는 방법도.
//String.concat(문자열)은 기존의 문자열에 뒤의 문자열을 이어붙이는 메소드
//class Solution {
//public int solution(String ineq, String eq, int n, int m) {
//  boolean answer = false;
//
//  switch(ineq.concat(eq)) {		//어떤 기호인지에 따라 달라지도록 설정
//      case ">=": 	//기호가 >=일 경우
//		answer = n>=m;
//		break;	

//		case "<=": 	//기호가 <=일 경우
//		answer = n<=m;
//		break;

//		case ">!": 	//기호가 >!일 경우
//		answer = n>m;
//		break;

//		case "<!": 	//기호가 <!일 경우
//		answer = n<m;
//		break;
//		}
//  return answer?1:0;	//answer이 참/거짓인지에 따라 1 혹은 0 리턴
//}
//}




