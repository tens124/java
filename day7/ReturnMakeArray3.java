package day7;

import java.util.ArrayList;

//문자열 배열 intStrs와 정수 k, s, l. intStrs의 원소는 숫자로 구성
//배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환
//이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 리턴

//예시
//intStrs = ["0123456789","9876543210","9999999999999"]	
//k = 50000		s = 5		l = 5	
//0123456789의 5번 인덱스에서 시작해 길이 5짜리 문자열을 추출
//56789라는 문자열이 완성. 이를 정수로 변환 시 5만보다 크기에 answer에 적립
//answer = [56789, 99999]

public class ReturnMakeArray3 {
	public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        String temp = "";
        for(int i =0;i<intStrs.length;i++) {
        	temp = intStrs[i].substring(s, s+l);
        	if(Integer.parseInt(temp)>k) {
        		answer.add(Integer.parseInt(temp));
        	}
        }
        return answer;
    }

}
