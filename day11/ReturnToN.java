package day11;

import java.util.Arrays;

//num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 리턴

public class ReturnToN {

	public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n+1);
    }
}
