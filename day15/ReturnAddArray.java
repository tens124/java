package day15;

//아무 원소도 들어있지 않은 빈 배열 X와 양의 정수 배열 arr
//arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 
//X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 리턴
public class ReturnAddArray {

	public int[] solution(int[] arr) {
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			length += arr[i];
		}

		int[] answer = new int[length];
		int count = 0;

		for (int i = 0, j = 0; i < answer.length; i++) {
			answer[i] = arr[j];
			count++;
			if (count == arr[j]) {
				j++;
				count = 0;
			}
		}

		return answer;
	}
}
