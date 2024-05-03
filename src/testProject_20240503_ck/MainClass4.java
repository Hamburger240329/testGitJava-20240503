package testProject_20240503_ck;

public class MainClass4 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		// 증감연산자는 ++ 가 앞인지 뒤인지 중요함. 하지만 최종 연산 값은 동일함
		int result1 = ++x;  // x = x + 1
		int result2 = y++;  // y = y + 1
						
		System.out.println(result1);  // 11
		System.out.println(x);	//11 // x 본인도 증가하게 됨 || 이유는 x = x + 1 이므로  
		System.out.println(result2);  // 20
		System.out.println(y);  // 21
				
		int a = 1;
		int b = 1;
		
		int result3 = ++a + 10;
		System.out.println(result3);  // 12
		System.out.println(a);  // 2
		
		int result4 = b++ + 10;
		System.out.println(result4);  // 11
		System.out.println(b);  // 2		
		// ++ 이 앞에 있으면 우선순위가 올라감, 뒤에있으면 우선순위가 낮아져서 마지막에 계산됨
		
		int sum = 0;
		int i = 10;
		
		sum = sum + i;
		
		sum += i; // sum = sum +1;
		
		sum = sum * i;
		
		sum *= i;  // sum = sum * i;
		
		
	}
	
}