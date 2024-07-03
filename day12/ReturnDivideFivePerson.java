package day12;

//최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names
//앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 리턴
//마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함
public class ReturnDivideFivePerson {

	//인덱스번호는 0부터 시작하게 됨
	//01234/56789/1011121314/1516171819/2021222324/2526272829
	//names의 최대길이는 30이니, 이렇게 최대 6그룹이 생겨나게 됨
	//여기서 각 그룹의 맨 앞은 0/5/10/15/20/25. 모두 5의 배수이다
	public static String[] solution(String[] names) {
		int size = names.length%5==0?names.length/5:names.length/5+1;
		//배열의 크기를 잘 설정하는 것이 중요. 다섯명일 땐 배열의 사이즈가 1이 되어야 함
        String[] answer = new String[size];
        for(int i =0,j=0;i<names.length;i+=5,j++) {
        		answer[j]=names[i];
        		System.out.println(answer[j]);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] answer = {};
		solution(answer);
	}
}
