package day5;

import java.util.ArrayList;
import java.util.List;

//모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, 
//x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 
//언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 한다.
//위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라 한다
//계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 확인되었음
//임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 리턴

public class ReturnCollatzSequence {

	public List<Integer> solution(int n) {
		List<Integer> answer = new ArrayList<>();

		// x가 짝수라면 x=x/2를
		// x가 홀수라면 x=3*x+1을 수행하는 메소드를 호출
		// 이때 두 경우 모두 x가 1이 되면 끝나도록 처리
		// x는 자연수여야 한다.

		for (;;) {	//무한반복
					//초기값,조건식,증감식 모두 쓰지 않거나
					//조건식만 비워두거나 하면 무한루프가 가능해짐
								
			//다만 조건식을 >=로 만드는 것도 방법
			//이 경우는 끝지점을 모르니 while문을 사용해야 함
//			while (n >= 1) {
//	            arrayList.add(n);
//
//	            if (n == 1) break;
//
//	            if (n % 2 == 0)
//	                n = n / 2;
//	            else 
//	                n = 3 * n + 1;
//	        }
			answer.add(n);
			if (n == 1)
				break;
			//break가 작동할 지점을 잘 정해줘야 한다. 
			//n의 초기값과 마지막 1을 모두 포함시키려면 여기로
			if (n % 2 == 0) {
				n = even(n);
			} else {
				n = odd(n);
			}
			
		}

		return answer;
	}

	// 짝수일 경우 호출되는 메소드
	// 2로 나눈 값을 리턴
	public int even(int n) {

		n /= 2;

		return n;
	}

	// 홀수일 경우 호출되는 메소드
	// 3 * x + 1을 리턴
	public int odd(int n) {
		n = 3 * n + 1;

		return n;
	}

	// 재귀함수가 기억나지 않는 관계로 샘플을 하나 작성해보겠다
	// 임페리얼을 가장 많이 접하는 듯. 5!=5*4*3*2*1을 수행하는 재귀함수를 작성해보자
	public static int repeat(int n) {
		int e = 1;
		if (n > 1) {
			e = n * repeat(n - 1);
		}

		return e;
	}

	public static String repeat1(int n) {
		String s = "";
		int e = 1;
		for (int i = n; i > 1; i--) {
			e *= i;
			s = s + i + "*";
		}
		s = s + "1=" + e;

		return s;
	}

	public static void main(String[] args) {
		ReturnCollatzSequence rs = new ReturnCollatzSequence();
		System.out.println(rs.solution(100));
	}
}

//return IntStream.concat(
//        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
//        IntStream.of(1))
//.toArray();
//람다식을 쓰면 굉장히 축약됨
