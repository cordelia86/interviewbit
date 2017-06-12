package tryHelloworld.designPattern.singleton;

/**
 * tryHelloworld.designPattern.singleton
 * ㄴ SingletonMain.java
 *
 * 결과
 * SingleTone!!!!!!!!!
 * tryHelloworld.designPattern.singleton.IntelliJSingleton@61bbe9ba
 * SingleTone!!!!!!!!!
 * tryHelloworld.designPattern.singleton.IntelliJSingleton@61bbe9ba
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class SingletonMain {

	public static void main(String[] args) {
		IntelliJSingleton intelliJSingleton = IntelliJSingleton.getInstance();
		intelliJSingleton.print();
		System.out.println(intelliJSingleton);


		IntelliJSingleton intelliJSingleton2 = IntelliJSingleton.getInstance();
		intelliJSingleton.print();
		System.out.println(intelliJSingleton2);

	}
}
