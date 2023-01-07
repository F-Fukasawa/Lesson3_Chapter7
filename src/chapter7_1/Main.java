package chapter7_1;

public class Main {
	public static void main(String[] args) {
		A b = new A() {
			// {}の中にメソッドを追加します。

			// クラスAのhelloメソッドをオーバーライドします。
			@Override
			public String hello() {
				// "Hello B!"を返します。
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
	}
}
