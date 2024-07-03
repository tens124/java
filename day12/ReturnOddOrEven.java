package day12;

//가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 리턴
//동일하다면 그 값을 리턴
public class ReturnOddOrEven {
	 public int solution(int[] num_list) {
	        int answer = 0;
	        int odd = 0;
	        int even = 0;
	        
	        for(int i = 0;i<num_list.length;i++) {
	        	if(i%2==0) {
	        		odd+=num_list[i];
	        	}else {
	        		even+=num_list[i];
	        	}
	        }
	        //첫 인덱스를 1로 설정했기에 짝수와 홀수를 반대로 설정
	        
	        answer = odd>=even?odd:even;
	        
	        return answer;
	    }

}
