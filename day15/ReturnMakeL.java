package day15;

//알파벳 소문자로 이루어진 문자열 myString
//알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 리턴
public class ReturnMakeL {
	public String solution(String myString) {
        String answer = "";
        
        for(int i = 0;i<myString.length();i++) {
        	if(myString.charAt(i)<108) {
        		answer+="l";
        	}else {
        		answer+=myString.charAt(i);
        	}
        }
        return answer;
        
        //정규표현식을 사용하는 것도 가능
        //[^l-z]를 전부 l로 대체. 
        //^는 부정을 의미. 따라서 l~z가 아닌 숫자를 전부 대체하도록 지정
        //return myString.replaceAll("[^l-z]", "l");
    }
}
