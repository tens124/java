package day14;

//정수 배열 arr와 자연수 k
//k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더함
//최종적으로 변환된 배열을 리턴
public class ReturnChangeSequence {
	public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for(int i = 0;i<arr.length;i++) {
        	if(k%2==0) {
        		answer[i]=arr[i]+k;
        	}else {
        		answer[i]=arr[i]*k;
        	}
        }
        return answer;
    }

}
