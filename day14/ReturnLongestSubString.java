package day14;

//myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 리턴
public class ReturnLongestSubString {
	public String solution(String myString, String pat) {
        String answer = "";
        
        int e = pat.length()!=1
        		?myString.lastIndexOf(pat)+pat.length()-1
        		:myString.lastIndexOf(pat);
        //lastIndexOf 메소드는 입력된 문자열의 첫 글자가 나오는 위치를 리턴해줌
        //따라서 pat이 두 글자 이상일 경우 추가적인 처리를 해줘야 끝 위치를 알아낼 수 있음
        //이때 length는 1부터 시작이기에 1을 빼줘야 인덱스와 일치하게 됨
        
        for(int i = 0;i<=e;i++) {
        	answer+=myString.toCharArray()[i];
        }
        
        //훨씬 간단한 풀이법
        // int idx = myString.lastIndexOf(pat);
        //lastIndexOf 인덱스는 해당 문자열의 가장 첫 글자 위치를 반환
        //answer = myString.substring(0, idx) + pat;
        //그냥 해당 문자열의 앞까지 자른 후 pat을 덧붙여주면 된다
        //substring 메소드는 시작지점~끝지점 앞부분까지 문자열을 자름
        
        return answer;
    }

}
