package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//내 코드에선 a값만을 갖고 중복값을 검사한 후 중복되는 값이 있을 경우 count를 증가시켜
//이를 switch문의 각 case에 전달하여 해당 상황에 맞는 코드가 작동되도록 설정돼있음
//다만 가장 앞의 수 a만을 사용하기에 2,1,1,1의 경우엔 count가 1밖에 되지 않음
//즉, 완벽하게 모든 경우에 대처할 수 없다는 뜻. 따라서 문제 해결에 실패했기에
//다른 사람의 풀이를 참조.
public class ReturnDiceGame1Answer {
	public static int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> dice = new HashMap<Integer, Integer>();
        //HashMap 객체 dice를 생성
        //Map은 key와 value값을 통해 값을 특정 위치가 아닌 키에 저장하게 된다
        //키는 유일한 값이어야 함. 중복돼선 안됨. 키값을 통해 value값에 접근 가능
        int result = 0;

        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);
        //getOrDefault(key, 기본값)는 해당 key에서 값을 가져오되
        //키가 존재하지 않는다면 설정된 기본값을 가져오는 메소드
        //이렇게 가져온 값에 1을 더해주게 된다
        
        //key는 중복되지 않는 입력 받은 주사위 눈, value는 주사위의 중복 개수를 뜻함
        //예를 들어보자. 1,2,3,3이라는 주사위 눈이 입력됐다
        //첫 put 메소드가 작동. 1이라는 키에 1이 저장(기본값+1)
        //둘째 put 메소드가 작동. 2이라는 키에 1이 저장(기본값+1)
        //셋쩨 put 메소드가 작동. 3이라는 키에 1이 저장(기본값+1)
        //넷째 put 메소드가 작동. 3이라는 키에 2가 저장(1+1)
        //따라서 해당 맵엔 1:1/2:1/3:2라는 키:값이 저장되어 있음
        
        List<Integer> keys = new ArrayList<Integer>(dice.keySet());
        //ArrayList객체 생성 시 매개변수(정수)를 사용하면 배열의 초기용량이 그 수만큼 설정된다
        //디폴트값은 10. 
        //ArrayList객체 생성 시 매개변수(컬렉션)를 사용하면 해당 컬렉션의 데이터를 모두 복사해온다
        //즉, 이 경우엔 dice.keySet()이라는 컬렉션의 데이터를 복사해오게 됨
        
        //dice.keySet() 메소드는 해당 맵의 모든 키(key)를 포함하는 Set을 반환하는 메소드
        //Set은 자료구조 중 하나로, 중복을 허용하지 않고 순서를 보장하지 않는 요소들의 
        //집합을 나타내는 인터페이스. List와 달리 인덱스를 사용하여 요소에 접근할 수 없다
        //이러한 차이점으로 인해 해당 리스트에는 셋의 요소가 알 수 없는 순서대로 삽입됨(짧아서 순서대로 드가나?)
        //결과적으로 keys엔 주어진 주사위눈 중 중복된 값을 제외하고 전부가 들어가있게 됨
        //keys는 키, 즉 주사위눈만을 품고 있는 리스트
        //keys를 따로 사용하는 이유는, 인덱스를 사용하는 리스트를 보조적으로 사용하기 위해서
        //맵과 리스트의 차이로 인해 리스트에는 주사위눈이 무작위적으로 삽입되지만, 중요하지 않음
        //인덱스의 갯수가 두 개일 때만 사용하면 충분하기 때문. 앞번과 뒷번을 구분만 하면 된다
        for(Integer v : keys) {
        	System.out.println(v);
        }

        switch(dice.size()) {
        //dice는 맵이다. 주사위눈과, 중복횟수가 키:밸류의 형태로 저장되어 있다
            case 1: // 모두 같은 주사위. 1:4
                result = 1111 * a;
                break;
            case 2: // 2 : 2 or 1 : 3 주사위
                if(dice.get(keys.get(0)) == 1 
                || dice.get(keys.get(1)) == 1) { // 1 : 3 주사위
                //두 개의 키값 중 하나라도 1이라면 나머지는 3이 될 수밖에 없음
                    int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    //0번이 세 번 나온 주사위눈이라면 0번을, 아니라면 1번의 값을 p에 저장
                    int q = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    //0번이 한 번 나온 주사위눈이라면 0번을, 아니라면 1번의 값을 q에 저장

                    result = (int)Math.pow((10 * p) + q, 2);
                    //문제의 조건대로 식 설정
                } else { // 2 : 2 주사위
                    int p = keys.get(0);
                    int q = keys.get(1);
                    //키는 단 두 개 존재. 해당값들이 리스트에 저장되어 있음
                    result = (p + q) * (Math.abs(p - q));
                }
                break;
            case 3: // 두 개씩 같은 주사위에 각각 다른 주사위
                int temp = 0;
                for(Integer v : dice.keySet()) {
                	//dice의 키값, 즉 제공된 주사위 눈을 전부 v에 저장
                    if(dice.get(v) != 2) {
                    //v는 키. 키값을 집어넣었을 때 나온 value값이 2가 아니라면
                    //즉,해당 눈이 값이 다른 주사위 중 하나라면
                        if(temp == 0) {
                        //이건 가장 처음의 반복임. 두 번째 반복부터는 else문 실행
                            temp = v;
                        } else {
                            temp *= v;
                            //값이 다른 주사위 중 하나가 temp에 저장되고
                            //나머지 하나를 그 temp에 곱해주는 코드
                            //서로 다른 주사위눈을 곱한 결과물이 temp가 된다
                        }
                    }
                }
                result = temp;
                break;
            case 4: // 모두 다른 주사위
                int temp2 = 7;
                for(Integer v : dice.keySet()) {
                    temp2 = temp2 > v ? v : temp2;
                    //반복문을 통해 최소값을 찾는 코드
                    //temp2는 주사위 최대값을 넘어간 수인 7로 설정해둔다
                    //첫 번째 루프에서는 무조건 v값이 temp2에 저장되게 됨
                    //그 후부터는 새로운 눈의 값이 temp2보다 작은 경우에만 저장
                    //temp2가 v보다 작다면 기존값을 그대로 유지
                    //이를 마지막 key까지 반복해주면 최소값을 찾아낼 수 있음
                }
                result = temp2;
                break;
        }

        return result;
    }
	
	public static void main(String[] args) {
		solution(4, 6, 2, 1);
	}
}

