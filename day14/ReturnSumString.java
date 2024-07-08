package day14;

//한 자리 정수로 이루어진 문자열 num_str. 각 자리수의 합을 리턴
public class ReturnSumString {
	public int solution(String num_str) {
        int answer = 0;
        
        for(int i = 0;i<num_str.length();i++) {
        	String temp = Character.toString(num_str.charAt(i));
        	answer += Integer.parseInt(temp);
        }
        return answer;
        
        //스트림을 이용한 풀이
        //return numStr
        //.chars()	구성요소를 모두 char형으로 변환
        //.map(c -> c - 48)	//char와 int 연산시 아스키코드 사용
        //아스키코드에서 0은 48이기에 48을 빼주는 것
        //.sum();	스트림 내부의 모든 요소를 더해줌
    }

}
