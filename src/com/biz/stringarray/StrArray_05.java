package com.biz.stringarray;

public class StrArray_05 {

	public static void main(String[] args) {
			
		String strName = "홍길동 이몽룡 성춘향";
		String[] strNames = strName.split("");
		
		// 문자열.spilit("") 메소드는
		// 문자열(변수)에 단긴 문자열들을
		// 한글자씩 분해해서 
		// 문자열 개수만큼의 배열을 생성해준다.
		for(int i = 0; i < strNames.length; i++) {
			System.out.print(strNames[i]);
		}
		
		int intNum = 10;
		int intNum2 = intNum + 10;
		
		
		
		
	}
	
	// makeString() 메소드의 형태만 만들고
	// 내부의 구체적인 기능은 작성하지 않은 상태
	// 이런 코드를 프로토타입이라고 한다.
	// 보통 프로토타입을 만들었을 때
	// void형이 아닌 경우에
	// return 문을 만드어야 하는데
	// return 형이 숫자이면 return 0이라고 작성하고
	// 그외 형일 겨우에는 return null이라고 작성
	public static String[] makeString(String strNations) {
		return null;
	}

}
