package day14;

//꼬리 문자열 : 문자열들이 담긴 리스트가 주어졌을 때 모든 문자열들을 순서대로 합친 문자열 
//이때 특정 문자열을 포함한 문자열은 제외시키려 함
//문자열 리스트 str_list와 제외하려는 문자열 ex
//최종적으로 만들어진 꼬리문자열을 리턴
public class ReturnConcatenatedString {

	public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(int i = 0;i<str_list.length;i++) {
        	if(!str_list[i].contains(ex)) {
        		answer+=str_list[i];
        	}
        }
        
        //향상된 for문 사용
        //for (String str : str_list) {
        //    if (!str.contains(ex))
        //        answer += str;
        //}
        return answer;
    }
}
