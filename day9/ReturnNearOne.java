package day9;

//arr의 원소는 1 또는 0
//정수 idx가 주어졌을 때, idx보다 큰 숫자이며, 값이 1인 가장 작은 인덱스를 찾아서 리턴
//그러한 인덱스가 없다면 -1을 리턴

//예시
//arr : [0, 0, 0, 1]	idx : 1	answer : 3
//주어진 idx는 1. arr[answer(idx=1보다 큼)]가 1인 인덱스는 3

//arr : [1, 0, 0, 1, 0, 0]	idx : 4	answer : -1
//주어진 idx는 4. arr[answer(idx=4보다 큼)]
//이때 4번 인덱스 이후로는 1이 존재하지 않는다. 따라서 -1을 리턴
public class ReturnNearOne {
	public int solution(int[] arr, int idx) {
		int answer = 0;
		for (int i = idx; i <arr.length; i++) {
			//시작점은 주어진 idx,끝은 arr의 길이 -1
			if (arr[i] == 1) {
				answer = i;
                break;
                //break를 여기 넣어줘야 제때 멈춘다
			} else {
				answer = -1;
				//answer의 초기값을 -1로 설정해두면 else문은 필요 없음
			}
		}
		return answer;
	}

	
}
