package day15;

//두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 크다
//배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 
//다르다면 더 큰 쪽이 크고, 같다면 같다
//위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 리턴
public class ReturnCompareArray {

	public int solution(int[] arr1, int[] arr2) {
		int answer = 0;
		int temp1 = 0;
		int temp2 = 0;

		if (arr1.length > arr2.length) {
			answer = 1;
		} else if (arr1.length < arr2.length) {
			answer = -1;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				temp1 += arr1[i];
				temp2 += arr2[i];
			}
			answer = temp1 == temp2 ? 0 : temp1 > temp2 ? 1 : -1;
			//temp1과 temp2가 같다면 0 , 아니라면 새로운 삼항연산자 연산
		}

		return answer;
	}
}
