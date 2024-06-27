package day9;

import java.util.Arrays;

//알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 

//my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, 
//my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 
//순서대로 담은 길이 52의 정수 배열을 리턴

public class ReturnCount {

	public static int[] solution(String my_string) {
		int[] answer = new int[52];
		// 초기화된 int 배열의 경우 모든 원소의 값이 0이 됨
		char[] string = my_string.toCharArray();
		Arrays.sort(string);
		// 문자열을 char배열로 바꾼 후 오름차순 정렬
		// 그 후 배열의 앞부분부터 char로 변환한 글자와 일치하는지 확인 후
		int n = 0;
		// 일치한다면 n에 +1. 해당 글자에 해당하는 answer칸에 n을 계속 집어넣음
		// 그 후 이전 글자와 달라지는 시점이 오면 n을 0으로 초기화하자
		int j = 0;
		for (int i = 0; i < string.length; i++) {
			for (j = 65; j <= 122; j++) {
				if ((int) string[i] == j) {
				// 으음...우선 char를 int형으로 강제변환. A~Z : 65~90/a~z : 97~122
					n++;
					//그 후 j와 일치한다면, 즉 그 글자가 맞다면 n에 +1
					break;
					//강제 종료를 통해 j값을 그대로 보존
				}

			}
			j = j < 97 ? j - 65 : j - 71;
			//ABC...과 abc...은 아스키코드 상 이어지지 않음. 따라서 이렇게 해줘야 함
			//ABC...abc...의 경우 A는 0번 인덱스,a는 26번 인덱스
			if (i > 0 && string[i] != string[i - 1]) {
			//앞과 뒤가 서로 다른 원소일 때 n을 초기화
				n = 1;
				//이때 n++ 코드를 이미 모두 지나온 시점. n을 0으로 초기화하면
				//answer[j] = n;에 0이 들어갈 수밖에 없음. 따라서 1로 초기화
			}
			answer[j] = n;
			//j는 배열에 맞는 형태로 편집된 상태
			System.out.println(n);
		}
		return answer;
		
//		훨씬 쉬운 방법
//		int[] answer = new int[52];
//        for(int i = 0; i < my_string.length(); i++){
//            char c = my_string.charAt(i);
//			  my_string의 i번 글자를 c로 지정
//            if(c >= 'a')
//			  char형의 경우 대소비교가 가능. 아스키코드로 자동변환
//			  A는 80번, a는 97번. 즉 c가 소문자라면
//                answer[c - 'a' + 26]++;
//				  c에서 97을 뺀 후, 26을 더해줌
//				  왜 26인가? 배열 위치 상 소문자는 26번 인덱스에서 시작하기 때문
//				  c가 a라면 26번 인덱스에 +1을, b라면 27번 인덱스에 +1을 해주는 것
//            else
//                answer[c - 'A']++;
//				  c가 대문자인 경우엔. 대문자는 0번 인덱스에서 시작하니 다른 조치 X
//        }
		
//		또 다른 해법
//		for(char ch: my_string.toCharArray()) {
//		my_string을 앞에서부터 한 글자씩 떼어 ch에 저장
//            answer[ch - 'A' - (Character.isLowerCase(ch)?6:0)]++;
//			  char형 문자끼리의 산술 계산 시 자동으로 int로(아스키코드로) 변환됨(X)
//			  char형 문자끼리의 산술 계산 시 유니코드를 이용. 문자마다 정해진 유니코드가 존재
//			  ch에서 65(유니코드 상 A값)를 뺀 후, ch가 소문자라면 6을, 대문자라면 0을 추가로 빼준다
//			  왜 6인가? ABC...abc 배열을 생각해보자. a는 26번임
//			  이때 a를 유니코드로 변환 시 97이 된다. 97-65를 계산하면 32. 추가로 6을 빼줘야 맞음
//			  그 후 해당 숫자를 인덱스넘버로 삼아 answer의 해당 칸에 +1
//        }
	}

	public static void main(String[] args) {
		solution("Programmers");
	}

}
