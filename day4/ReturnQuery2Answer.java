package day4;

//너무 오래 걸려서 실패. 오름차순 정렬을 구현하는 식으로 했지만, 해당 코드는
//필수적인 부분이 아닌데도 구현 및 자원소모에 있어서 지대한 영향을 끼쳐버림
//따라서 챗GPT의 답을 빌림
public class ReturnQuery2Answer {
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length]; // 결과를 저장할 배열 초기화
        //이 문제의 답이 될 배열의 크기는 queries의 크기에 따라 달려있다

        // 각 query에 대해 반복
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0]; // query의 시작 인덱스
            int end = queries[i][1]; // query의 끝 인덱스
            int k = queries[i][2]; // query에서 찾아야 하는 값

            int minGreaterThanK = Integer.MAX_VALUE; 
            // k보다 큰 값 중에서 가장 작은 값 초기화
            //Integer.MAX_VALUE는 int 중 최대 수치를 의미
            //혹시나 겹치는 경우가 발생하지 않게 하기 위해 설정한 수

            // query 범위 내에서 k보다 크면서 가장 작은 값을 탐색
            for (int j = start; j <= end; j++) {
                if (arr[j] > k && arr[j] < minGreaterThanK) {
                    minGreaterThanK = arr[j];
                }
            }
            //다만 이 코드의 경우, arr이 0,1,2,3,4처럼 순서대로 정렬되어 있다면
            //minGreaterThanK에 4가 저장되면서 답이 꼬여버려야 하는데...
            //이건 좀 더 생각해보자

            // 결과 배열에 결과 값 저장
            answer[i] = (minGreaterThanK == Integer.MAX_VALUE) ? -1 : minGreaterThanK;
        }

        return answer; // 결과 배열 반환
    }

   
}
