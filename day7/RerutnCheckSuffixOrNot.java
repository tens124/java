package day7;

//어떤 문자열에 대한 접미사는 특정 인덱스부터 시작하는 문자열을 의미
//"banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"
//is_suffix가 my_string의 접미사라면 1을, 아니면 0을 리턴
public class RerutnCheckSuffixOrNot {
	public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] check = new String[my_string.length()];
        
        for(int i = 0;i<my_string.length();i++) {
        	check[i]=my_string.substring(i);
        	answer = check[i].equals(is_suffix)?1:0;
        	if(answer ==1) break;
        }
        
//        for(int i=0;i<my_string.length();i++){
//            if(is_suffix.equals(my_string.substring(i))){
//                answer = 1;
//                break;
//            }
//        }
//        배열을 따로 만들지 않고, i만큼 잘라낸 문자열을 계속 비교하며 일치하는 값이 나오면 정지
        
        return answer;
        
        //return myString.endsWith(isSuffix) ? 1 : 0;
        //endsWith(String) 메소드
        //해당 문자열이 주어진 문자열로 끝나는지 확인하는 메소드
        //접미사인지 판단에 가장 적합한 메소드임. 끝난다면 true,아니면 false 리턴
    }

}
