package day2;

//flag가 true라면 a + b를, 아니라면 a - b 리턴
public class ReturnTrueOrFalse {

	public int solution(int a, int b, boolean flag) {
        return flag?a+b:a-b;
    }
}
