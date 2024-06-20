package day4;

//정수 n과 문자열 control
//control의 원소는 w,a,s,d 중 하나
//n은 control의 앞부분부터 지나며, 해당 위치의 원소값에 따라 변화
//w를 만나면 +1 / s를 만나면 -1 / d를 만나면 -10 / a를 만나면 +10
//최종적인 n의 값을 리턴
public class ReturnControlNumber1 {
	
	public int solution(int n, String control) {
        int answer = n;
        
        for(int i =0;i<control.length();i++) {
        //향상된 for문을 사용하는 것도 가능하다	
        //for(char ch : control.toCharArray())
        	switch(control.toCharArray()[i]) {
        	case 'w':
        		answer +=1;
        		break;
        	case 's':
        		answer -=1;
                    break;
        	case 'd':
        		answer +=10;
        		break;
        	case 'a':
        		answer -=10;
        		break;
        	}
        	//(c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10)
        	//조건을 이런 식으로 주는 것도 가능. 여러 번 중첩된 삼항연산자
        	//wsda의 순서를 정렬시킨 후, 해당 문자가 아닐 때는 다시 삼항연산자를 사용
        }
        return answer;
    }
}
