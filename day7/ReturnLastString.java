package day7;

//my_string의 뒤의 n글자로 이루어진 문자열을 리턴
public class ReturnLastString {
	public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n);
        //substring메소드의 매개변수가 하나일 경우, 문자열의 앞에서부터 
        //해당 매개변수만큼을 세어 잘라낸 후 뒷부분을 리턴
        return answer;
    }

}
