package day1;

public class PrintSign {
//특수문자를 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("!@#$%^&*(\\'\"<>?:;");
		//문자열 이스케이프를 사용. 특수문자 중 " 등은 "" 안에 넣어서 출력하는 것이 어려움
		//이럴 때 백슬래쉬\를 출력할 문자열 앞에 넣어주면 \는 인식되지 않고,
		//해당 문자는 특수문자가 아닌 일반적인 문자로 인식됨. \ 또한 마찬가지. \는 이외에도 다양한 용도로 사용됨
	}

}
