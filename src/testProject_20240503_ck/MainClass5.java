package testProject_20240503_ck;

public class MainClass5 {

	public static void main(String[] args) {

		// 외우는 방법 : else if 괄호 조건 중괄호
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("수!");
		//elif 조건:
		} else if(score >= 80) {
			System.out.println("우!");
		} else if(score >= 70) {
			System.out.println("미!");
		} else if(score >= 60) {
			System.out.println("양!");
		} else {  // 마지막은 else 로 처리하는게 맞는 문법
			System.out.println("가!");
		}

		
		// switch 문도 조건문임
		
		// 변수의 값이 분리되어 있는 경우( ex : 1,2,3 중에 1개, A,B,C 중에 하나) 
		// switch 문이 if 문 보다 간결하게 코드 작성 가능
		// switch 문은 위에서 아래로 내려오는 형식
		
//		int favor = 2;
		String favor = "B";
		
		switch(favor) {
			case "A":
				System.out.println("안녕!");
				break;
			case "B":
				System.out.println("감사!");
				System.out.println("고맙습니다!");
				break;
			case "C":
				System.out.println("hi!");
				break;
			default:
				System.out.println("잘가요!");
		}

		// 연속형 변수를 처리할 때 사용 : if 문
		// 연속되지 않은 고정된 변수를 처리 할 때 사용 : switch 문		
	}

}

