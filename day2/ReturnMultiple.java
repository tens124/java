package day2;

//num이 n의 배수이면 1을, 아니면 0을 리턴
public class ReturnMultiple {

	public int solution(int num, int n) {
        int answer = 0;
        
        if(num%n == 0) 
        	answer = 1;
        
        return answer;
    }
}
