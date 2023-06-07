package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
/*
 * java.util.function 에서 제공하는 함수형 
 * 1) Supplier<T> T get) : 리턴값은 있고, 매개변수 없음
 * 2) Consumer<T> void accept(T t) : 값을 받아서 사용하는 형태
 * 3) Predicate<T> boolean test(T t) : 값을 받아서 조건식에 대한 결과 반환
 * 4) Function<T, R> R apply(T t) : 값을 받아서 결과를 반환
 * 
 * 매개 변수가 2개인 함수형 인터페이스
 * BiConsumer<T, U> , BiPredicate<T, U>...
 */
public class LambdaEx6 {

	public static void main(String[] args) {
		
		// 문자열을 리턴하는 기능 구현 1
		Supplier<String> s = () -> "눈을감자";
		System.out.println(s.get());
		// 문자열을 입력받아서 문자열의 길이가 0인지 판단 기능 구현
		Predicate<String> p = (str) -> str.length() == 0;
		System.out.println(p.test("문자열 길이"));
		// 문자열을 입력받아서 출력하는 기능 구현
		Consumer<String> c = i -> System.out.println(i);
		c.accept("감자");
		// 문자열을 입력받아서 점수로 리턴 기능 구현
		Function<String, Integer> f = str -> Integer.parseInt(str)+24;
		System.out.println(f.apply("561"));
	}
}
