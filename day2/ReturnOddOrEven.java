package day2;

//n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을,
//n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 리턴
public class ReturnOddOrEven {

		int answer = 0;
		//정답이 될(마지막에 리턴될) 변수를 전역변수로 선언

		public int solution(int n) {
		//주어진 정수 n을 받을 메소드. 짝수라면 even 메소드를, 홀수라면 odd 메소드 호출
			return n % 2 == 0 ? even(n) : odd(n);
		}

		int odd(int a) {

			for (int i = 1; i <= a; i++) {
				if (i % 2 == 1)
					answer += i;
				//홀수인 수들을 answer에 전부 합산
			}
			return answer;
		}

		int even(int a) {
			for (int i = 1; i <= a; i++) {
				if (i % 2 == 0)
					answer += i * i;
				//짝수인 수들의 제곱을 answer에 전부 합산
			}
			return answer;
		}

	
	
	//굳이 메소드 여럿을 만들 필요는 없네...
	
	//for(int i = n; i >= 0; i -= 2)
    //answer += (n % 2 == 0) ? i * i : i;
	//아주 쉬운 처리법. i를 2씩 줄여가면서 answer에 각 상황별 결과물을 합산
	//다만...매번 홀짝판별이 반복되게 됨
	
	//if문을 통해 단순하게 계산도 가능. 이 경우엔 제곱끼리의 덧셈 법칙?
	//if (n % 2 == 1) {
    //    return (n + 1) * (n + 1) / 2 / 2;
    //} else {
    //    return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;   
    //}

}
