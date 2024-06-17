package day1;

import java.util.Scanner;

public class PrintChange {
//입력받은 문자열의 대소문자를 바꿔서 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//우선 입력된 문자열을 전부 한 글자씩 떼어둬야 함. 
				//character 클래스에는 문자가 대문자인지 소문자인지 구별하는 메소드가 존재하므로 그걸 사용
				//마침 String 클래스에는 문자열을 통으로 char배열로 전환하는 메소드가 존재
		        //그 후 반복문과 if문을 사용해 해당 문자가 소문자면 대문자로 출력/대문자면 소문자로 출력시키면 된다
		        
//		        String answer = "";
		
//		        Stack <Character> stack = new Stack <> ();
		
//		        for(Character c : a.toCharArray()){
//		               stack.push(Character.toLowerCase(c));
//		                  answer += Character.toLowerCase(c);
//		              }
//		            else if(Character.isLowerCase(c)){
//		                stack.push(Character.toUpperCase(c));
//		                  answer += Character.toUpperCase(c);
//		            }
//		        } 
		        //이것도 좋은 듯. answer이란 문자열을 만들어 변환된 값을 전부 저장
		        //혹은 스택 등을 이용하는 것도 가능
		        
				 Scanner sc = new Scanner(System.in);
			        String str = sc.next();
			        char[] array = str.toCharArray();
			        char c = array[1];
			        for(int i = 0;i<array.length;i++) {
			        	if(Character.isLowerCase(array[i])) {
			        		System.out.print(Character.toUpperCase(array[i]));
			        	}else if(Character.isUpperCase(array[i])) {
			        		System.out.print(Character.toLowerCase(array[i]));
			        	}
			        }
	}

}
