package day4;

//정수 배열 numLog. 
//numLog[0]부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 거치게 됨
//w : +1, s : -1, d : +10, a : -10
//이러한 조작의 결과값을 기록한 정수배열이 numLog 배열
//numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장
//주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 리턴

//예시
//[0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]	
//"wsdawsdassw"
//numLog의 크기는 12. numLog[0]은 0. 11개의 문자를 거친 값이 각 인덱스에 저장됨 
//따라서 배열을 보고 어떤 문자열이 사용됐는지를 파악하면 된다

public class ReturnControlNumber2 {
	
	 public String solution(int[] numLog) {
	        String answer = "";
	        
	        for(int i = 1;i<numLog.length;i++) {
	        	//numLog[i]-numLog[i-1]를 j로 설정해도 됨
	        	switch(numLog[i]-numLog[i-1]) {
	        	case(1):answer+="w";break;
	        	case(-1):answer+="s";break;
	        	case(10):answer+="d";break;
	        	case(-10):answer+="a";break;
	        	default:break;
	        	}
	        }
	        return answer;
	    }
}
