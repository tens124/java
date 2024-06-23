package day6;

//문자열 my_string과 정수 배열 index_list
//my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 리턴
public class ReturnNewString {
	public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i =0;i<index_list.length;i++) {
        	answer = answer + my_string.toCharArray()[index_list[i]];
        }
        return answer;
    }
	
//	스트링빌더를 사용한 풀이
//	String 객체끼리 더하는 방법은 메모리 할당과 해제를 발생시키는데, 덧셈 연산이 많아진다면 성능적으로 좋지 않다.
//	www.codejava.net/java-core/the-java-language/why-use-stringbuffer-and-stringbuilder-in-java
//	String은 생성 후 변경 불가능. 즉 덧셈 연산 시 매번 새 String 객체를 생성하고
//	이전 문자열은 가비지컬렉터로 들어가 소멸하게 되는 것
//	따라서 변경 가능한 객체인 스트링빌더를 사용해서 데이터 낭비를 줄이자
	
//	StringBuilder sb = new StringBuilder();
//
//    for (int idx : index_list)
//        sb.append(my_string.charAt(idx));
//	  나머지는 내가 사용한 방법과 동일. 향상된 for문 사용
//
//    return sb.toString();

}
