package lambda;

public class LambdaEx4 {

	public static void main(String[] args) {
		// Lambda2 인터페이스를 사용하고 싶다면?
		// 1) 구현 클래스 작성 - ex) 클래스명 Implements Lambda2
		// 2) 익명 구현 클래스 작성
		Lambda4 lambda = (x, y) -> x > y ? x : y;
		System.out.println(lambda.max(150, 100));	
		
		Lambda5 lambda5 = (x, y) -> x > y ? y : x;
		System.out.println(lambda5.min(150, 100));	
/*		
		lambda = (x) -> {
			int i = 10;
			System.out.println(i * x);
		};
		lambda.method(100);
*/
	}

}
