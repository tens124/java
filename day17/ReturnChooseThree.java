package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

//0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사
//참여가 가능한 학생 중 등수가 높은 3명을 선발
//각 학생들의 선발 고사 등수를 담은 정수 배열 rank
//전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance
//참여 가능한 학생의 등수만 세었을 때,
//등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 리턴
public class ReturnChooseThree {

	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int temp = 0;

		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				temp++;
			}
		}
		TreeMap<Integer, Integer> number = new TreeMap<>();
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				number.put(rank[i], i);
			}
			// 등수(키):키(값) 배열이 만들어짐
			// 이때 TreeMap은 키를 기준으로 자동으로 오름차순 정렬을 해줌
		}

		Collection<Integer> num = number.values();
		// values 메소드를 통해 number에 저장된 값들을 전부 불러온 후 컬렉션에 저장
		// 이때, 키값을 기준으로 오름차순된 그 순서 그대로 저장된다

		int count = 1;
		for (int n : num) {
			switch (count) {
			case (1):
				answer += 10000 * n;
				count++;
				break;
			case (2):
				answer += 100 * n;
				count++;
				break;
			case (3):
				answer += n;
				count++;
				break;
			default:
				break;
			}
		}
		
		//for - switch문 대신 어레이리스트를 사용해도 됨
//		ArrayList<Integer> list = new ArrayList<>();
//      for (Integer key : number.keySet()) {
//		keySet메소드로 맵에 저장된 모든 키들의 집합을 반환
//		for문을 통해 모든 키들을 앞에서부터(오름차순 순서) 조회 중
//          if (list.size() == 3) break;
//			리스트의 크기가 3일 때 정지하도록 설정
//          list.add(number.get(key)); 
//			key를 통해 불러온 값을 리스트에 저장
//      }
//		이 모든 작업을 끝낸 후, 어레이리스트의 값을 인덱스 번호를 통해 찾아오면 끝
		
		return answer;

	}
}
