package day11;

import java.util.Arrays;

//n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 리턴
//n번째 원소를 배열에 적용시키려면 -1을 해줘야 함
public class ReturnFromFirstIndex {

	public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}
