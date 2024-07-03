package day12;

//arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 
//50보다 작은 홀수라면 2를 곱하고 다시 1을 더함
//이러한 작업을 x번 반복한 결과인 배열 arr(x)
//arr(x) = arr(x + 1)인 x가 항상 존재. 이러한 x 중 가장 작은 값을 리턴
//두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미
//즉, 같은 배열임을 의미함. 작업을 한 번 더 해도 변하지 않는 종착지점을 찾아라
//모든 원소가 50 미만의 짝수이며, 50 이상의 홀수라면 해당 조건을 만족

public class ReturnChangeArray {

	public static int solution(int[] arr) {
		int answer = 1;

		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] /= 2;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					arr[i] = arr[i] * 2 + 1;
				}
			}

			boolean condition = false;

			for (int i = 0, j = 0; i < arr.length; i++) {
				if ((arr[i] < 50 && arr[i] % 2 == 0) || (arr[i] >= 50 && arr[i] % 2 != 0)) {
					j++;
					if (j == arr.length)
						condition = true;
				}
			}

			if (condition)
				break;
			answer++;

		}

		return answer == 1 ? 0 : answer;
		//answer++의 위치가 굉장히 중요함. 0번 반복되는 경우엔 answer에 0이 저장돼야 한다
		//이때 if문의 break로 인해 컨트롤이 쉽지 않음.. 따라서 이런 식으로 처리
		
	}
	
//		또 다른 풀이
//		class Solution {
//		    public int solution(int[] arr) {
//		        return Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
//		    }
	//Arrays.stream(arr)       // 배열 'arr'을 스트림으로 변환
	//.map(i -> cntAction(i))  // 스트림의 각 요소에 대해 'cntAction(i)' 함수를 적용하여 새로운 스트림을 생성
	//.max()                   // 새로운 스트림의 최대값을 찾는다
	//max() 메소드는 OptionalInt 객체를 반환
	//OptionalInt는 값이 없을 수도 있는 정수형 값을 나타내는 객체. 값이 없으면 예외를 던짐
	//NullPointerException, 즉 null상황을 이용하는 것보다 정교한 처리가 가능해짐
	//또한 OptionalInt의 존재만으로 값이 없는 상황이 발생 가능하다는 것을 인지할 수 있음
	//.getAsInt();             // OptionalInt 객체에서 값을 꺼내어 int 타입으로 반환
	
	//즉, 이 코드는 배열의 모든 원소에 cntAction() 메소드를 적용시킨 후의 배열에서 최대값을 찾는 코드
	
	//cntAction(int n) 메소드는 전달 받은 숫자에 else/else if/else문을 적용시킴
	//이 코드는 해당 숫자가 50 이하인 짝수/50 초과인 홀수가 아닐 때까지 반복됨
	//이 반복횟수를 저장한 cnt 변수를 리턴하게 된다
	
	//즉, 문제에서 주어진 arr 배열의 각 원소에
	//문제에서 제시한 행동을 x 차례 반복한 후
	//그 x값을 담아 리턴하여 새로운 배열을 만들게 되는 것
	
	//문제에서 제시한 행동은 arr 배열의 모든 원소가 더 이상 변하지 않을 때까지 반복하게 되어 있음
	//따라서 cnt값 중 가장 큰 값을 탐색하는 것
	//왜 최대값인가? [31, 2, 63, 51, 99, 99]라는 상황을 가정해보자
	//이 형태의 배열은 4번 반복된 상황임. 한 번 더 변화가 가능함
	//5번째 반복 : [63, 2, 63, 51, 99, 99]
	//이때 0번째 인덱스 말고는 그 어떤 값도 변하지 않았음.
	//즉, 1/2/3/4/5번 인덱스의 cnt값은 4에서 멈춘 상황
	//하지만 0번 인덱스의 cnt값은 5가 된다
	//이처럼 다른 원소가 반복을 끝마친 후에도 변화하는 원소의 cnt값을 추적하는 게 올바른 풀이법
	
//		    private int cntAction(int n) {
//
//		        int cnt = 0;
//		        boolean flag = true;
//
//		        while (flag) {
//
//		            if (n % 2 == 0 && 50 <= n) {
//		                n /= 2;
//		                cnt++;
//		            } else if (n % 2 == 1 && n < 50) {
//		                n *= 2;
//		                n += 1;
//		                cnt++;
//		            } else {
//		                flag = false;
//		            }
//		        }
//		        return cnt;
//		    }
//		}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		solution(arr);
	}

}
