package day16;

//2차원 정수 배열 board와 정수 k
//i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 리턴
public class ReturnDiagonal {

	public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i = 0; i<board.length;i++) {
        	for(int j = 0;j<board[i].length;j++) {
        	//정사각형 배열이 아님에 유의. i로는 열을 순회, j는 행을 순회
        	//즉 i열마다 크기가 다른 배열이 존재. 따라서 i열마다 길이를 따로 재줘야 함
        	//이를 나타낸 코드가 j<board[i].length
        		if(i+j<=k) {
        			answer+=board[i][j];
        		}
        	}
        }
        
        return answer;
    }
}
