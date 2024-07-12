package day16;

//정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 리턴
//arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0
public class ReturnDoubleArray1 {

	public int[][] solution(int n) {
		int[][] answer = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					answer[i][j] = 1;
				} else {
					answer[i][j] = 0;
				}
			}
		}
		
		//int 배열의 생성 시 기본값이 0인 것을 이용한 풀이
		//for(int i = 0 ; i < n ; i++) {
        //    answer[i][i] = 1;
		//	  [i][i]를 통해 i와 j가 같은 부분을 표현해줬음
        //}
		
		return answer;
	}
}
