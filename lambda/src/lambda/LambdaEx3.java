package lambda;

public class LambdaEx3 {

	public static void main(String[] args) {
		// Lambda2 인터페이스를 사용하고 싶다면?
		// 1) 구현 클래스 작성 - ex) 클래스명 Implements Lambda2
		// 2) 익명 구현 클래스 작성
		Lambda3 lambda = (x) -> System.out.println(x);	
		lambda.method(150);
		
		lambda = (x) -> {
			int i = 10;
			System.out.println(i * x);
		};
		lambda.method(100);
	}

}
