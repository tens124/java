package day3;

//세 개의 주사위 숫자가 전달될 때, 경우의 수에 따른 연산 값을 리턴
//세 숫자가 모두 다르다면 a + b + c.
//어느 두 숫자는 같고 나머지 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )
//모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )
public class ReturnThreeDice {

	public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && b == c && a == c) {
        	answer = (a + b + c) * (a*a*a + b*b*b + c*c*c ) * (a*a + b*b + c*c );
        }else if(a != b && b != c && a != c) {
        	answer = a + b + c;
        }else {
        	answer = (a + b + c) * (a*a + b*b + c*c );
        }
        return answer;
    }
}

//private int pow(int a, int b) {
//	  if(b == 0) return 1;
//	  return a * pow(a, b-1);
//}
//새로운 메소드 pow를 제작
//두 개의 정수를 매개변수로 받고, 두 번째 수가 0이라면 1을 리턴
//다른 경우엔 스스로를 호출하는 재귀함수 작동
//a가 5고,b가 3인 경우
//5 * pow(5,2)
//=>5*5*pow(5,1)
//=>5*5*5*pow(5,0)
//=>5*5*5*1
//=125
//즉, a를 b번 제곱하는 메소드임을 확인 가능


//public int solution(int a, int b, int c) {
//    int answer = 1;
//
//    int count = 1;
//    if(a == b || a == c || b == c) {
	  //두 개의 수가 같을 경우
//        count++;
//    }
//
//    if(a == b && b == c) {
	  //모든 수가 같을 경우
//        count++;
//    }
//
//    for(int i = 1; i <= count; i++) {
//        answer *= (pow(a,i)+pow(b,i)+pow(c,i));
//    }

//	  문제를 생각해보자. 각 케이스마다 (a제곱+b제곱+c제곱),(a세제곱+b세제곱+c세제곱)을 곱해주고 있다
//	  따라서 해당 문제를 풀기 위해선 각각의 경우의 수를 순서대로 정렬해 두고
//	  연산을 몇 번 더 수행할 것인지 지정해주는 수 count가 올라가도록 해주면 된다
//	  그 후 위에서 만든 pow 메소드를 적용시킨 후 이 값을 answer에 쌓아주면 끝
//
//    return answer;
//}
