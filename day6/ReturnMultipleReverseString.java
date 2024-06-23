package day6;

//문자열 my_string과 이차원 정수 배열 queries
//queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미
//my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 리턴
public class ReturnMultipleReverseString {

	public String solution(String my_string, int[][] queries) {
		String answer = "";
		char[] string = my_string.toCharArray();
		char[] string2 = my_string.toCharArray();
		// 초기화시점을 잘 정하는 것이 중요하다. for문 안에서만 쓰인다고 for문 안에 두면
		// 반복시기마다 계속해서 초기화됨

		// 우선 queries의 원소들을 전부 확보
		for (int[] query : queries) {
			char abc = '0';
			int j = query[1];	//for문 바깥에서 설정 후 증감자를 통해 for문 안에서 제어
			for (int i = query[0]; i <= query[1]; i++) {
				abc = string2[j];	//뒤에서부터 순차적으로 문자를 저장
				string[i] = abc;	//뒤쪽에서 저장된 문자를 앞에서부터 순차적으로 저장
				j--;
			}

			for (int i = 0; i < string.length; i++) {
				abc = string[i];
				string2[i] = abc;
				//string과 string2를 일치시켜주는 작업. 이렇게 해야 정상적인 교환이 가능해짐
			}
		}
		for (int i = 0; i < string.length; i++) {
			answer = answer + string[i];
			//마지막으로 answer에 완성된 문자열을 저장
		}

		return answer;
	}
}
//  새로운 메소드를 제작하는 풀이법

//	class Solution {
//
//	    char[] arr;
//		전역변수 선언

//	public String solution(String my_string, int[][] queries) {
//
//        arr = my_string.toCharArray();
//		  입력된 문자열을 배열로 변환
//
//        for (int[] query : queries) {
//            reverse(query[0], query[1]);
//			  새로 제작한 메소드 호출
//        }
//
//        return new String(arr);
//		  이렇게 하면 char배열을 string객체 생성에 사용 가능
//    }
//
//    private void reverse(int s, int e) {
//        while (s < e) {
//		  s=0,e=4를 예로 들어보자
//		  문자열은 abcde
//            char temp = arr[s];
//			  자리바꾸기를 위한 제3변수
//			  arr은 전역변수이며, solution메소드에서 정의된 바를 따라감
//            arr[s++] = arr[e];
//			  while문의 진행에 따라 변화. ++를 뒤에 넣으면 연산이 끝난 후에 1이 추가됨
//			  인덱스 0번에 인덱스 4번의 글자가 삽입됨. 그 후 s가 1 증가. ebcde
//            arr[e--] = temp;
//			  while문의 진행에 따라 변화. --를 뒤에 넣으면 연산이 끝난 후에 1이 차감됨
//			  인덱스 4번에 위에서 따로 설정해 둔, 인덱스 0번의 글자가 삽입됨. 그 후 e가 1 감소. ebcda

//			  두 번째 루프에선 s=1,e=3으로 시작
//			  temp에 arr[1]이 저장된 후, arr[1]에 arr[3]이 저장되고 s가 1 증가. edcda
//			  arr[3]엔 temp가 저장되고, e는 1 감소. edcba
//			  세 번째 루프에 진입할 차례가 되면 s=2,e=2으가 되어 조건 불충족. 따라서 루프 종료

//			  모든 인덱스를 조회하지 않고도 원하는 코드가 완성되었음
//	    	  앞의 문자들을 뒤로, 뒤의 문자들을 앞으로

//        }
//	}
