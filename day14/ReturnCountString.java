package day14;

//myString에서 pat이 등장하는 횟수를 리턴
public class ReturnCountString {

	public int solution(String myString, String pat) {
        int answer = 0;
        
        while(true) {
        	int i = myString.indexOf(pat);
        	myString = myString.substring(i+1, myString.length());
        	if(i == -1) break;
        	answer +=1;
        }
        //pat의 위치를 찾아낸 후, pat의 첫 글자 위치를 i에 저장
        //그 후 subString 메소드를 통해 그 다음 글자~끝글자 앞까지 자른 부분문자열 생성
        //만약 pat이 없다면 indexOf메소드가 -1을 리턴하니, 그 시점에 정지
        
//        또 다른 풀이
//        int cnt = 0;
//        for(int i=0; i<myString.length(); i++) {
//            if(myString.substring(i).startsWith(pat)){
//                cnt++;
//            }
//        startsWith 메소드를 사용. 문자열을 앞부터 탐색하며
//        해당 위치에서 pat으로 시작한다면 cnt에 1을 적립
        
        
        return answer;
    }
}
