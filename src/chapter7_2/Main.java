package chapter7_2;

public class Main {
	public static void main(String[] args) {
		B b = new B() {
			//helloメソッドを実装
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
	}
}
