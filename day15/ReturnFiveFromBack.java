package day15;

import java.util.Arrays;

//num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 리턴
public class ReturnFiveFromBack {
	public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        
        Arrays.sort(num_list);
        for(int i = 0 ;i<5;i++) {
        	answer[i]=num_list[i];
        }
        
        //for문 대신 메소드 이용도 가능
        //Arrays.copyOfRange(num_list, 0, 5);
        
        return answer;
    }

}
