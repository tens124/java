package day16;

import java.util.Arrays;

//랜덤으로 서로 다른 k개의 수를 저장한 배열을 만들어야 한다
//일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식
//어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해야 함
//무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 리턴
//단,완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 리턴

//예시
//arr : [0, 1, 1, 2, 2, 3]	k : 3	결과 : [0, 1, 2]
//중복되지 않은 수인 0,1,2,3을 차례대로 3 크기의 배열의 삽입. 
//arr : [0, 1, 1, 1, 1]	k : 4	결과 : [0, 1, -1, -1]
//중복되지 않은 수인 0,1을 차례대로 4 크기의 배열의 삽입
//이때 0,1의 삽입이 끝난 후엔 더 삽입할 수가 없으니 남은 부분은 -1로 채움
public class ReturnRandomPickK {

	public static int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		Arrays.fill(answer, -1);
		// 배열의 모든 칸을 -1로 설정

		//arr 내부의 중복되는 수를 전부 -2로 바꿔주는 for문
		//이중for문을 통해 arr 내부의 모든 원소(자신 제외)를 서로 비교함
		//이때 일치하는 원소가 존재한다면 뒤의 원소를 -2로 변경해버림
		
		//왜 null값이 아니라? int는 기본자료형이기 때문
		//null은 객체에 대한 참조가 없는 상태를 표현하는 값. 기본자료형과의 호환은 불가능
		//null을 사용하려면 배열 자체를 Integer배열로 바꿔서 사용하면 됨
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
				//자기 자신과의 비교를 피하기 위해 i != j 조건을 같이 붙임
					arr[j] = -2;
				}
			}
		}
		

		for (int i = 0; i < k; i++) {
			for (int j = i; j < arr.length; j++) {
				//안쪽 for문의 시작점을 i로 사용하는 이유 : arr[j]가 -2가 아니라면
				//집어넣도록 설계된 코드. 즉, j를 0으로 설정 시 arr[j]가 -2가
				//아니라면 계속해서 그 수를 삽입해버리기 때문
				if (arr[j] != -2) {
					answer[i] = arr[j];
					arr[j] = -2;
					//arr[j]를 삽입한 후 -2로 변경시켜야 함
					//변경하지 않는다면, 예를 들어 arr이 [1,-2,4,5]인 상태라면
					//i가 1일 때는 -2가 아닌 값을 찾아서 4가 삽입됨
					//i가 2일 때는? 4는 그대로인 상태니 또다시 4가 삽입돼버림
					//따라서 한 번 삽입된 수는 -2로 변경시켜줘야 중복이 방지됨
					break;
				}
			}
			System.out.println(answer[i]);
		}
		return answer;
		
		
		//스트림을 이용한 풀이법
		//return IntStream
		//.concat  concat메소드는 두 개의 메소드를 합침
		//(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1))
		//Arrays.stream(arr).distinct()로 arr의 중복 요소 제거
		//IntStream.range(0, k).map(i -> -1) 0~k까지의 원소를 잘라낸 후 전부 -1로 변환
		//둘은 concat의 매개변수. 따라서 그 둘을 합치면 중복요소 제거 + k개의 -1
		//.limit(k)	limit으로 k번까지 잘라냄
		//.toArray(); 배열로 다시 변환
	}

	public static void main(String[] args) {
		int[] arr = { 3, 3, 4, 5, 6, 1, 2, 2, 4, 4 };
		solution(arr, 6);
	}
}
