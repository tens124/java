package day7;

//"banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"
//is_prefix가 my_string의 접두사라면 1을, 아니면 0을 리턴
public class RerutnCheckprefixOrNot {

	public int solution(String my_string, String is_prefix) {
        int answer = my_string.startsWith(is_prefix)?1:0;
        //startsWith : 접두사 확인 메소드
        return answer;
    }
}
