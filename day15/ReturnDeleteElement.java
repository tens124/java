package day15;

//arr의 원소 중 delete_list의 원소를 모두 삭제하고 
//남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return
public class ReturnDeleteElement {

	public int[] solution(int[] arr, int[] delete_list) {

		for (int delete : delete_list) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == delete) {
					arr[i] = 0;
				}
			}
		}

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				count++;
		}

		int[] answer = new int[count];
		
		for(int i = 0,j=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				answer[j++]=arr[i];
			}
		}
		
		//전부 생략하고 arr을 어레이리스트에 담아 remove메소드를 사용하는 것도 가능
		//for(int n: delete_list) {
        //list.remove(n);
		//	}

		return answer;
	}
}
