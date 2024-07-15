package day17;

//아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 구입
//아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원
//메뉴만 적은 팀원의 것은 차가운 것으로 통일
//"아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일
//각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때, 카페에서 결제하게 될 금액을 리턴

//order의 원소				의미
//"iceamericano" 	차가운 아메리카노
//"americanoice"	차가운 아메리카노
//"hotamericano" 	따뜻한 아메리카노
//"americanohot"	따뜻한 아메리카노
//"icecafelatte" 	차가운 카페 라테
//"cafelatteice"	차가운 카페 라테
//"hotcafelatte" 	따뜻한 카페 라테
//"cafelattehot"	따뜻한 카페 라테
//"americano"		아메리카노
//"cafelatte"		카페 라테
//"anything"		아무거나
public class ReturnDeliveryCoffee {

	public int solution(String[] order) {
		int answer = 0;

		for (String cf : order) {
			if (cf.contains("americano") || cf.contains("anything")) {
				answer += 4500;
			} else {
				answer += 5000;
			}
		}

		return answer;
	}
}
