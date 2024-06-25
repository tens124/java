package day8;

//numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 
//이때까지 더했던 원소들의 합을 리턴
public class ReturnPlusList {
	public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int num : numbers) {
        //for(int i = 0; answer <= n; i++)
        //for문의 조건식을 변형해서 사용하는 것도 가능
        	answer+=num;
        	if(answer>n) break;
        }
        return answer;
    }

}
