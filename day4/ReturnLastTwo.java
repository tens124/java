package day4;

// 정수 배열의 마지막 원소가 그전 원소보다 크면
//해당 배열에 마지막 원소에서 그전 원소를 뺀 값을 추가
//마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 리턴
public class ReturnLastTwo {

	public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length+1];
        //배열의 크기를 제공받은 배열보다 1 크게 설정
        
        for(int i = 0;i<num_list.length;i++) {
        	answer[i]=num_list[i];
        }
        answer[num_list.length]=
        //배열의 끝 인덱스 번호는 해당 배열 크기 - 1. 
        		num_list[num_list.length-1]>num_list[num_list.length-2]
        				?num_list[num_list.length-1]-num_list[num_list.length-2]
        						:2 * num_list[num_list.length-1];
        
        return answer;
    }
}
