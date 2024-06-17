package day1;

import java.util.Scanner;

public class PrintCombineString {
//입력받은 두 개의 문자열을 서로 이어 출력
//입력은 한 번만 받고, 스페이스(공백)을 통해 구분하는 것도 좋음	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(a+b);
        
        //두 번 입력 대신 한 번 입력된 두 개의 문자열을 스페이스(공백)로 구분하는 상황은?
        //스페이스바가 눌리는 순간을 무시한다면? 혹은 스페이스를 특수한 문자로 인식시킨 후 그것만 제거한다면?
        //자바스크립트는 해당 기능을 매우 쉽게 처리 가능. 
        //window.event.keyCode == 32로 스페이스바가 눌리는 순간을 인식시킬 수 있음. 이처럼 window 객체에 기본적으로 포함되어 있기에 키코드 값만 알면 처리가 가능해짐
        //자바에서 키 이벤트를 적용시키는 것은 조금 어려움. 방법을 찾아봐야겠음
        
        //버퍼리더를 사용하는 방법도 있음
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print(br.readLine().replaceAll(" ", ""));
        //버퍼리더의 경우에는 스페이스바(공백)도 인식됨. 그 후 문자열에 존재하는 모든 공백을 지워주면 된다
	}

}
