package day14;

//배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 
//짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 리턴
public class returnToUpOrLow {
	public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i =0;i<strArr.length;i++) {
        	answer[i]=i%2==0?strArr[i].toLowerCase():strArr[i].toUpperCase();
        }
        return answer;
    }

}
