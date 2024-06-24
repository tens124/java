package day7;

import java.util.ArrayList;
import java.util.Collections;

//어떤 문자열에 대한 접미사는 특정 인덱스부터 시작하는 문자열을 의미
//"banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"
//my_string의 모든 접미사를 사전순(오름차순)으로 정렬한 문자열 배열을 리턴
public class ReturnSuffixArray {
	 public ArrayList<String> solution(String my_string) {
//		 String[] answer = new String[my_string.length()];
//		 배열만을 사용해서 푸는 것도 가능. 이때 배열 크기는 문자열의 길이만큼
//		 나머지는 동일. substring과 for문을 이용해 문자열을 자른 후 i번 인덱스에 저장
	        ArrayList<String> answer = new ArrayList<>();
	        for(int i =0;i<my_string.length();i++) {
	        	answer.add(my_string.substring(i));
	        }
	        Collections.sort(answer);
	        //자료구조의 내용물을 오름차순으로 정렬하는 메소드
	        
//	        Arrays.sort(answer);
//	        배열을 오름차순으로 정렬하는 메소드
	        return answer;
	    }

}
