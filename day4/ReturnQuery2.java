package day4;

import java.util.ArrayList;
import java.util.List;

//정수 배열 arr와 2차원 정수 배열 queries
//queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 탐색
//각 쿼리의 순서에 맞게 답을 저장한 배열을 리턴. 단, 답이 없다면 -1 리턴

//예시
//arr : [0, 1, 2, 4, 3]	
//queries : [[0, 4, 2],[0, 3, 2],[0, 2, 2]]	
//result : [3, 4, -1]
//[0, 4, 2] : i는 0,1,2,3,4. arr[i]는 0,1,2,4,3
//이 중 2보다 크면서 가장 작은 arr[i]는 arr[5]=3
//[0, 3, 2] : i는 0,1,2,3. arr[i]는 0,1,2,4
//이 중 2보다 크면서 가장 작은 arr[i]는 arr[3]=4
//[0, 2, 2] : i는 0,1,2. arr[i]는 0,1,2
//이 중 2보다 크면서 가장 작은 arr[i]는 없음. 따라서 -1

public class ReturnQuery2 {
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
		solution(arr, queries);
	}

	 public static int[] solution(int[] arr, int[][] queries) {
		 int[] answer = new int[3];
	        int s =0;
	        int e =0;
	        int k =0;
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for(int[] query : queries) {
	        	s = query[0];
	        	e = query[1];
	        	k = query[2];
	        	
	        	
	        	//for문을 다시 이용해 s<=i<=e를 만족시키는 i값을 전부 찾아냄
	        	for(int i = s;i<=e;i++) {
	        		//i의 갯수는 일정치 않으니 ArrayList를 사용
	        		
	        		//제네릭<>을 사용한다면 리스트 안에 해당 자료형만이 삽입됨
	        		//리스트의 매개변수는 Object형이기에, 다양한 자료형을 변환없이
	        		//넣을 수 있지만 꺼낼 때는 형변환을 따로 거쳐줘야 함
	        		//이러한 단점을 상쇄하기 위함
	        		
	        		//List는 ArrayList의 부모클래스
	        		//자식 클래스의 객체는 부모 클래스를 상속하므로, 
	        		//부모의 멤버를 기본적으로 모두 가지고 있음
	        		//하지만, 부모는 자식의 멤버를 가지지 않는다
	        		
	        		//이처럼 자식클래스를 부모클래스 안에 집어넣는 방식을 업캐스팅이라 부름
	        		//업캐스팅을 통해 재사용해야 하는 반복된 메서드를 부모클래스에서 가져와 
	        		//서브클래스를 호출하는 등 자유롭게 사용이 가능해짐
	        		//참조변수 간의 형 변환을 하는 근본적인 이유는 
	        		//사용가능한 멤버의 개수를 조절하는 것
	        		
	        		//그 후 arr[i]값을 전부 넣은 배열을 생성
	        		//이렇게 해버리면 list에 모든 값이 저장되어 끝없이 커짐
	        		//따라서 한 번의 루프가 끝날 때마다 초기화를 해주어야 함
	        		list.add(arr[i]);
	        	}
	        	//list엔 arr[i]의 값이 전부 들어가있다
	        	//이 리스트는 for문이 한 번 끝날 때마다 초기화
	        	//0,1,2,4,3
	        	//0,1,2,4
	        	//0,1,2
	        	
	        	//다시 for문을 이용해 k와 배열 내부의 값들을 비교
	        	//k보다 큰 값이 나온다면 그 값을 answer 배열에 입력 후 break
	        	
	        	//하면 될 줄 알았지만 공교롭게도 배열의 순서가 0,1,2,4,3
	        	//4와 3의 위치로 인해 단순하게 순서대로 나열해서는 풀리지 않음
	        	//따라서 새로운 dList를 만들어 오름차순 정렬 후 인덱스 0번을 추출
	        	//인덱스0번이 존재하지 않는다면, 즉 dList의 크기가 0이라면
	        	//인덱스 0번 대신 -1을 삽입하는 방식으로 풀면 될 것 같음
	        	//시간이 너무 걸려서 이건 포기....
		        
		        
		      //한 번의 루프가 끝날 때마다 list 초기화
		        list = new ArrayList<Integer>();
	        }
//	        for(int i =0;i<answer.size();i++) {
//	        	System.out.println(answer.get(i));
//	        }
	        	
	        
	        return answer;
	    }
}
