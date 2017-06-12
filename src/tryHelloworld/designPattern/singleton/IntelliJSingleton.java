package tryHelloworld.designPattern.singleton;

/**
 * tryHelloworld.designPattern.singleton
 * ㄴ IntelliJSingleton.java
 *
 * 클래스가 하나의 인스턴스만을 갖기 위해 생성자를 private로 선언!!!
 * 이렇게 함으로써 클래스 안에서 해당 클래스에 대한 인스턴스 작업을 할 수 있게됨
 *
 * 클래스의 인스턴스를 하나만 가지기 위해 static변수로 생성
 *
 * IntelliJ에서 자동으로 만들어 주는 Singleton 파일 포맷
 * 클래스가 로드 되는 시점에 singleton클래스의 인스턴스를 생성할지 여부를 선택
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */

public class IntelliJSingleton {
	private static IntelliJSingleton ourInstance = new IntelliJSingleton();

	public static IntelliJSingleton getInstance() {
		return ourInstance;
	}

	private IntelliJSingleton() {

	}

	public void print(){
		System.out.println("SingleTone!!!!!!!!!");
	}
}
