package day1;

import java.util.Scanner;

public class PrintRepeat {
//입력받은 문자열을 입력받은 횟수만큼 반복해서 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
       if(str.length()>=1 && str.length()<=10 && n>=1 && n<= 5){
	            for(int i = 1;i<=n;i++)
	                System.out.print(str);
	        }
	}

}
