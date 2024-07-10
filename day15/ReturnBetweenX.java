package day15;

import java.util.ArrayList;
import java.util.List;

//myString을 문자 "x"를 구분기호로 삼아 나눴을 때 
//나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 리턴
public class ReturnBetweenX {

	public static List<Integer> solution(String myString) {

		//문제의 조건 상 마지막 부분에 x가 연달아 나오면 split이 제대로 진행되지 않음
		//따라서 끝부분에 공백을 더해 문자열의 끝을 x가 아니게 만들고
		//이때 생겨난 추가 길이를 빼주는 방식으로 add해주면 해결됨
		myString = myString + " ";
		String[] temp = myString.split("x");
		List<Integer> answer = new ArrayList<>();
		
		//String[] temp = myString.split("x", -1);
		//스플릿 메소드의 매개변수를 조절하면 공백을 추가하지 않아도 된다
		//두 번째 매개변수는 스플릿된 문자열의 최대 개수를 나타내는 것
		//일반적으로 split() 메소드를 사용할 때는 이 값을 생략하거나 
		//양수값으로 지정하여 스플릿할 부분의 최대 개수를 제한하게 됨
		//이 자리에 -1을 집어넣는다면, 구분기호가 연속해서 나오더라도 
		//빈 문자열을 전부 포함하여 모든 부분을 반환하게 만들 수 있음

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1) {
				answer.add(temp[i].length() - 1);
			} else {
				answer.add(temp[i].length());
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		solution("oxooxoxxxxoxoooxxxx");
	}
}
