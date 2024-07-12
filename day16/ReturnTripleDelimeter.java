package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//임의의 문자열과 세 개의 구분자 "a", "b", "c"
//"a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 리턴
//단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, 
//리턴할 배열이 빈 배열이라면 ["EMPTY"]를 리턴

//예시
//문자열 : "baconlettucetomato"	결과 : ["onlettu", "etom", "to"]
//앞부분의 bac는 전부 구분기호이니 생략
public class ReturnTripleDelimeter {

	public List<String> solution(String myStr) {
		List<String> answer = new ArrayList<>();
		String temp = "";
		
		//가장 쉬운 방법
		//구분자를 [abc]+로 삼으면 된다. a,b,c 중 하나를 의미하는 정규표현식
		//이 글자들이 연속으로 나타나는 경우도 상정할 때 [abc]+를 사용

		for (int i = 0; i < myStr.length(); i++) {
			if (myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b' && myStr.charAt(i) != 'c') {
				temp += myStr.charAt(i);
			}
			if ((myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c' || i == myStr.length()-1)) {
				answer.add(temp);
				temp = "";
			}
		}
		//a,b,c 이외의 문자를 누적하다 a,b,c 혹은 마지막 글자를 만났을 때
		//누적된 문자열을 answer에 추가한 후 초기화하는 반복문
		
		while(answer.contains("")) {
			answer.remove("");
		}
		//answer에 ""가 없을 때까지 반복되는 while문
		//모든 ""를 제거한다

		return answer.size()!=0?answer:Arrays.asList("EMPTY");
		//Arrays.asList는 배열을 List로 변화시키는 메소드
		//정확히 말하자면 수정 및 추가, 삭제 등이 불가능한 뷰를 리턴함. 
		//뷰는 ["EMPTY"]라는 리스트의 내용을 보기만 하는 객체를 의미함
		//원본이 된 ["EMPTY"] 리스트는 heap메모리 상에 존재하다가
		//가비지 컬렉터에 의해 할당 해제됨
		//따라서 이 코드는 answer이 비어있는 경우엔 뷰 형태의 ["EMPTY"] 리스트를
		//반환하는 것임
	}
}
