package day3;

//배열 내의 모든 원소를 곱한 값이 모든 원소를 더한 값의 제곱보다 작으면 1, 크면 0 리턴
public class ReturnComparePlusMulti {

	public int solution(int[] num_list) {
		
		return multi(num_list)<pow(num_list)?1:0;
	}

	int multi(int[] num_list) {
		int multi = 1;
		//곱연산의 경우 첫 수는 1이어야 함
		for (int i = 0; i < num_list.length; i++) {
			multi *= num_list[i];
		}

		return multi;
	}

	int pow(int[] num_list) {
		int pow = 0;
		for (int i = 0; i < num_list.length; i++) {
			pow += num_list[i];
		}
		pow = (int) Math.pow(pow, 2);
		return pow;
	}
}
