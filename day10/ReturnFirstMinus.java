package day10;

//num_list에서 첫번째로 등장하는 음수의 인덱스를 리턴. 음수가 없다면 -1 리턴
public class ReturnFirstMinus {

	public int solution(int[] num_list) {
        int answer = -1;
        
        for(int i = 0; i<num_list.length;i++) {
        	if(num_list[i]<0) {
        		answer = i;
        		break;
        	}
        }
        return answer;
        
//        for (int i = 0;i < num_list.length;i++)
//            if (num_list[i] < 0)
//                return i;
//        return -1;
//        기본 리턴값을 -1로. 음수인 경우를 특별하게 처리
    }
}
