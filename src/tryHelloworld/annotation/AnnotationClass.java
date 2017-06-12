package tryHelloworld.annotation;

import java.util.RandomAccess;

/**
 * tryHelloworld.annotation
 * ㄴ AnnotationClass.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */

public class AnnotationClass implements RandomAccess{
	int count = 0;
	@Count100
	public void hello(){
		System.out.println("Hello " + ++count);
	}
}
