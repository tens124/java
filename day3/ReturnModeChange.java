package day3;

//주어진 문자열 code를 mode의 상태에 따라 바꾼 후 리턴
//idx는 0부터 시작해 code의 길이 - 1까지 증가

//mode가 0일 때
//code[idx]가 "1"이 아니면 idx가 짝수일 때만 answer의 맨 뒤에 code[idx]를 추가
//code[idx]가 "1"이면 mode를 0에서 1로

//mode가 1일 때
//code[idx]가 "1"이 아니면 idx가 홀수일 때만 answer의 맨 뒤에 code[idx]를 추가
//code[idx]가 "1"이면 mode를 1에서 0으로
//mode는 0으로 시작하며, answer가 빈 상태라면 "EMPTY"라는 문자열 리턴
public class ReturnModeChange {

	public static void main(String[] args) {
		System.out.println(Sample.solution("abc1abc1abc"));
	}

}

class Sample {

	public static String solution(String code) {
		String answer = "";
		int mode = 0;

		for (int idx = 0; idx < code.length(); idx++) {
			if (mode == 0) {

				if (code.toCharArray()[idx] != "1".charAt(0)) {

					// idx%2==0?answer +=code.toCharArray()[idx]:answer+="";
					if (idx % 2 == 0) {
						answer += code.toCharArray()[idx];
						//인덱스가 8일 땐 정상적으로 작동해야 하는데, 왜 안될까?
						//모드도 0인 상황. 뭐때문에 아무 동작 없이 지나쳐버리지?
						//확인 결과 인덱스가8,글자가 a,모드가 0인데도 
						//글자는 1로, 모드는 1로 인식 중
						//아....쓸데없이 idx++를 해놔서 그랬구나
					}

				} else {
					mode = 1;
				}

			} else { // mode가 1일 때
				if (code.toCharArray()[idx] != "1".charAt(0)) {
					if (idx % 2 == 1) {
						answer += code.toCharArray()[idx];
					}

				} else {
					mode = 0;
				}

			}
		}
		
		if(answer == "") {
			answer = "EMPTY";
		}
		return answer;
	}

}

//매우 좋은 해답
//class Solution {
//    public String solution(String code) {
//        StringBuilder answer = new StringBuilder();
//        int mode = 0;
//        for (int i = 0; i < code.length(); i++) {
//            char current = code.charAt(i);
			  //문자열에서 현재 인덱스에 존재하는 문자를 current로 설정
//            if (current == '1') {
			  //char형은 "" 대신 ''를 사용해서 생성 가능
//                mode = mode == 0 ? 1 : 0;
			  //mode는 현재 문자가 1일 때 조건문을 확인하도록 설정되어 있음
			  //현재 문자가 1일 때 mode가 0이라면 1로, 아니라면 0으로 변환
//                continue;
//            }
//
//            if (i % 2 == mode) {
			  //문제의 핵심 의도를 정확히 꿰뚫은 문장
			  //나머지를 0 혹은 1로 설정하는 대신 mode의 값으로 지정하여 홀짝을 판별
			  //문제를 생각해보자. mode가 0일 때는 idx가 짝수일 때
			  //mode가 1일 때는 idx가 홀수일 때 해당 문자를 이어붙이도록 설정 중
			  //이때 짝수는 2로 나눴을 때 나머지가 0, 홀수는 나머지가 1인 수를 말함
			  //즉 mode의 값이 힌트가 됐던 것
//                answer.append(current);
//            }
//        }
//        return answer.length() == 0 ? "EMPTY" : answer.toString();
		  //마지막 관문. answer의 길이가 0이라면 EMPTY를, 아니라면 완성된 문자열을 리턴
//    }
//}


