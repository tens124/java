package day1;

import java.util.Scanner;
//홀수와 짝수를 구분해 출력
public class PrintEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //삼항연산자를 이용하면 더욱 쉬움
        // System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
        //1항?2항:3항
        //1항이 참이라면 2항이, 거짓이라면 3항이 적용됨
        
        
        if(n%2 == 0){
            System.out.print(n + " is even");
        }else{
            System.out.print(n + " is odd");
        }

	}

}
