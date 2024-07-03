package day12;

//오늘 해야 할 일이 담긴 문자열 배열 todo_list 
//각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished
//todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 리턴
public class ReturnToDoList {

	public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for(boolean finish:finished)
        	if(!finish)	size++;
		String[] answer = new String[size];
		
		for(int i =0,j=0;i<todo_list.length;i++) {
			if(!finished[i])
				answer[j++]=todo_list[i];
		}
		
        return answer;
        
//      또 다른 풀이법
//        String str = "";
//        for(int i=0; i<finished.length; i++){
//            str = finished[i]==false ? str+todo_list[i]+"," : str;
//        	  거짓일 경우엔 할 일과 ,을 이어붙여 길게 한 줄을 만든 후 split을 통해 배열을 생성
//        }
//
//        return str.split(",");
        
    }
}
