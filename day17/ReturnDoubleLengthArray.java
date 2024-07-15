package day17;

//arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가
//arr에 최소한의 개수로 0을 추가한 배열을 return
public class ReturnDoubleLengthArray {

	public int[] solution(int[] arr) {

		// 2진수로 변환이 필요. 2진수는 2의 0제곱부터 시작해, 길이가 1씩 늘어나게 됨
		// 1이라면 1, 2라면 10,4라면 100, 8이라면 1000, .....
		// 1,2,3,4,...의 순서
		// 그러니 배열의 길이를 이진수로 변환한 후, 한 자리만 더 늘린 1000..을 찾아낸 후
		// 이를 다시 십진수로 변환하면 됨
		// 다만 이 경우엔 10,100,1000 등 2의 거듭제곱인 수들을 처리하는 것이 불가능
		// 100에서 한 자릿수를 더 늘리면 1000이 돼버리기에
		// 검사용 메소드를 하나 더 만들어야 하나?
		String temp = Integer.toBinaryString(arr.length);
		//arr 배열의 크기를 잰 후, 이를 이진수로 변환. 해당 이진수는 문자열
		int length = check((double)arr.length) //배열 크기가 2의 거듭제곱인지 확인
				? arr.length 			//2의 거듭제곱이라면 그대로 이용
				: Double(temp.length());//아니라면 보다 큰 2의 거듭제곱을 이용

		int[] answer = new int[length];	//2의 거듭제곱 크기의 배열을 만든다

		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
			//만들어진 배열에 arr의 원소를 추가. 배열 초기값이 0이니 나머진 신경x
		}

		return answer;
	}

	//arr의 길이가 2의 거듭제곱인지 아닌지 확인하는 메소드
	private boolean check(double length) {

		while (true) {
			
			
			if (length / 2.0 == 1.0 || length == 1.0) {
				//배열 길이가 1이라면 바로 정지해야 하기 때문
				//arr의 길이가 2의 거듭제곱이라면 배열 크기를 그대로 유지
				return true;
			} else if (length / 2.0 < 1.0) {
				return false;
				//아니라면 더 큰 2의 거듭제곱을 찾아냄
				//인트 대신 더블을 사용하는 이유는, 인트의 특성 상 
				//나눗셈을 반복할 시 반드시 1과 0에 도달하기 때문
			}
			
			length/=2.0;
		}

	}

	//2의 i제곱을 계산해주는 메소드
	private int Double(int i) {

		int answer = 1;
		while (i > 0) {
			answer *= 2;
			i--;
		}

		return answer;
		
		
	}
	
	//매우매우 쉬운 풀이법
//	public int[] solution(int[] arr) {
//		int length = 1;
//		
//		while (length < arr.length) {
//			length *= 2;
//		}
//		length라는 변수를 하나 지정 후, 해당 변수가 arr의 크기보다 크거나 같을 때까지 2를 곱해나감
//		
//		return Arrays.copyOf(arr, length);
//		그 후 copyOf 메소드를 이용해 length 길이의 배열에 arr 배열의 내용을 복사 붙여넣기
//		이때 복사할 원래 배열의 자료형을 그대로 따라가기에 자동으로 0이 채워짐
//	}
}
