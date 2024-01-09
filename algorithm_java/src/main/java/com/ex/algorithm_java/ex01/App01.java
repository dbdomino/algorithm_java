package com.ex.algorithm_java.ex01;
// 프로그래머스 이진반복
public class App01 {
	private int countZeros(String s) { // 문자열의 0의 개수 세기
		int zeros = 0;
		for (char c : s.toCharArray()) {
			if (c == '0' ) zeros++;
		}
		return zeros;
	}

	public int[] solution(String s) {
		int loop = 0;
		int removeCount = 0;

		while (!s.equals("1")) {
			int zeros = countZeros(s); //0의 개수
			loop += 1;
			removeCount += zeros;

			int ones = s.length() - zeros;
//			s = Integer.toBinaryString(ones);// 같은소리
			s = Integer.toString(ones,2);

		}
		return new int[] {loop, removeCount};

	}

}
