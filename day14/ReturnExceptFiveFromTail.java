package day14;

import java.util.Arrays;

//num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 리턴
public class ReturnExceptFiveFromTail {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length-5];
		
		Arrays.sort(num_list);
		
		for(int i = 5,j=0;i<num_list.length;i++) {
			answer[j++]=num_list[i];
		}
		return answer;
		
		//스트림을 이용한 풀이법
		//return Arrays.stream(numList) numList를 스트림으로
		//.sorted()	스트림 요소 정렬. 기본값 : 오름차순 정렬
		//.skip(5)	처음 5개의 요소를 건너뜀
		//.toArray();	스트림을 다시 배열로


	}

}
