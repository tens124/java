package day11;

import java.util.Arrays;

//문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장
//"l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 
//해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트 리턴
//먼저 나오는 문자열이 "r"이라면 
//해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트 리턴
//"l"과 "r"이 없다면 빈 리스트 리턴
public class ReturnLeftRight {

	public static String[] solution(String[] str_list) {
        String[] answer = {};
        
//        for문을 사용하게 될 경우, switch문이 정지해도 루프가 계속되어
//        switch문에 break를 사용해도 for문의 i가 증가하며 재검사가 실시됨
//        따라서 둘을 동시에 사용하는 것은 옳은 방법이 아님
//        for(int i = 0;i<str_list.length;i++) {
//        	switch(str_list[i]) {
//        	case("l"): 
//        		answer = Arrays.copyOfRange(str_list, 0, i);
//        		break;
//        	case("r"):
//        		answer = Arrays.copyOfRange(str_list, i+1, str_list.length);
//        		break;
//        	default : break;
//        	}
//        }
        for(int i = 0;i<str_list.length;i++) {
        	if(str_list[i].equals("l")) {
        		answer = Arrays.copyOfRange(str_list, 0, i);
        		break;
        	}else if(str_list[i].equals("r")) {
        		answer = Arrays.copyOfRange(str_list, i+1, str_list.length);
        		break;
        	}
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] arr = {"u", "u", "l", "r"};
		solution(arr);
	}
	
	
}
