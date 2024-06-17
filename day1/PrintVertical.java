package day1;

import java.util.Scanner;

public class PrintVertical {
//입력받은 문자열을 수직으로 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0;i<a.toCharArray().length;i++) {
        	System.out.println(a.toCharArray()[i]);
            
            //향상된 for문을 이용한 방법. char배열로 변환된 a문자열의 원소 하나하나를 ch라는 변수에 저장 후 println을 이용하여 출력하면 됨
            //for (char ch : a.toCharArray())
            //System.out.println(ch);
        }
	}

}
