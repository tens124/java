package day10;

import java.util.Arrays;

//정수 배열 arr와 query
//짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 
//배열의 query[i]번 인덱스 뒷부분을 잘라서 버림
//홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 
//배열의 query[i]번 인덱스 앞부분을 잘라서 버림
//위 작업을 마친 후 남은 arr의 부분 배열을 리턴

//예시
//arr : [0, 1, 2, 3, 4, 5]	query : [4, 1, 2]	answer : [1, 2, 3]
//4번 인덱스의 뒷부분을 버림->[0,1,2,3,4]
//1번 인덱스의 앞부분을 버림->[1,2,3,4]
//2번 인덱스의 뒷부분을 버림->[1,2,3]
public class ReturnCutArray {

	public int[] solution(int[] arr, int[] query) {
        for(int i = 0;i<query.length;i++) {
        	if(i%2==0) {	//짝수일 경우
        		arr = Arrays.copyOfRange(arr, 0, query[i]+1);
        	}else {			//홀수일 경우
        		arr = Arrays.copyOfRange(arr, query[i], arr.length);
        	}
        	//Arrays.copyOfRange 메소드는 시작 인덱스는 포함하지만 종료 인덱스는 포함x
        	//A~B-1까지만 복사하게 됨
        }
        
        return arr;
        
        //또 다른 풀이
        
//      int start = 0;
//      int end = arr.length - 1; length는 1부터 셈. 배열에 적용하려면 -1 
//      시작과 끝값을 미리 설정
        
//        for (int i = 0; i < query.length; i++) {
//            if (i % 2 == 0) {
//                end = start + query[i];
        		  //짝수 인덱스를 거치면 그만큼 뒷부분이 잘려나감. 얼마나 잘릴지는 시작점에 따라 변화
        		  //ex)4를 만나면 arr[5]부터는 전부 사라짐
        		  //[0,1,2,3,4,5]->[0,1,2,3,4] 즉 원본의 4번 인덱스가 끝점이 됨
        		  //1번 인덱스에서 1을 만나면?
        		  //[0,1,2,3,4]->[1,2,3,4] 이전 배열의 1번 인덱스가 시작점이 됨
        		  //2번 인덱스에서 2를 만나면 arr[3]부터는 전부 사라짐
        		  //[1,2,3,4]->[1,2,3] 즉 원본의 3번 인덱스가 끝점이 됨. 3 = 1+2
//            } else {
//                start += query[i];
        		  //홀수 인덱스를 거치면 그만큼 앞부분이 잘려나감. 따라서  적립을 통해 표현
        		  //ex)1을 만나면 arr의 모든 인덱스번호에 -1 적용.
        		  //[0,1,2,3,4]->[1,2,3,4] 즉 원본의 1번 인덱스가 시작점이 됨
        		  //두 번째에 2를 만나면 arr의 모든 인덱스번호에 -3 적용
        		  //[1,2,3,4]->[3,4] 즉 원본의 3번 인덱스가 시작점이 됨
        		  //이처럼 시작점은 덧셈 누적을 통해 변경
//            }
//        }
//        arr은 반복문을 지나며 밀물썰물처럼 조정됨. 
//        뒤가 잘리면(짝수일 땐) 그대로지만, 앞이 잘리면(홀수일 땐) 그만큼 땡겨짐
//        이러한 변화를 start와 end를 통해 표현하고 있다.
        	//원본 : [0,1,2,3,4,5]
        	//4번 인덱스의 뒷부분을 버림->[0,1,2,3,4]
        	//end : 0+4-1=3
        	//1번 인덱스의 앞부분을 버림->[1,2,3,4]
        	//start : 1
        	//2번 인덱스의 뒷부분을 버림->[1,2,3]
        	//end : 1+2-1=2
//        
//
//        return Arrays.copyOfRange(arr, start, end + 1);
          //1~3번 인덱스까지를 복사 붙여넣기
          //이때 copyOfRange(원본배열,시작점,끝점)은 끝점은 포함하지 않음. 따라서 +1을 해주는 것
    }
}