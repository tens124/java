package day18;

public class ReturnSpiralArrayAnswer {

	//풀기는 했지만 더 효율적인 방법이 많아서 따로 기술
	
	public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0, y = 0;
        //현재 코드에서 y가 수평 방향을, x가 수직 방향을 의미하고 있음
        int dx[] = {0, 1, 0, -1};	// 수직 이동 방향 배열
        int dy[] = {1, 0, -1, 0};	// 수평 이동 방향 배열
        int direction = 0;// 현재 이동 방향 (0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)

        while (num <= n * n) {
            answer[x][y] = num++;
            //answer[x][y]에 1부터 저장
            //x,y의 초기값은 0,0

            // 다음 좌표 계산
            int nx = x + dx[direction]; //맨 처음엔 0
            int ny = y + dy[direction]; //맨 처음엔 1
            //가장 첫 줄에서는 y값만 계속해서 1씩 늘어나며 사각형의 윗변을 전부 채운다
            //(0,0)(0,1)(0,2),(0,n-1),(0,n)
            //그러다 y값이 사각형을 벗어나는 순간(n과 같아지는 순간)이 발생하게 됨
            //그때 아래의 if문이 작동. direction에 1 추가 후 4로 나눠 나머지 획득
            //처음 얻는 나머지값은 1. 1은 아래로 가는 것을 의미
            //int dx[]와 int dy[]의 요소들을 통해 이를 제어하고 있음
            //int dx[]는 0,1,0,-1의 순서
            //int dy[]는 1,0,-1,0의 순서
            //direction이 1이 됐으니, y의 값은 더 이상 커지지 않음.x만 증가(nx,ny)
            //따라서 아래로(x가 1씩 늘어나게 됨) 계속 진행
            //(1,n-1),(2,n-1),(n-1,n-1),(n,n-1)
            //그러다 x값이 사각형을 벗어나는 순간(n과 같아지는 순간)이 발생하게 됨
            //direction 값을 변경. 2%4=2로 변화함
            //x는 변화 없고, y는 -1. 즉, 수평방향으로 한 칸씩 앞으로 가게 됨
            //이상의 로직이 반복되다, 한 바퀴를 돌게 되면 0이 아닌 숫자를 만나게 됨
            //(direction + 1) % 4; 식에 의해 direction은 다시 0으로
            //이처럼 계속 방향을 꺾어가며 n*n값에 도달할 때까지 반복
            

            // 다음 좌표가 배열의 범위를 벗어나거나 이미 숫자가 채워져 있는 경우
            if (nx < 0 					//nx가 0보다 작거나
            	|| nx >= n 				//nx가 n보다 크거나 같거나
            	|| ny < 0 			    //ny가 0보다 작거나
            	|| ny >= n 				//ny가 n보다 크거나 같거나
            	|| answer[nx][ny] != 0) {	//0이 아니거나
                direction = (direction + 1) % 4; 
                //방향전환(0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx; // 다음 x 좌표로 이동
            y = ny; // 다음 y 좌표로 이동
        }

        return answer;
    }
}
