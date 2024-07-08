package day14;

//각 인덱스에 문자열을 가지고 있는 배열 strArr
//배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 
//남은 문자열을 순서를 유지하여 배열로 리턴
public class RetrunExceptAD {

	public String[] solution(String[] strArr) {

		int cnt = 0;

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].indexOf("ad") == -1) {
				cnt++;
			}
		}

		String[] answer = new String[cnt];

		for (int i = 0,j=0; i < strArr.length; i++) {
			if (strArr[i].indexOf("ad") == -1) {
				answer[j] = strArr[i];
                j++;
			}
		}
		return answer;
		
		//stream을 이용한 풀이법
		// return Arrays.stream(strArr)
		//stream으로 변환->배열의 각 요소에 접근 가능
		//.filter(s -> !s.contains("ad"))
		//stream.filter로 배열의 각 요소 s 중 ad를 포함하지 않는 원소를 제거함
		//.toArray(String[]::new);
		//필터링된 요소들을 새로운 문자열 배열로 변환
		//toArray 메서드는 스트림의 요소를 배열로 변환하는 데 사용되며, 
		//여기서 String[]::new는 새로운 문자열 배열을 생성하는 생성자 레퍼런스
	}
}
