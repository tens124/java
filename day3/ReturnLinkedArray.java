package day3;
//정수가 담긴 배열에서 모든 짝수를 이어붙인 수와 모든 홀수를 이어붙인 수를 합산해서 리턴
public class ReturnLinkedArray {

	public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int i = 0;i<num_list.length;i++) {
        	if(num_list[i]%2==0) {
        		even = even + ""+num_list[i];
        		//문자열로 변환하는 대신, 기존 수에 10을 곱해주며 더하는 것도 가능
        		//3,5,7이 있다 했을 때 357은 300 + 50 + 7
        		//그러니 3 후엔 3에 10을 곱해주고 5를 더하고, 그 후엔
        		//35에 10을 곱해주고 7을 더해주면 됨
        		//int even = 0;
        		//even *=10;
        		//even += num_list[i];
        		//이때 첫 연산은 1의 자리이니 int even의 초기값을 0으로 설정
        	}else {
        		odd = odd + ""+num_list[i];
        	}
        }
        
        answer = Integer.parseInt(odd)+Integer.parseInt(even);
        return answer;
    }
}
