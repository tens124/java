package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//문자열 배열 strArr
//strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 
//가장 개수가 많은 그룹의 크기를 리턴
public class ReturnChainString {

	public int solution(String[] strArr) {
		int answer = 0;
		int[] temp = new int[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			temp[i] = strArr[i].length();
		}
		Arrays.sort(temp);
		//temp배열에 각 문자열의 길이를 저장한 후 오름차순 정렬
		
		int number = 0;
		List<Integer> sum = new ArrayList<>();

		for (int i = 0, j = 1; i < temp.length; i++) {
			//j를 i보다 1 더 큰 수로 설정해 앞 인덱스와 뒤 인덱스를 비교
			number += 1;
			if (i == temp.length - 1 || temp[i] != temp[j++]) {
				//두 조건문의 순서를 바꾸면 j가 배열 범위를 초과해버려 오류 발생
				sum.add(number);
				number = 0;
				//앞 인덱스와 뒤 인덱스가 서로 다르거나, 마지막 인덱스에 도달했을 때
				//그동안 세어둔 같은 크기의 문자열 갯수를 sum리스트에 저장 후 초기화
			}
		}
		
		Collections.sort(sum);
		answer = sum.get(sum.size()-1);
		//오름차순 정렬 후 마지막 인덱스의 수를 answer에 담는다

		return answer;
	}
}
