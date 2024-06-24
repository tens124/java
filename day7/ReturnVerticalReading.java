package day7;

//문자열 my_string과 두 정수 m, c
//my_string을 한 줄에 m 글자씩 가로로 적었을 때 
//왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 리턴

//예시
//my_string : "ihrhbakrfpndopljhygc" m : 4	c : 2	
//answer : "happy"
//ihrh
//bakr
//fpnd
//oplj
//hygc
//이 중 두 번째 열에 적힌 글자를 순서대로 읽으면 happy라는 문자가 완성됨
public class ReturnVerticalReading {

	public String solution(String my_string, int m, int c) {
        String temp = "";
        String answer = "";
        
        //우선 문자열을 m글자씩 끊어내야 함. 
        int i = 0;
        while(i<my_string.length()) {
        	temp = my_string.substring(i, i+m);
        	//문자열을 m글자씩 나눈 후 temp에 저장
        	answer += temp.toCharArray()[c-1];
        	//temp에 저장된 문자열을 배열로 변환 후, c-1 인덱스의 값을 answer에 적립
        	i+=m;
        	//증감자로 m을 사용. i~i+m-1,i+m~i+m+m-1,...의 순서대로 자를 수 있게 됨
        }
        
//        for문으로도 처리 가능
//        for (int i = c - 1; i < my_string.length(); i += m) {
//        이 경우에는 시작점을 c-1로 선택하여, 애초에 c번째 자리에 있는 문자만을 추출해냄
//            answer += my_string.charAt(i);
//        charAt(i) 메소드는 문자열에서 i번째에 위치하는 한 글자만을 추출. 이를 answer에 적립
//        }
        return answer;
    }
	
}
