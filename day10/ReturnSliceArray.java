package day10;

import java.util.ArrayList;

//정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list
//slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 num_list를 슬라이싱
//n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//올바르게 슬라이싱한 배열을 리턴
public class ReturnSliceArray {

	public ArrayList<Integer> solution(int n, int[] slicer, int[] num_list) {
		ArrayList<Integer> answer = new ArrayList<>();
		int a = slicer[0];
		int b = slicer[1];
		int c = slicer[2];
		int i = 0;

		switch (n) {
		case (1):
			while (i <= b) {
				answer.add(num_list[i]);
				i++;
			}
			break;
		case (2):
			i = a;
			while (i < num_list.length) {
				answer.add(num_list[i]);
				i++;
			}
			break;
		case (3):
			i = a;
		while (i <= b) {
			answer.add(num_list[i]);
			i++;
		}
			break;
		case (4):
			i = a;
		while (i <= b) {
			answer.add(num_list[i]);
			i+=c;
		}
			break;
		}
		
//		다른 풀이. 시작점과 종착점, 간격을 지정 후 조건에 따라 다르게 입력
//		주어진 문제의 조건을 잘 이해하면 만들 수 있는 코드
//		int start = n == 1 ? 0 : slicer[0];
//		시작점은 n이 1이라면 0, 그 이외의 경우엔 slicer[0]
//      int end = n == 2 ? num_list.length - 1 : slicer[1];
//		종착점은 n이 2일 때 배열 크기 -1(배열의 끝까지를 의미), 그 이외이면 slicer[1]  
//      int step = n == 4 ? slicer[2] : 1;
//		간격은 n이 4라면 slicer[2], 그 이외엔 1(i++)
//      int[] answer = new int[(end - start + step) / step];
//		배열의 크기 설정. (end - start + 1)/1의 경우는 평범한 갯수 세기. 끝-시작+1
//		(end - start + step) / step은? start~end까지 step 간격으로 세는 중
//		이건..직접 해봐야 알 거 같음. 시작점이 2이고, 끝점이 8, 간격이 2라면?
//		2,4,6,8번 인덱스의 원소를 갖게 됨. 크기는 4. (8-2+2)/2와 일치
//		시작점이 2이고, 끝점이 8, 간격이 3이라면?
//		2,5,8번 인덱스의 원소를 갖게 됨. 크기는 3. (8-2+3)/3와 일치
//		단순한 갯수 세기의 응용인 듯. 여러 번 해보자
//        for (int i = start, j = 0; i <= end; i += step) {
//		  i는 num_list에서 가져올 값/j는 answer배열에 사용할 값
//            answer[j++] = num_list[i];
//			  증감자를 사용해 이중for문 대신 사용
//        }
		
		return answer;
	}
}
