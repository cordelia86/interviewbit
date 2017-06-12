package tryHelloworld.designPattern.singleton;

/**
 * tryHelloworld.thread
 * ㄴ EnumSingleton.java
 *
 * enum은 thread safe함
 * enum을 통해서 싱글톤을 구현할 수 있으며 멀티 쓰레드 환경에서도 오직 하나의 인스턴스만 갖을 수 있다.
 *
 * 그리고 deserialization과 reflection에 대해서도 보호가 방어가 되며 enum singleton들은 lazily 초기화 된다
 * enum을 사용한 singleton 이 가장 좋은 구현 방식이다.
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public enum EnumSingleton {
	SINGLETON;
	private int number = 0;

	public void method(String str){
		System.out.println("Thread[" +str + "] : " + ++number);
	}

}
