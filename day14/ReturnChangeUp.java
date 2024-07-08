package day14;

//영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp
//my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 리턴
public class ReturnChangeUp {
	public String solution(String my_string, String alp) {
        String answer = "";
        answer = my_string.replace(alp, alp.toUpperCase());
        
        return answer;
        
        //replaceAll을 사용하는 것도 가능
        // String a = alp.toUpperCase();
        //return my_string.replaceAll(alp, a);
        
        //String replaceAll(String regex, String replacement)
        //replaceAll 메소드의 경우 첫 매개변수로 정규식(regex)를 사용한다
        //다만 이 문제에서는 단순히 글자 하나만을 찾는 것이기에 굳이 정규식 사용을 안해도 됨
    }

}
