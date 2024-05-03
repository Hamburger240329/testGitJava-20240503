package testProject_20240503_ck;

public class ForTest {

	public static void main(String[] args) {
		// 1 ~ 10 까지 출력하는 for문을 작성해보자
		
		// 파이썬 : for i range(1, 11):
		// 파이썬 : 	print(i)
		
		// 증가식
//		for(int i=1;i<=100;i++) { // 초;조;증 -> 초기값;조건식;증가식
//			System.out.println(i);
//		}
//			
//		// 증감식
//		for(int i=100;i>=1;i--) {
//			System.out.println(i);
//			
//		}
//		
		
//		for(int i=100;i<=100;i=i+2) {
//			System.out.println(i);
//			
//		}	
//		
//		// 1 ~ 1000 사이의 수중 짝수만 출력하는 for 문을 작성하시오
//		for(int i=0;i<=1000;i=i+2) {
//			System.out.println(i);
//			
//		}	

		// 1 ~ 100까지의 합을 출력하는 for 문을 작성하시오. 5050
		
		int sum = 0;

		for(int i=1;i<=100;i++) {
			sum = sum + i; 
		}
		System.out.println(sum);

	}

}

