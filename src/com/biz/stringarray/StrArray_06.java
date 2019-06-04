package com.biz.stringarray;

public class StrArray_06 {

	public static void main(String[] args) {
				
		String strName = "홍길동 이몽룡 성춘향 임꺽정";
		String[] strNames = strName.split(" ");
		for(int i = 0; i < strNames.length; i++) {
			System.out.println(i + "번째 :" +  strNames[i]);
		}
	}

}
