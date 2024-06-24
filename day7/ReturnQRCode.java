package day7;

//code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 
//앞에서부터 순서대로 이어 붙인 문자열을 리턴

//예시
//q : 3	r : 1	code : "qjnwezgrpirldywt"	
//결과 : "jerry"
//3으로 나누었을 때 나머지가 1인 숫자 : 1,4,7,10,13,...
public class ReturnQRCode {

	public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = r;i<code.length();i+=q) {
        	answer+=code.charAt(i);
        	//x를 q로 나눈 나머지를 이용한다 해서 x를 구할 필요는 없음
        	//첫 수는 반드시 나머지인 r이 될 것이고, 그 후부터는 q를 더해가면 됨
        }
        
        //0부터 시작해 i++ 증감자를 이용하는 for문 사용
        // if(i % q == r){
        //answer += code.charAt(i);
    	//}
        
        
        
        
        return answer;
    }
}
