package day14;

//n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 리턴
public class ReturnExceptZero {
	public String solution(String n_str) {
        String answer = "";
        
        int temp = Integer.parseInt(n_str);
        answer = Integer.toString(temp);
        //int형은 정수를 기록함. 즉, 앞부분의 무의미한 0을 자동으로 제거
        
        //return ""+Integer.parseInt(n_str);
        //int형에 문자열을 붙이면 자동으로 String이 되는 것을 이용하는 것도 가능
        
        return answer;
    }

}
