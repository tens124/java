package day4;

//정수 배열 arr와 2차원 정수 배열 queries
//queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴
//각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿈
//위 규칙에 따라 queries를 처리한 이후의 arr를 리턴

//예시
//arr : [0, 1, 2, 3, 4]	
//queries : [[0, 3],[1, 2],[1, 4]]	
//결과 : [3, 4, 1, 0, 2]
//arr[0]과 arr[3]을 교환->[3,1,2,0,4]
//arr[1]과 arr[2]을 교환->[3,2,1,0,4]
//arr[1]과 arr[4]을 교환->[3,4,1,0,2]


public class ReturnQuery1 {
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4}	;
		int[][] queries = {
				{0, 3},{1, 2},{1, 4}
				};
		solution(arr, queries);
	}

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer= {0,0,0,0,0};
		System.arraycopy(arr, 0, answer, 0, arr.length);
        //왜 arr을 쓰는 것과 {0,1,2,3,4}를 쓸 때의 결과값이 다른가?
        
        //queries의 원소를 생각해보자
        //[[0, 3],[1, 2],[1, 4]]
        //queries[0]=[0,3]
        //queries[0][0]=0
        //queries[0][1]=3
        
        //queries[1]=[1,2]
        //queries[1][0]=1
        //queries[1][1]=2
        
        //queries[2]=[1,4]
        //queries[2][0]=1
        //queries[2][0]=4
        
        //arr는 queries를 지나며 
        //arr[queries[0][0]]과 arr[queries[0][1]]을 교환
        //arr[queries[1][0]]과 arr[queries[1][1]]을 교환
        //arr[queries[2][0]]과 arr[queries[2][1]]을 교환
        
        //하나의 배열만으론 처리하기 힘들 듯.
        //arr와 answer 두 개의 배열을 이용
        //answer의 초기값은 arr와 동일. 
        //첫 번째 루프에서 arr[queries[0][0]]의 값을 answer[queries[0][1]]로 보내줌
        //그 후 arr[queries[0][1]]의 값을 answer[queries[1][0]]로 보내줌
        //이렇게 되면 첫 번째 루프가 성공적으로 수행됨. 두 수의 위치가 교환
        //그 후 arr 배열의 값을 변화한 배열의 값으로 덮어씌워버림
        
        //answer[queries[0][0]] = arr[queries[0][1]]
        //answer[queries[0][1]] = arr[queries[0][0]]
        //arr = answer	arr를 바뀐 배열로 새롭게 지정해줘야 값이 정확히 나옴
        //answer[queries[1][0]] = arr[queries[1][1]]
        //answer[queries[1][1]] = arr[queries[1][0]]
        //arr = answer
        //answer[queries[2][0]] = arr[queries[2][1]]
        //answer[queries[2][1]] = arr[queries[2][0]]
        //arr = answer
        
        System.out.println(answer[0]);
        System.out.println(arr[3]);
        System.out.println(answer[3]);
        System.out.println(arr[0]);
        answer[0]=arr[3];
        System.out.println(answer[0]);
        System.out.println(arr[3]);
        System.out.println(answer[3]);
        System.out.println(arr[0]);
        //매우 이상한 결과. answer[0]=arr[3]를 통과하는 순간
        //arr이 answer과 동일한 배열로 바뀌어버린다
        //문제의 답 : 자바에서 배열은 객체이며, 변수에 할당될 때 
        //배열 자체가 복사되는 것이 아니라 배열을 가리키는 참조(reference)가 복사된다
        //즉 주소값이 그대로 옮겨가는 것
        //따라서 arr 배열의 값이 answer배열의 해당 위치에 저장되는 것이 아니라
        //두 배열 간의 주소값이 서로 중첩되는 결과가 발생함
        //따라서 answer[0]=arr[3]의 코드를 동작시키게 되면 {3,1,2,3,4}로
        //변화하는 부분까지만 적용되고, 이후엔 두 변수가 메모리 주소를 공유하게 됨
        //이때는 일반적인 자바코드처럼 좌항 = 우항 시 우항의 요소가 좌항의 변수에
        //대입되는 규칙을 따르지 않는 듯? 이 부분은 좀 더 알아봐야
        
        //이 문제를 해결하기 위해서는 arr과 answer배열을 완전히 분리시켜야 함
        //해당 문제는 푸는 데 실패했으니, ReturnQuery1Answer 파일을 참고
        
        for(int i = 0;i<queries.length ;i++) {
        	
        	int a = queries[i][0];
        	int b = queries[i][1];
//        	System.out.print(" a:"+a);
//        	System.out.print(" b:"+b);
        	//a:0 b:3/a:1 b:2/a:1 b:4
        	//arr[0]과 arr[3]을 교환
        	//arr[1]과 arr[2]을 교환
        	//arr[1]과 arr[4]을 교환
        	
        	//arr과 answer 두 개의 배열을 이용
        	//arr은 0,1,2,3,4
        	//answer도 0,1,2,3,4
        	//answer[0]=arr[3]->answer : 3,1,2,3,4
        	//answer[3]=arr[0]->answer : 3,1,2,0,4
        	//하지만 아랫줄 코드는 작동하지를 않는다.
        	
        	
        	answer[a] = arr[b];
        	//answer[queries[0][0]] = arr[queries[0][1]]
        	//answer[0]=arr[3]
        	//0,1,2,3,4->3,1,2,3,4
        	//이 코드를 통과하면 arr이 31234로 변해버림. 왜?
        	//심지어 아래의 코드는 더 이상 실행되지 않음. 이 부분만이 작동 중
        	//두 개의 배열을 동시에 사용하게 되면 객체 타입의 성질로 인해
        	//서로의 주소값이 엉켜버림. 아래 코드가 먹통이 아니라, 예측 불가능한 결과가 발생하는 것
        	
        	
        	answer[b] = arr[a];
        	//answer[queries[0][1]] = arr[queries[0][0]]
        	//answer[3]=arr[0]
        	//3,1,2,3,4->3,1,2,0,4
        	
        	for(int j=0;j<answer.length;j++) {
        	System.out.print(answer[j]);
        	//실제로는 31234->32234->34234. 왜 이런 결과가 나타나는가?
        	//answer[a] = arr[b] 코드로 인한 문제. 결과가 완전히 엉망이 됨
        	}
        	
        	arr = answer;
        	//arr:01234->31234->32234->34234
        }
        return answer;
    }
}
