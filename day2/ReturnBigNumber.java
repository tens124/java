package day2;

//두 정수를 붙여서 쓴 값을 반환하는 연산 ⊕. a⊕b와 b⊕a 중 더 큰 값을 리턴
//단, 둘이 같은 경우 a⊕b를 리턴
public class ReturnBigNumber {

	public int solution(int a, int b) {
        int answer = 0;
        
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        
        //박싱과 언박싱을 이용
        //박싱 : 스택메모리에 저장된 변수(지역변수 등)의 값을 heap메모리(박스)에 복사해서 집어넣는 것. 
        //그 결과 새로운 변수가 변수 값의 주소값을 가지게 됨.
        Integer AB = new Integer(A+B);
        Integer BA = new Integer(B+A);
        //Integer(String)를 호출할 때 박싱이 진행됨.
        //다만 생성자를 통한 객체 생성은 구버전에서 사용하던 방법
        //자동박싱이 도입된 현 버전에서는 valueOf 혹은 parseInt 메소드를 사용
        //parseInt(): 원시데이터인 int 타입을 반환
        //valueOf(): Integer 래퍼(wrapper)객체를 반환
        //https://blog.naver.com/sthwin/221000179980
        //Integer AB = Integer.parseInt(A+B);
        //Integer BA = Integer.parseInt(B+A);
        
        //언박싱 :박싱의 반대 과정. heap메모리의 데이터를 스택영역으로 가져옴. 
        int ab = AB.intValue();
        int ba = BA.intValue();
        //int n1 = num1.intValue();
        //박싱됐던 값을 다시 스택영역으로. 
        
        //자동 박싱/언박싱
        //기본 타입에 포장 객체가 대입되는 경우 연산에서 자동 박싱/언박싱. jdk 버전 1.6부터 지원
        //Integer 객체를 생성하는 경우, 내용물이 int형이라면 자동으로 박싱되어 저장됨 
        
        if(ab>ba) {
        	answer = ab;
        }else if(ab<ba) {
        	answer = ba;
        }else {
        	answer = ab;
        }
        
        //parseInt를 사용할 때
        //int aLong = Integer.parseInt(""+a+b);
        //int bLong = Integer.parseInt(""+b+a);
        //자바에서는 문자열과 숫자를 혼합해서 사용할 경우 전체를 문자열로 인식
        //따라서 a+b는 합연산이 진행되지만, ""라는 문자열과 함께 사용한다면 전체가 문자열로 인식됨
        //이렇게 만들어진 문자열을 메소드를 통해 변환하고 자동박싱을 통해 int형 변수에 저장
        //answer = aLong > bLong ? aLong : bLong;
        
        return answer;
    }
}
