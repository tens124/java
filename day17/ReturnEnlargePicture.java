package day17;

import java.util.ArrayList;
import java.util.List;

// 1 × 1 크기의 정사각형 크기의 픽셀로 이루어진 직사각형 형태의 그림 파일 picture
//이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 리턴

//예시
//picture : ["x.x", ".x.", "x.x"] k : 3
//answer : ["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]
//x.x
//.x.
//x.x
//라는 그림파일을 k값 3에 따라
//xxx...xxx
//xxx...xxx
//xxx...xxx
//...xxx...
//...xxx...
//...xxx...
//xxx...xxx
//xxx...xxx
//xxx...xxx
//세 배 확대
public class ReturnEnlargePicture {

	public static List<String> solution(String[] picture, int k) {
		List<String> answer = new ArrayList<>();
		// 각 문자열의 각 인덱스에 위치한 원소를 각각 k번씩 찍은 후
		// 그렇게 완성된 문자열을 k번 반복해서 만들어 내고 있음

		StringBuilder temp = new StringBuilder("");
		// String과는 달리 변형이 가능한 문자열

		int cnt = 0;

		for (int i = 0; i < k * picture.length;) {
		//행의 갯수가 k배만큼 늘어야 하기에, 제공된 배열 picture과 k를 곱해 반복 한계값으로 설정
			for (int j = 0; j < k * picture[i / k].length(); j++) {
			//안쪽의 반복문. j는 문자열 내부의 char를 순회하기 위한 변수
			//문제에서는 각 인덱스의 문자열 내부의 모든 문자를 k번씩 반복출력하도록 요구하고 있음
			//따라서 [i/k]를 통해 i가 충분히 커져야 다음 요소를 선택하도록 제어
				temp.append(picture[i / k].charAt(j / k));
				//i가 충분히 커질 때 까지는 다음 행으로도, 다음 문자로도 나아가지 않도록 하고 있음
				//temp라는 문자열에 문자를 계속 집어넣는 중
				cnt++;
				//cnt는 i값을 늘릴 타이밍을 조절해주는 변수
				//값이 k보다 커지면, 즉 k배 확대된 문자열이 k번 삽입되면 i값을 1 늘려줌
			}
			if (cnt >= k) {
				answer.add(temp.toString());
				//k배 확대된 문자열을 answer에 삽입
				//cnt >= k 조건으로 인해 문자열이 k번 삽입되기 전까지 계속 반복됨
				temp.setLength(0);
				//temp를 초기화해줌
				i++;
				//i를 1 늘려 다음 루프로
			}
		}
		
		//챗지피티의 풀이법
//		List<String> answer = new ArrayList<>();
//
//        for (String line : picture) {
//            // 각 라인의 문자를 k배로 확대
//            StringBuilder enlargedLine = new StringBuilder();
//			  for문 두 개를 거치면, 즉 k배 확대된 문자열이 k번 삽입되면
//			  자연스럽게 초기화되는 enlargedLine 문자열
		
//            for (char ch : line.toCharArray()) {
//			  line.toCharArray()를 통해 문자열의 앞부분부터 자연스러운 순회 가능
//                for (int i = 0; i < k; i++) {
//                    enlargedLine.append(ch);
//                }
//				  각 문자를 enlargedLine에 k번 삽입해줌
//            }
//			  for문 하나가 종료됨. 이를 통해 k배 확대된 문자열을 하나 얻음

		
//            // k배로 확대된 라인을 k번 추가
//            for (int i = 0; i < k; i++) {
//                answer.add(enlargedLine.toString());
//            }
//        }
		
		

		return answer;
	}

	public static void main(String[] args) {
		String[] arr = { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...." };

		solution(arr, 2);
	}

}
