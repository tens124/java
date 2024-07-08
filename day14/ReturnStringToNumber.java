package day14;

//숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 리턴
public class ReturnStringToNumber {

	public int solution(String n_str) {
		
		//또 다른 풀이법
		//각 자리를 char로 변환 후, char값을 int로 변환, 
		//그 후 자릿수가 커질 때마다 10을 곱해가며 더해줌
		//for(int i=0; i<n_str.length(); i++){
        //answer = answer * 10;
		//for연산은 문자열의 앞부분부터 진행되기에 answer *= 10을 해주는 것
        //answer += n_str.charAt(i)-48;
		//예시 : 문자열 123
		//첫 번째 루프 : 0*10 + 1 = 1
		//두 번째 루프 : 1*10 + 2 = 12
		//두 번째 루프 : 12*10 + 3 = 123
		//}
		
        return Integer.parseInt(n_str);
    }
}
