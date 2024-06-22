package day5;

import java.util.ArrayList;
import java.util.List;

//변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복
//만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 +1
//stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 +1
//stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거
//이렇게 만들어진 stk를 리턴
public class ReturnMakeArray2 {
	public List<Integer> solution(int[] arr) {
		List<Integer> stk = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (stk.size() == 0) {
				stk.add(temp);
			} else {
				if (stk.get(stk.size() - 1) < temp) {
					stk.add(temp);
				} else {
					stk.remove(stk.size() - 1);
					i--;
				}
			}
		}

		return stk;
	}
	
//	Stack을 이용한 방법
//	Stack은 한 쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last In First Out) 형식의 자료 구조
//	프링글스 통을 생각하면 됨. 한 쪽은 막혀있고, 데이터는 위쪽부터 차례로 들어감. 빼는 것도 위에서만 가능
//	즉, 가장 최근에 들어간 데이터가 가장 먼저 삭제될 대상이 됨
//	이때 프링글스통은 누워있는 상태고, 입구는 오른쪽이라고 생각하면 된다.
//	1,2,3을 집어넣으면 결과는 [1,2,3]이 된다. 데이터가 오른쪽부터 들어오기 때문
//	pop(): 스택에서 가장 위에 있는 항목을 제거한다.
//	push(item): item 하나를 스택의 가장 윗 부분에 추가한다.
//	peek(): 스택의 가장 위에 있는 항목을 반환한다.
//	isEmpty(): 스택이 비어 있을 때에 true를 반환한다.
	
//	public Stack<Integer> solution(int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//        int i = 0;
//
//        while (i < arr.length) {
//		  while문은 조건식이 거짓이라면 즉시 정지됨. 아래 문항 실행 X
//            if (stack.empty() || stack.peek() < arr[i]) {
//			  stack이 비어있거나 가장 위의 항목이 arr[i]보다 작다면
//                stack.push(arr[i]);
//			  	  arr[i]를 집어넣는다
//                i++;	그 후 i에 1 추가
//            } else if (stack.peek() >= arr[i]) {
//			  이외의 경우. 즉 stack에 내용물이 있고, 가장 위 항목이 arr[i] 이상이라면
//                stack.pop();
//				  가장 윗부분(마지막에 들어간 데이터)의 데이터를 삭제
//            }
//        }
//        return stack;
//    }

}
