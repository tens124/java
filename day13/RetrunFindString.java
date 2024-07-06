package day13;

//알파벳으로 이루어진 문자열 myString과 pat
//myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 리턴
//단, 알파벳 대문자와 소문자는 구분하지 않는다
public class RetrunFindString {
	public int solution(String myString, String pat) {
        int answer = 0;
        
        answer = myString.toUpperCase().contains(pat.toUpperCase())?1:0;
        
//       if (myString.toUpperCase().indexOf(pat.toUpperCase()) != -1) {
//       indexOf(문자열)메소드는 가장 먼저 등장하는 해당 문자열을 찾는 메소드
//       해당 문자열이 존재하지 않는다면 -1을 리턴. 존재한다면 그 위치를 리턴
//        return 1;
//    }
        return answer;
    }

}
