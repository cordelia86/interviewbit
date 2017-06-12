package tryHelloworld.annotation;

import java.lang.reflect.Method;

/**
 * tryHelloworld.annotation
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class AnnotaionMain {
	public static void main(String[] args) {

		Integer.parseInt("1234");
		AnnotationClass annotationClass = new AnnotationClass();

		try {
			Class<?>[] clazz = annotationClass.getClass().getInterfaces();
			System.out.println(clazz[0].getName());
			Method method = annotationClass.getClass().getDeclaredMethod("hello");

			if(method.isAnnotationPresent(Count100.class)){
				for (int i = 0; i < 100; i++) {
					annotationClass.hello();
				}
			} else {
				annotationClass.hello();
			}

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
