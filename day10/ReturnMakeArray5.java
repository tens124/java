package day10;

//정수 배열 arr와 2개의 구간이 담긴 배열 intervals
//intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간
//닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미
//arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 리턴
public class ReturnMakeArray5 {

	 public int[] solution(int[] arr, int[][] intervals) {
		 	int a1 = intervals[0][0];
		 	int a2 = intervals[0][1];
		 	int b1 = intervals[1][0];
		 	int b2 = intervals[1][1];
		 	
	        int[] answer = new int[(a2-a1)+(b2-b1)+2];
	        int j =0;
	        
	        for(int i = a1;i<=a2;i++) {
	        	answer[j++]=arr[i];
	        }
	        for(int i = b1;i<=b2;i++) {
	        	answer[j++]=arr[i];
	        }
	        return answer;
	    }
}
