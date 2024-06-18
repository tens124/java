package day2;

//길이가 같은 두 개의 문자열을 번갈아가며 저장 후 리턴
public class ReturnShuffleString {
	public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0;i<str1.length();i++) {
        	answer += str1.toCharArray()[i];
        	answer += str2.toCharArray()[i];
        }
        
        return answer;
        
        //String 객체끼리 더하는 방법은 메모리 할당과 해제를 계속해서 발생시킴
        //많은 문자열을 연결하면 많은 중간 문자열 객체가 생성되어 비효율적인 코드가 생성됨
        //왜? 자바에서 String 객체는 내용을 변경하는 것이 불가능. 생성된 시점의 내용이 계속됨
        // 따라서 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터로 들어간다.
        //이럴 때 대신 사용할 수 있는 것이 변경 가능한 문자열을 만들어주는 StringBuilder
        //StringBuilder의 객체를 생성한 후, append()의 인자로 연결하고자 하는 문자열을 넣어서 
        //StringBuilder의 객체를 통해 호출한다. 그리고 출력 시에는 toString()을 붙여야 하고, String 변수에 넣을 때도 마찬가지다.
		/*
		 * char[] chars1 = str1.toCharArray(); 
		 * char[] chars2 = str2.toCharArray();
		 * 
		 * StringBuilder sb = new StringBuilder(); 
		 * for (int i=0; i<chars1.length; i++) {
		 * sb.append(chars1[i]).append(chars2[i]); 
		 * }
		 * append 메소드의 인자로 사용된 문자가 StringBuilder 객체에 삽입됨. 
		 * 해당 메소드는 여러 번 이어 사용 가능
		 * 
		 * return sb.toString();
		 */
	
	}
}
