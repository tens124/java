package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//6면체 주사위 네 개의 눈 a,b,c,d
//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p 획득
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점 획득
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 획득
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점 획득
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수 획득
//최종적으로 얻는 점수를 리턴
public class ReturnDiceGame1 {

	public static int solution(int a, int b, int c, int d) {
		int answer = 0;

		int[] dice = { a, b, c, d };
		int count = 0;
		List<Integer> eye = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			if (dice[i] == a) {
				count++;
				// a와 같은 수가 나올 때마다 1씩 오름
			}
			eye.add(dice[i]);
			// eye 리스트에 a,b,c,d를 담음
		}

		int min = Collections.min(eye);
		// a,b,c,d 중 최소값을 구함
		while (eye.remove(Integer.valueOf(a))) {
			// eye리스트에서 a를 전부 삭제
			// remove()메소드의 매개변수로 Object를 받게 되면 리스트에서 가장 앞에 있는
			// 매개변수와 일치하는 값을 삭제한 후,논리값을 리턴하게 됨
			// 해당 원소를 삭제에 성공하면 true,실패하면 false 리턴
			// while문의 내용이 없기 때문에 메소드 실행만 이루어짐. 더 이상 없으면 탈출
		}
		;
		int p = a;	//같은 수가 있을 때 그 중복값을 의미
		int q = 0;	//세 수가 같을 때 홀로 다른 값을 의미
		if (eye.size() == 1)
		{
			q = eye.get(0);
		}
		int z = 0;	//두 개의 수가 같을 때
		int x = 0;	//두 개의 수가 같을 때
		if(eye.size()==2) {
			z = eye.get(0)==eye.get(1)?a:eye.get(0);
			x = eye.get(1);
			//남은 두 수가 같다면 a와 다른 수를, 다르다면 그 둘을 곱하도록
		}
		System.out.println(z);
		System.out.println(x);

		switch (count) {
		case (1): // a와 같은 수가 없을 때
			//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수 획득
			answer = min;
			// answer = 최소값
			break;
		case (2): // a와 같은 수가 둘
			//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 획득
			//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점 획득
			
			// answer = (p + eye.get(0))*Math.abs((a - eye.get(0)));
			// q를 따로 지정하지 않고 eye에서 직접 꺼내쓰게 되면 오류가 발생함
			// 위의 코드에서 a값을 eye에서 전부 삭제했는데, 이때 주사위 눈이 모두 같다면
			// eye라는 리스트가 텅 비어버림. switch문에 if문을 따로 주지 않았기에
			// 해당 코드를 지나면서 오류가 발생하는 것. 다만 4321 역순으로 사용하면 극복될 듯
			// Math.abs()로 절대값을 구할 수 있음

			if(eye.size()==2) {
				answer = a==z?(z + x) * Math.abs(z - x):z*x;
			}
			// answer = (p + q) × |p - q|
			break;
		case (3): // a와 같은 수가 셋
			//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점 획득
			answer = (10 * p + q) * (10 * p + q);
			// answer = (10 × p(같은 수) + q(다른 수))^2
			break;
		case (4): // a와 같은 수가 넷
			//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p 획득
			answer = 1111 * a;
			break;
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(2, 1, 1, 1);
	}
}
