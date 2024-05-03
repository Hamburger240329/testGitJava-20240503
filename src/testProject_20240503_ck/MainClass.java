package testProject_20240503_ck;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld!!");  // 콘솔창으로 출력하는 print 문 형식
		System.out.println("helloworld!!");  // 콘솔창으로 출력하는 print 문 형식
		System.out.println("helloworld!!");  // 콘솔창으로 출력하는 print 문 형식
		System.out.println("helloworld!!");  // 콘솔창으로 출력하는 print 문 형식
		
		// int num = 10;  // 이렇게 해도 되고
		int numInt;		  // 이렇게 해도 됨 - 초기값 설정
		numInt = 10;

		double numDouble;  // 실수 변수 선언
		numDouble = 3.14;  // 초기값 설정
		
		String str;  // 문자열 변수 선언
		str = "Korea";  // 초기값 설정
		
		boolean logi;  // 논리형 변수 선언(true, false 만 저장 가능)
		logi = true;   // 초기값 설정
		
		char ch;  // 문자 변수 선언(1글자 저장)->''로 저장해야 함
		ch = 'A';
		
		char ch2 = 66;  // 정수를 char 변수에 저장하면 해당 정수가 가리키는 아스키 코드 문자가 저장 - 아스키코드 65가 A, 66이 B 
		System.out.println(ch2);
		
		// 파이썬 : (int)numDouble - > 정수로 형변환
		int dint = (int)numDouble; // 3.14를 형변환 - > 3으로 출력됨
		System.out.println(dint);
		
		double idou = (double)numInt;
		System.out.println(idou);
		
		String strInt = "1000";
		
		// 파이썬 : (int)strInt -> 문자열 숫자 -> 정수로 형변환
		// int strSample = (int)strInt; // java에서는 임시적 형변환으로 문자열을 숫자(정수,실수)로 변환 불가함
		
		// Wrapper 클래스를 사용하여 문자열 -> 정수(실수) 형변환 해야함 - Wrapprt 감싸다 라는 뜻
		// 내장된 패키지 중에 java.lang 패키지를 사용함 - 기본중에 기본 라이브러리라서 별도로 클래스 이름을 기재하지 않아도 된다. 
		int strSample = Integer.parseInt(strInt);  // 문자열 "1000" -> 정수 1000 으로 변환
		System.out.println(strSample);
		
		String strDouble = "3.14";
		double strSample2 = Double.parseDouble(strDouble);  // 문자열 "3.14" -> 실수 3.14로 변환
		System.out.println(strSample2);
		
		// 정수(실수)를 문자열로 변환
		// 파이썬 : (str)1000 -> 문자열로 취급
		
		int num1 = 157;
		String numStr1 = String.valueOf(num1);  // 문자열 -> 정수로 변환
		
		System.out.println("문자열로 변환된 값: " + numStr1);  // 파이썬의 f스트링이 없기때문에 이렇게 작성하면 됨 
		
		System.out.printf("정수값 출력 : %d", num1);  // 오래된 프로그래머 또는 C 언어에서는 이렇게 사용함

		
	}
}

