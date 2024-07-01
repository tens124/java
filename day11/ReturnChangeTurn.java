package day11;

import java.util.Arrays;

//num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 
//n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 리턴

//예시
//num_list : [5, 2, 1, 7, 5]	n : 3	answer : [7, 5, 5, 2, 1]
//3번 인덱스부터 끝부분까지 앞에 입력됨. 7,5
//그 후 0번 인덱스부터 2번 인덱스까지를 입력. 5,2,1
//num_list : [2, 1, 6]	n : 1	answer : [1, 6, 2]
//1번 인덱스부터 끝부분까지 앞에 입력됨. answer[0]=num_list[1]/answer[1]=num_list[2]
//그 후 0번 인덱스를 입력. answer[2]=num_list[0]
public class ReturnChangeTurn {

	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		
		//그냥 앞 배열과 뒷 배열을 만든 후 서로 바꿔치기해버림
		int[] answer1 = Arrays.copyOfRange(num_list, 0, n);
		//[2]
		int[] answer2 = Arrays.copyOfRange(num_list, n, num_list.length);
		//[1,6]
		
		for(int i = 0;i<answer2.length;i++) {
			int temp = answer2[i];
			answer[i]=temp;
		}
		for(int i =answer2.length,j=0;i<num_list.length;i++) {
			int temp = answer1[j++];
			answer[i]=temp;
		}
		for(int i = 0;i<answer.length;i++) {
		}
		
		return answer;
	}
	
//	또 다른 풀이법
//	public int[] solution(int[] num_list, int n) {
//        int length = num_list.length;
//        int[] answer = new int[length];
//        
//        for (int i = 0; i < length; i++) {
//            answer[(i + n) % length] = num_list[i];
//		 	  (i + n) % length은 이 순서대로 작동하게 된다
//			  n%length/(n+1)%length/(n+2)%length ...
//			  n은 항상 length보다 작기에, 0,1,2,...인덱스에 차례대로 num_list[i]가 입력
//			  그 후 n = length가 되어 나머지가 0이 되는 순간이 오게 됨. 
//			  그때부터는 앞칸부터 num_list[i]가 입력된다
//			  n을 기점으로 회전하는 코드가 완성됨
//        }
//        
//        return answer;
//    }

	public static void main(String[] args) {
		int[] arr = { 1,2,6 };
		ReturnChangeTurn rt = new ReturnChangeTurn();
		rt.solution(arr, 1);
	}
}
