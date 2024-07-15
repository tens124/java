package day17;

//정수 배열 date1과 date2
//두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴
//date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 리턴
public class ReturnCompareDates {
	
	public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String day1 = ""+date1[0]+date1[1]+date1[2];
        String day2 = ""+date2[0]+date2[1]+date2[2];
        //다만 int형의 경우 앞에 0을 붙이지 않기 때문에, 
        //월 또는 일이 한 자리수일 경우엔 잘못된 계산결과가 나올 수 있다
        
//      String day1 = String.format("%04d%02d%02d", date1[0], date1[1], date1[2]);
//      String day2 = String.format("%04d%02d%02d", date2[0], date2[1], date2[2]);
//      이런 문제를 해결하기 위한 방안. format 메소드를 통해 데이터의 형태를 바꿔버린다
//      %04d%02d%02d은 포맷을 의미함. format메소드가 포맷을 통해 주어진 문자열을 포맷팅
//      %: 포맷 지시자를 시작하는 기호
//      0: 숫자를 포맷팅할 때 남은 자리를 0으로 채울 것임을 나타냄
//      4: 숫자를 네 자리로 표현할 것임을 나타냄
//      d: 정수를 포맷팅할 것임을 나타냄 (decimal의 약어)
//      따라서 각 정수를 x자리로 표현하고, 빈칸엔 0을 붙이겠다는 뜻
        
//      %04d는 4자리로 연도를 표현
//      %02d는 2자리로 월을 표현
//      %02d는 2자리로 일을 표현
        
//      answer = day1.compareTo(day2) < 0 ? 1 : 0;
//      마지막엔 compareTo메소드를 사용해 두 문자열을 비교 후 answer에 값 할당
        
//      문자열1.compareTo(문자열2)메소드의 리턴값
//      0: 두 문자열이 동일.
//      음수 값: 문자열1이 문자열2보다 사전적으로 먼저 나옴
//      양수 값: 문자열2가 문자열1보다 사전적으로 먼저 나옴
//      즉,앞에 주어진 문자열이 뒤의 문자열보다 먼저 나오면 음수/늦게 나오면 양수/같으면 0
        
        
        //날짜 자료형을 이용한 풀이도 가능
//        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
//        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
//		  LocalDate.of(연,월,일) 메소드
        
//        if (dateA.isBefore(dateB)) {
//        날짜1.isBefore(날짜2)로 앞선 날짜 확인 가능. 날짜1이 앞서면 true
//        날짜2가 앞서거나, 두 날짜가 같다면 false
//            return 1;
//        } else {
//            return 0;
//        }
        
        
        //배열을 통으로 비교하는 방법도 있다
//        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
//        앞 배열이 사전적으로 먼저라면 음수를 반환. 반대라면 양수를 반환
//        이때 각 배열의 원소가 세 개인 상태이니, 0번 인덱스를 서로 비교 후 1번,...의 순서
//        사전이라 함은 유니코드를 의미함. 따라서 1과 11의 비교를 걱정하지 않아도 됨
        
        answer = Integer.parseInt(day1)<Integer.parseInt(day2)?1:0;
        return answer;
    }
}
