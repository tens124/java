package day14;

//정수 n이 주어질 때, n을 문자열로 변환하여 리턴
public class ReturnChangeString {

	public String solution(int n) {
        String answer = Integer.toString(n);
        
        //또다른 풀이
        //String answer = ""+n;
        //자바에선 문자열과 int를 합치면 자동으로 String이 됨
        
        return answer;
    }
}