//정렬을 이용한 방식
//class Solution {
//    public int solution(int a, int b, int c, int d) {
//
//        int[] dice = { a, b, c, d };
//        Arrays.sort(dice);
//		  dice를 오름차순 정렬
//
//        int ans = 0;
//
//        if (dice[0] == dice[3]) {
//		  첫 수와 끝 수가 같을 때. 즉, 모두 같은 수일 때
//            ans = 1111 * dice[3];
//			  전부 같기에 뭘 곱해줘도 상관 없다
//        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
//		  첫 수와 세 번째 혹은 둘째 수와 네 번째가 같을 때. 즉, 세 수가 같을 때
//            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
//			  두 번째 자리의 수는 두 경우 모두에 같은 숫자 중 하나가 된다. 
//			  dice[0] + dice[3] - dice[1]은 혼자만 다른 수를 찾아내는 코드
//			  첫번째 수가 다른 수든, 마지막 수가 다른 수든 상관 없음
//			  반드시 같은 수 중 하나인 dice[1]을 빼주기 때문에, 다른 수만이 남게 됨
//			  마지막은 pow함수를 통해 제곱을 수행
//        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
//		  0번과 1번이 같고, 2번과 3번이 같다면. 오름차순 정렬이기에 이외의 가능성은 X
//            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
//			  절대값 함수 대신 dice[3] - dice[0] 사용. 오름차순이기에 늘 옳다
//		  아래부터는 이외의 경우, 즉 두 수가 같고 두 수가 다를 때
//        } else if (dice[0] == dice[1]) {
//            ans = dice[2] * dice[3];
//        } else if (dice[1] == dice[2]) {
//            ans = dice[0] * dice[3];
//        } else if (dice[2] == dice[3]) {
//            ans = dice[0] * dice[1];
//        } else {
//		  나머지는 모두가 다른 경우밖에 없음. 최소값은 가장 첫 수. 오름차순이기에
//            ans = dice[0];
//        }
//
//        return ans;
//    }
//}
