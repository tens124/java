package day9;

import java.util.ArrayList;

//1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 리턴
public class ReturnMakeArray4 {

	public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = k; i<=n;i+=k) 
        	answer.add(i);
        return answer;
    }
	
	//다른 풀이법
//	  int count = n / k;
//	  1부터 n 사이의 k의 배수가 몇 개인지 구하는 방법. int형이니 소수점은 자동으로 삭제
//
//    int[] answer = new int[count];
//	  count를 통해 배열의 크기를 간단하게 설정 가능
	
//    for (int i = 1; i <= count; i++) {
//        answer[i - 1] = k * i;
//    }
//	  k의 배수는 결국 k에 1,2,3,...을 곱한 것. 따라서 1부터 시작하는 i를 설정 후
//	  배열의 크기를 벗어나지 않도록 해주면 된다
}
