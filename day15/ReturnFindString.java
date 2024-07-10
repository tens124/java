package day15;

import java.util.ArrayList;
import java.util.List;

//문자 "A"와 "B"로 이루어진 문자열 myString과 pat
//myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 
//pat이 있으면 1을 아니면 0을 리턴
public class ReturnFindString {

	public int solution(String myString, String pat) {
		String temp = "";
        
		//아주 좋은 풀이법
		//myString = myString.replace("A", "a")
		//.replace("B", "A")
		//.replace("a", "B");
		//변수의 값을 서로 바꿀 때 임시 변수 temp를 지정하는 것을 생각해보자
		//이 코드는 우선 문자열의 A를 전부 a로 바꾼 후, B를 전부 A로, 
		//마지막으로 a를 전부 B로 바꾸는 방법을 사용하고 있다

		for(int i = 0;i<myString.length();i++) {
        	if (myString.charAt(i)=='A'){
        		temp+="B";
        	}else {
        		temp+="A";
        	}
        }
        
        
        int answer = temp.contains(pat)?1:0;
        
        return answer;
    }
}
