package day10;

import java.util.ArrayList;

//정수 배열 arr 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 리턴
//arr에 2가 없을 경우 [-1] 리턴

//예시
//arr : [1, 2, 1, 4, 5, 2, 9]	answer : [2, 1, 4, 5, 2]
//arr의 모든 2를 포함하면서, 가장 작은 부분배열. 즉 첫 2부터 끝 2까지만 떼어놓은 것
public class ReturnZoneOfTwo {

	public int[] solution(int[] arr) {
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				temp.add(i);
			}
		}
		// 시작점과 끝점을 구하기 위한 for문. 2인 부분의 인덱스번호가 전부 저장됨

		int[] answer = { -1 };
		if (temp.size() > 1) {
			answer = new int[temp.get(temp.size()-1) - temp.get(0) + 1];
			//맨 앞의 원소와 맨 뒤의 원소를 연결. 그 후 반복문을 통해 arr의 원소 삽입
			for (int i = temp.get(0), j = 0; i <= temp.get(temp.size()-1); i++) {
				answer[j++] = arr[i];
				// answer = Arrays.copyOfRange(arr,start,end+1);
				//copyOfRange(배열,시작번호,끝번호)메소드도 사용 가능
			}
		} else if (temp.size() == 1) {
			answer[0] = 2;
		}

		return answer;
	}
}
