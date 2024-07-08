package day14;

import java.util.ArrayList;
import java.util.List;

//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string
//my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 리턴
public class ReturnDivideWithSpace2 {

	public List<String> solution(String my_string) {
		List<String> answer = new ArrayList<>();
		my_string += " ";
		//끝에 공백 한 칸을 추가해줌
		String temp = "";
		//문자를 적립할 임시 변수

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) != ' ') {
				temp += my_string.charAt(i);
				//공백이 아니라면 그 문자를 temp에 적립
			} else {	//공백을 만났을 때 처리될 코드. 적립된 temp를 추가
				if(temp.length()!=0) {
				//ArrayList엔 ""도 저장되기에 이를 방지하기 위한 if문
					answer.add(temp);
				}
				temp = "";
				//temp를 초기화. 공백을 만나 한 단어가 저장된 후엔 내용을 비워버린다
			}

		}
		
//		또 다른 풀이법
		// 공백이 두 칸 이상 나오지 않도록 아래의 반복문을 수행한다.
        // 한 칸짜리 공백만 남으면 반복문을 빠져나오고 그 공백 하나로 구분한다.
//        while (my_string.contains("  ")) {
//            my_string = my_string.replace("  ", " ");
//        }
        // my_string의 맨 앞이 공백이라면 그 공백은 제거해야 한다.
//        if (my_string.startsWith(" ")) {
//            my_string = my_string.substring(1, my_string.length());
//        }
		//마지막으로 공백 한 칸을 기준으로 split하면 끝
//		answer = my_string.split(" ");
		
		
		
		//정규표현식을 사용한 풀이법
//		return my_string.trim().split("[ ]+");
		//우선 trim을 사용해 문자열 앞뒤의 공백을 전부 없앰
		//그 후 split메소드에 정규표현식을 구분기호로 삼아 분리
		//[] : 공백 한 칸을 의미
		//+ : 앞에 쓰인 문자열이 연속해서 등장할 수 있음을 의미
		
		return answer;
	}
}
