package day1;

//한 문자열의 특정 위치에 다른 문자열을 덮어씌운 후 리턴
public class ReturnOverwrite {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        //두 개의 배열을 만들어보자. {H,e,1,1,o,W,o,r,1,d}와 {l,l,o,W,o,r,l}
        //각 배열의 크기는 10과 7. 이때 주어진 숫자 s는 2. 앞 배열의 인덱스 2부터 뒷 배열 출력
        //1122222221와 같은 형태. 7개의 문자가 대체되고, H,e,마지막 l만이 살아남음
        //0,1까진 앞 배열의 문자를 저장/2부터 뒷 배열의 문자를 저장/마지막 문자는 앞 배열 문자 저장
        //0~1는 앞 배열/2~8는 뒷 배열/9는 앞 배열. 이때 8은 주어진 숫자 2에 뒷 배열의 길이 7을 더하고 1을 빼준 값
        char[] array1 = my_string.toCharArray();
		char[] array2 =  overwrite_string.toCharArray();
		
		for(int i = 0;i<array1.length;i++) {
			if(i>=s //2 이상 8 이하
			&& i<=(s + array2.length -1)) {
				answer += array2[i-s];		//i가 2일 때부터 2번째 배열을 저장하기 시작하는데,
										//이때 2번째 배열의 첫 인덱스부터 저장해야 하기 때문에 
										//주어진 인덱스넘버 2를 빼줘야 함
			}else {
				answer += array1[i];
			}
		}
        
        //for (int i=0; i<overwrite_chars.length; i++) {
        //    my_chars[s + i] = overwrite_chars[i];
        //}
        //이렇게 배열의 원소를 직접 대체해도 가능. s+i번 인덱스의 값들만 변환됨
        
        return answer;      
        
        //굉장히 쉬운 답안
        //String before = my_string.substring(0, s);
        //매개변수가 두 개인 substring 메소드는 앞에 지정된 수 ~ 뒤에 지정된 수 앞 번호까지만 남김
        //따라서 0번 인덱스 ~ 1번 인덱스인, He가 before에 저장됨
        //String after = my_string.substring(s + overwrite_string.length());
        //매개변수가 하나인 substring 메소드는 주어진 문자열에서 매개변수로 주어진 값에 해당하는 인덱스를 포함하여 문자열의 끝까지 남김. s가 2이니 2 + 7 = 9. my_string의 9번 인덱스에는 d가 있음. 여기서 끝까지인 d가 after에 저장됨
        //return before + overwrite_string + after;
        //He + lloWorl + d가 리턴된다
    }
}