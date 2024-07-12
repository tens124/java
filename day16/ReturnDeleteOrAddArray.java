package day16;

import java.util.ArrayList;
import java.util.List;

//아무 원소도 들어있지 않은 빈 배열 X
//길이가 같은 정수 배열 arr과 boolean 배열 flag
//flag를 앞에서부터 셀 때 
//flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가
//flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 리턴

//예시
//arr : [3, 2, 4, 1, 3]	flag : [true, false, true, false, false]	
//결과 : [3, 3, 3, 3, 4, 4, 4, 4]
//i=0
//true를 만났으니 3을 6번 추가. [3,3,3,3,3,3]
//i=1
//false를 만났으니 뒤에서 두 개의 원소를 제거. [3,3,3,3]
//i=2
//true를 만났으니 4를 8번 추가. [3,3,3,3,4,4,4,4,4,4,4,4]
//i=3
//false를 만났으니 뒤에서 하나의 원소를 제거.[3,3,3,3,4,4,4,4,4,4,4]
//i=4
//false를 만났으니 뒤에서 3개의 원소를 제거. [3,3,3,3,4,4,4,4]

public class ReturnDeleteOrAddArray {
	public List<Integer> solution(int[] arr, boolean[] flag) {
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					answer.add(arr[i]);
				}
			}else{
				for (int k = answer.size() - 1, j = 0; j < arr[i]; j++) {
					answer.remove(k--);
				}
			}
		}

		return answer;
	}

}
