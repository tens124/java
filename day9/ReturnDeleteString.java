package day9;

//my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 리턴
public class ReturnDeleteString {
	public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] str = my_string.toCharArray();
//      String[] tmp = my_string.split("");  
//      split(구별용 문자) 메소드는 매개변수로 쓰인 인자를 기준으로 문자열을 나눈 후 배열로 만듦
//      이때 매개변수로 아무것도 주지 않으면 한 글자씩 떼어서 배열을 생성.  String배열을 만드려면 이렇게
//      그 후   tmp[indices[i]]를 ""로 만들든 "0"으로 만들든 하면 된다
        for(int i = 0;i<indices.length;i++) {
        	str[indices[i]] = '0';
        	}
        for(int i = 0;i<str.length;i++) {
        	if(!(str[i]=='0'))
        		answer+=str[i];
        	}
        return answer;
    }
	
	

}
