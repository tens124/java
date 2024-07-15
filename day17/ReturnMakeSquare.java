package day17;

import java.util.Arrays;

//arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 
//열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 후 리턴
public class ReturnMakeSquare {

	public int[][] solution(int[][] arr) {

		int row = arr.length; // 행의 길이
		int column = 0; // 열의 길이
		for (int i = 0; i < row; i++) {
			if (arr[i].length > column) {
				column = arr[i].length;
			}
		}

		if (column > row) {
			row = column;
		} else if (row > column) {
			column = row;
		}

		int[][] answer = new int[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				answer[i][j] = arr[i][j];
			}
		}

		return answer;
	}
}
