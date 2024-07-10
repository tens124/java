package day15;

//rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 리턴
public class ReturnMAndRN {

	public String solution(String rny_string) {
        String answer = rny_string.replace("m", "rn");
        return answer;
    }
}
