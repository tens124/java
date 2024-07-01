package day11;
//num_list의 첫 번째 원소부터 마지막 원소까지 
//n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 리턴
public class ReturnIntervalsOfN {

	public int[] solution(int[] num_list, int n) {
		double a = (double)num_list.length/n;
        int[] answer = new int[(int)Math.ceil(a)];
        //answer의 크기는 n개 간격으로 나눈 후 올림을 해주면 구할 수 있다
        //int N = num_list.length % n == 0 
        //? num_list.length / n : num_list.length / n + 1;
        //올림을 계산하는 훨씬 쉬운 방법. 나머지가 0이 아니라면 +1을 해주면 됨
        
        for(int i = 0,j=0;i<num_list.length;i+=n) {
        	answer[j++]=num_list[i];
        }
        return answer;
    }
}
