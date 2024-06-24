package day7;

//my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 리턴
public class ReturnReverseString {
	public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] string = my_string.toCharArray();
        
        while(s<e) {
        	char temp = string[s];
        	string[s++]=string[e];
        	string[e--]=temp;
        }
        
        for(char str : string) {
        	answer += str;
        }
        
        return answer;
        
        
//        스트링빌더를 이용한 풀이법
//        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
//        my_string 문자열에서 s~e 부분까지만 추출한 후 answer에 저장
//        answer.reverse();
//        추출한 문자열을 reverse메소드를 통해 뒤집어버림
//        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
//        마지막으로 my_string의 0~s-1부분과 answer, my_string의 e+1 앞부분을 전부 자른 문자열을 합쳐줌
    }

}
