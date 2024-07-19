package day18;

public class ReturnSpiralArrayAnswer2 {

	//또다른 풀이법
	public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num=1;
        int start=0;
        int end=n;

        while(num <= n*n){

        //오른쪽으로
        //0~n-1까지 차례대로 채워넣음
        for(int j=start;j<end;j++)
            answer[start][j]=num++;
        	//시작점은[0,0],[1,1],[2,2],...
        //아래로
        //start+1로 아래 행에서부터 출발. n-1열에 숫자를 가득 채움
        for(int i=start+1;i<end;i++)
            answer[i][end-1]=num++;
        //왼쪽으로
        //end-2로 끝에서 한 칸 옆에서 출발. 시작점까지 전부 채워넣음
        for(int j=end-2;j>=start;j--)
            answer[end-1][j]=num++;
        //위로
        //end-2로 끝에서 한 칸 위에서 출발.>를 쓰고 있으니 1행까지 전부 채워넣음
        for(int i=end-2;i>start;i--)
            answer[i][start]=num++;
        start++;	//시작점은 한 칸 오른쪽/아래쪽으로
        end--;		//종착점은 한 칸 왼쪽/위쪽으로

        }

        return answer;
    }
}
