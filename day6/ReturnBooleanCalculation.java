package day6;

//(x1 ∨ x2) ∧ (x3 ∨ x4)의 결과를 true/false로 리턴

//논리학 기호
//논리합(or) : ∨   하나 이상이 참일 경우
//논리곱(and) : ∧   둘 모두 참일 경우
//부정(not) : ￢   참과 거짓을 바꿔버림
//배타적 논리합(exclusive or(xor)) : ⊕   둘 중 하나만 참인 경우
//boolean형 변수에 || && 등을 사용하면 논리학 기호가 적용된다

//불 대수를 이용한 논리회로?

public class ReturnBooleanCalculation {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2)&&(x3 || x4);
    }

}
