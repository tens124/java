package day7;

//길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts
//parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미
//각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 리턴

//예시
//my_strings : ["progressive", "hamburger", "hammer", "ahocorasick"]	
//parts : [[0, 4], [1, 2], [3, 5], [7, 7]]
//progressive의 prog + hamburger의 am + hammer의 mer + ahocorasick의 s
//answer : "programmers"
public class ReturnPartOfString {

	public String solution(String[] my_strings, int[][] parts) {
		String answer = "";
		int i = 0;
		for (int[] part : parts) {
			answer = answer + my_strings[i++].substring(part[0], part[1]+1);
			//substring(a,b) 메소드는 a에서 시작해 b의 앞에서 끝남. 즉 a~b-1
		}
		return answer;
	}
	
}
