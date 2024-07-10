package day15;

//arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, 
//arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 리턴
public class ReturnCalcurateByLength {
	public int[] solution(int[] arr, int n) {
		int[] answer = arr.clone();
		int i =0;
		int j =1;
		
		while(true) {
			if (arr.length % 2 != 0) {
				answer[i] = arr[i] + n;
				i += 2;
			} else {
				answer[j] = arr[j] + n;
				j += 2;
			}
			if(i >= arr.length || j>=arr.length) break;
		}
		
		
		//간결한 풀이법
//		 for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
//	            arr[idx]+=n;
//	        }
		//홀짝에 따라 루프의 시작점을 조절 후 2씩 증가시키며 계산
		
		//이것도 좋은 듯
//		for (int i = arr.length - 1; i >= 0; i -= 2) {
//            arr[i] += n;
//        }
		//시작점을 길이-1(끝 인덱스)로 잡은 후 1씩 빼가며 루프. 홀짝 판별이 따로 필요 없다
		//배열 길이가 5라면 인덱스는 0,1,2,3,4. 0,2,4 인덱스가 변화
		//배열 길이가 6이라면 인덱스는 0,1,2,3,4,5. 1,3,5 인덱스가 변화
		
		

		return answer;
	}

}
