package day5;

import java.util.ArrayList;
import java.util.List;

//start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 리턴
public class ReturnCountUp {

	public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        List<Integer> mid = new ArrayList<Integer>();
        
        for(int i=start_num;i<=end_num;i++){
            mid.add(i);
        }
        
        for(int i=0;i<answer.length;i++)
        	answer[i]=mid.get(i);
        
        return answer;
    }
	
//	아주 간결한 풀이
//	for(int i =0; i< end - start+1; i++) {
//        answer[i] = start + i;
//    }
//	뭐 어차피 1씩 늘어나면서 들어오니까. 인덱스 갯수랑 첫 숫자만 잘 설정하면 된다
}
