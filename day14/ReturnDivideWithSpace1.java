package day14;

//단어가 공백 한 개로 구분되어 있는 문자열 my_string
//my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 리턴
public class ReturnDivideWithSpace1 {

	public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}
