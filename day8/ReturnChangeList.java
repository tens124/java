package day8;

//arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 
//50보다 작은 홀수라면 2를 곱한 후 그 결과인 정수 배열을 리턴
public class ReturnChangeList {

	public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0;i<arr.length;i++) {
        	answer[i]=
        		arr[i]>=50&&arr[i]%2==0
        			?arr[i]/2
        				:arr[i]<50&&arr[i]%2==1
        					?arr[i]*2
        						:arr[i];
        }
        //중복된 삼항연산자는 좋지만은 않은가? if와 else if문도 고려
        return answer;
    }
}
