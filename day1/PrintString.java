package day1;

import java.util.Scanner;

public class PrintString {
//입력받은 문자열 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.length()>=1 && a.length()<=1000000)
        System.out.println(a);
	}

}
