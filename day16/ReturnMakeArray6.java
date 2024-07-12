package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//0과 1로만 이루어진 정수 배열 arr로 새 배열 stk를 제작
//i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복
//만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 +1
//stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 +1
//stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 +1
//위 작업을 마친 후 만들어진 stk을 리턴
public class ReturnMakeArray6 {

	public List<Integer> solution(int[] arr) {
		List<Integer> answer = new ArrayList<>();
		
		for(int i = 0;i<arr.length;i++) {
			if(answer.size()==0) {
				answer.add(arr[i]);
			}else {
				if(answer.get(answer.size()-1)==arr[i]) {
					answer.remove(answer.size()-1);
				}else {
					answer.add(arr[i]);
				}
			}
		}
		
		//리스트 대신 스택을 이용하는 것도 가능
		//스택은 리스트와는 달리 데이터의 삽입과 삭제가 한쪽 끝에서만 일어나는 구조
		//라스트 인 퍼스트 아웃(LIFO). 가장 늦게 들어간 데이터를 가장 먼저 삭제
		//
		
//		Stack<Integer> stack = new Stack<>();
		
//		for (int no : arr) {
//            if (!stack.isEmpty() && no == stack.peek()) {
//		peek() 메소드 : 스택의 맨 위에 있는 데이터를 제거하지 않고 반환
//		즉 스택이 비어있지 않고, 가장 나중에 들어간 데이터가 arr[i]와 일치한다면
//                stack.pop();
//		pop() 메소드 : 스택의 가장 위에 있는 데이터를 제거함
//            } else {
//                stack.push(no);
//		push(데이터) 메소드 : 스택에 데이터를 삽입
//            }
//        }
		
        return answer.size()==0?Arrays.asList(-1):answer;
    }
}
