package day3;

//true와 false로 이루어진 배열 included
//첫째항이 a, 공차가 d인 등차수열
//등차수열의 각 항 중 included 배열의 원소에서 true가 존재하는 위치의 값들만 합산하여 리턴

//a	d	included							결과
//3	4	[true, false, false, true, true]	37
//등차수열은 배열의 길이에 따라 3,7,10,13,16이 될 것. 이 중 true의 위치인 3,13,16을 합산
public class ReturnArithmetical {
	
	public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i = 0; i<included.length;i++) {
        	if(included[i] == true) {
        		answer += a + d * i;
        	}
        }
        return answer;
        
//      return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
//		람다식을 이용한 방법
	}
}
