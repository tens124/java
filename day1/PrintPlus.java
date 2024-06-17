package day1;

import java.util.Scanner;

public class PrintPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //c를 따로 사용하는 대신 a + " + " + b + " = " +(a+b)도 가능
        
        //System.out.printf("%d + %d = %d",a,b,a+b);도 가능
        //printf와 %의 조합으로 다양한 동작을 수행 가능
        //printf() 함수의 f는 formatted의 약자이며, 서식화된 출력을 지원한다는 의미
        //이 함수는 출력할 데이터를 어떤 서식에 맞춰 출력할지 서식 지정자(format specifier)를 통해 직접 지정할 수 있음
        //그 중 %d는 int형 데이터를 의미. %d의 갯수만큼 뒤에 쉼표를 넣어 데이터를 넣어줄 수 있음
	}

}
