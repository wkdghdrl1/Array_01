package com.biz.intarray;

public class IntArray_01 {

	public static void main(String[] args) {
		
		int intKor_01 = 90;
		int intKor_02 = 80;		
		int intKor_03 = 70;
		int intKor_04 = 77;
		int intKor_05 = 99;
		int intKor_06 = 64;
		int intKor_07 = 33;
		
		int intSum = 0;
		
		intSum = intKor_01 + intKor_02 + intKor_03 + intKor_04 + intKor_05 + intKor_06 + intKor_07;
		
		System.out.println("국어점수 총점: " +  intSum);
		
		float fAvg = 0;
		
		fAvg = intSum / 7.0f;
		
		System.out.println("국어점수 학급평균 : " + fAvg);
		
	}

}
