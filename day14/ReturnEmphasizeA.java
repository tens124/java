package day14;

//알파벳 "a"는 전부 "A"로, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 리턴
public class ReturnEmphasizeA {

	public String solution(String myString) {
        String answer = "";
        
        for(int i =0;i<myString.toCharArray().length;i++) {
        	if(myString.toCharArray()[i]=='a') {
        		answer+='A';
        	}else if(myString.toCharArray()[i]!='A'){
        		answer+=Character.toLowerCase(myString.toCharArray()[i]);
        	}else {
        		answer+='A';
        	}
        }
        
        //또 다른 풀이. 그냥 문자열을 전부 소문자로 바꾼 후 a를 전부 A로 바꾸면 됨
        //myString = myString.toLowerCase();
        //myString = myString.replace('a', 'A');
        
        return answer;
    }
}
