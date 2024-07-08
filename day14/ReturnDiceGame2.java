package day14;

//두 육면체 주사위를 굴렸을 때 나온 숫자를 각각 a, b
//a와 b가 모두 홀수라면 a^2 + b^2 점
//a와 b 중 하나만 홀수라면 2 × (a + b) 점
//a와 b 모두 홀수가 아니라면 |a - b| 점
//두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 리턴
public class ReturnDiceGame2 {

	public int solution(int a, int b) {
		int answer = 0;
		int temp = a;
		
		if (a < b) {	//더 큰 수를 a에 할당
			a = b;
			b = temp;
		}
		//이 부분 없이 Math.abs(a - b)로 절대값만 구해도 됨

		if ((a + b) % 2 != 0) { // 두 수의 합이 홀수 : 하나는 짝/하나는 홀
			answer = 2 * (a + b);
		} else { 				// 두 수의 합이 짝수
			if (a % 2 != 0 && b % 2 != 0) {	//둘 다 홀수
				answer = a * a + b * b;
			} else {						//둘 다 짝수
				answer = a - b;
			}
		}
		return answer;
	}
}
