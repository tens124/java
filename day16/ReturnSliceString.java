package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//"x"를 기준으로 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 리턴
//단, 빈 문자열은 반환할 배열에 넣지 않음
public class ReturnSliceString {

	public static List<String> solution(String myString) {
		List<String> answer = new ArrayList<>();
		String temp = "";
//        String[] answer = {};
//        String[] answer = myString.split("x",0);
//        Arrays.sort(answer);
//		이 코드는 구분기호가 연속되는 경우를 처리하지 못함.
//		split(구분기호,최대 분할 횟수) 메소드의 경우 0을 넣든 -1을 넣든
//		최대 분할 횟수를 제한하지 않는다는 의미. 따라서 x가 여럿 붙어있는 경우
//		빈칸을 생성하게 됨
		
//		따라서 x 대신 정규표현식 x+를 넣어 연속된 x를 모두 하나의 구분기호로 삼는 것도 가능
//		다만 이 경우에도 시작이나 앞부분에 구분기호가 등장할 경우 빈칸이 추가적으로 생겨남
		
//		String[] parts = myString.split("x+");
//		그렇기에 이처럼 분할을 끝마친 배열을 임시로 만들고
//		List<String> result = new ArrayList<>();
//		for (String part : parts) {
//		    if (!part.isEmpty()) {
//		for문을 통해 해당 배열의 빈칸을 걸러낸 후 리스트에 넣는 것도 좋은 방법
//		        result.add(part);
//		    }
//		}

		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) != 'x') {
				temp += myString.charAt(i);
			}
			if (myString.charAt(i) == 'x' || i == myString.length() - 1) {
				answer.add(temp);
				temp = "";
			}
			//왜 else if 대신 if문을 두 번 사용하는가?
			//if - else if 문의 경우 한 쪽이 만족되면 다른 쪽은 생략
			//즉, 마지막 문자가 x가 아니라면 아래의 조건문은 그대로 통과해버림
			//위의 조건문이 x는 자동으로 걸러주니 if문을 두 번 통과해도 괜찮음
			
			
			answer.remove("");
			//remove메소드는 앞에서부터 검색을 실행하여 가장 먼저 나오는 인덱스를 삭제
			//따라서 반복문 안에서 실행해야 함
			//리스트가 완전히 완성된 상황에서 실행한다면 빈칸이 여럿일 경우
			//하나의 빈칸만 지워지게 됨
			//낭비를 피하려면 특정 인덱스가 빈칸인지 확인하고 지워도 됨
		}

		Collections.sort(answer);
		//오름차순 메소드

		return answer;

	}

	public static void main(String[] args) {
		solution("dxccxbbbxaaaaxxx");
	}
}
