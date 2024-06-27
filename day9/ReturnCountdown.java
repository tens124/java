package day9;

//start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 리턴
public class ReturnCountdown {
	public int[] solution(int start, int end_num) {
		int count = start - end_num + 1;
		int[] answer = new int[count];
		for (int i = 0; i < count; i++)
			answer[i] = start--;
		return answer;
	}

}
