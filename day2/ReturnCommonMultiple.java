package day2;

//number가 n의 배수이며 m의 배수(공배수)라면 1을, 아니면 0을 리턴
public class ReturnCommonMultiple {

	 public int solution(int number, int n, int m) {
	      return number % n == 0 && number % m == 0?1:0;
	      
	      //공배수라면 (number%(n*m) == 0)을 이용해도 되지 않을까?
	      //불가능. number가 80이고, n이 10, m이 20이라면 통과 불가
	      //이처럼 예외가 존재함. 
	    }
}
