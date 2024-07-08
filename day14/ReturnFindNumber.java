package day14;

import java.util.Arrays;

//정수 리스트 num_list와 찾으려는 정수 n
//num_list안에 n이 있으면 1을 없으면 0을 리턴
public class ReturnFindNumber {

	public int solution(int[] num_list, int n) {
        int answer = 0;
        
        for(int i = 0;i<num_list.length;i++) {
        	if(num_list[i]==n)
        		answer = 1;
        }
        return answer;
    }
}
