package day8;

//리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 리턴
public class ReturnCalculatedList {

	public int solution(int[] num_list) {
        int answer = num_list.length>=11?0:1;
        for(int i = 0; i<num_list.length;i++) {
        	answer = num_list.length>=11
        			?answer +num_list[i]
        					:answer *num_list[i];
        }
        return answer;
    }
}
