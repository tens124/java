package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 
//숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 리턴
public class ReturnMakeArray1 {
	
	public static void main(String[] args) {
		solution(5, 555);
	}

	public static int[] solution(int l, int r) {
        List<Integer> nList = new ArrayList<Integer>();
        List<String> mList = new ArrayList<String>();
        List<String> midList = new ArrayList<String>();
        List<Integer> fList = new ArrayList<Integer>();
        
        //정수 l과 r 사이의 모든 수를 저장하는 배열 생성 후
        //그 배열의 내용을 모두 String형으로 변경
        //그 후 contain()메소드를 통해 '0' 과 '5'를 전부 가진 문자열만 수집
        //이렇게 생성된 또 다른 배열의 내용물을 전부 int로 변환
        //마지막으로 오름차순 메소드를 사용하면 끝
        
        for(int i =l;i<=r;i++) {
        	if(i%5 ==0) {
        	//0과 5로만 이루어진 수라면 5의 배수일 수밖에 없음
        		nList.add(i);
        	}
        }
        //5의 배수만이 담긴 리스트 nList 완성
        
        for(int i = 0;i<nList.size();i++) {
        	mList.add(Integer.toString(nList.get(i)));
        	//nList의 내용을 전부 String형으로 변경 후 mList에 저장
        	if(mList.get(i).contains("5")|| mList.get(i).contains("0")) {
        		midList.add(mList.get(i));
        	}
        	//5 혹은 0을 포함하고 있는 문자열만 midList에 저장
        }
        
        //마지막으론 5와 0 이외의 문자를 포함한 문자열을 전부 걸러줘야 하는데...
        for(int i = 0;i<=9;i++) {
        	if(i%5!=0) {//i가 1,2,3,4,6,7,8,9일 때
        		
        	}
        }
        
        for(String mid : midList) {
        	System.out.println(mid);
        	
        	if(mid.contains("1")||mid.contains("2")||mid.contains("3")||
        		mid.contains("4")||mid.contains("6")||mid.contains("7")||
        		mid.contains("8")||mid.contains("9")) {
        		
        	}else {
        		fList.add(Integer.parseInt(mid));
        	}
//        	for(int i = 0;i<=9;i++) {
//            	if(i%5!=0) {//i가 1,2,3,4,6,7,8,9일 때
//            		if(mid.contains(Integer.toString(i))) {
//            		//mid가 1,2,3,4,6,7,8,9를 포함한다면
//            		//아무것도 안해야 함
//            			break;
//            		}else {
//            			fList.add(Integer.parseInt(mid));
//            		}
//            	}
//            }
        }
        System.out.println(fList);
        
//        for(int i = 0;i<midList.size();i++) {
//        	fList.add(Integer.parseInt(midList.get(i)));
//        }
        
        int[] nothing= {-1};
        int[] answer = new int[fList.size()];
        for(int i =0;i<fList.size();i++) {
        	answer[i]=fList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer.length == 0?nothing:answer;
    }
}
