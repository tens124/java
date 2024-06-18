package day2;

//문자들이 담긴 배열의 원소들을 문자열로 변환하여 리턴
public class ReturnArrayToString {

	public String solution(String[] arr) {
        String answer = "";
        
        for(int i = 0;i<arr.length;i++) {
        	answer += arr[i];
        }
        
        //향상된 for문도 가능
        // for(String a : arr) {
        //answer += a;
        //}
        //arr의 각 원소를 a에 저장 후 a를 다시 answer로 전달
        
        
        return answer;
        
        //return String.join("", arr); 
        //단 한 줄로 처리도 가능. 
        //join 메소드는 각 요소 또는 멤버 사이에 지정된 구분 기호를 사용하여 
        //지정된 배열 요소나 컬렉션 멤버를 연결.
        //즉 arr 배열의 모든 원소를 구분기호 ""를 붙여서 연결된 문자열을 생성헤줌
    }
}
