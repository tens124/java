package day16;

//n × n 크기의 이차원 배열 arr이 다음을 만족하면 1을 아니라면 0을 리턴
//0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]
public class ReturnDoubleArray2 {
	public int solution(int[][] arr) {
		int answer = 0;
		
		int cnt = 0;
        for(int i = 0;i<arr.length;i++) {
        	for(int j = 0;j<arr.length;j++) {
        		if(arr[i][j]==arr[j][i]) {
        			cnt++;
        		}
        		//cnt 대신 반례, 즉 둘이 다른 경우를 찾아내는 것이 훨씬 간단
        		//arr[i][j]!=arr[j][i]라는 if문이 참이라면 1, 거짓이라면 0 반환
        	}
        }
        
        answer = cnt==arr.length*arr.length?1:0;
        return answer;
    }

}
