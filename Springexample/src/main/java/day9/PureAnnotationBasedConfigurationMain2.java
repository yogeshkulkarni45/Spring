package day9;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day9_Fourth.FourthTest;
import day9_Fourth.another.AnotherFourthTest;


public class PureAnnotationBasedConfigurationMain2 {
		public static void main(String[] args) {
			Class<SpringAppConfig> configClass = SpringAppConfig.class;
			AnnotationConfigApplicationContext annoCtx = 
					new AnnotationConfigApplicationContext(configClass);
			
			//Loading a bean of type : FirstTest
			FirstTest firstTest = 	annoCtx.getBean(FirstTest.class);
			//Loading a bean of type : SecondTest
			SecondTest secondTest = annoCtx.getBean(SecondTest.class);
			//Loading a bean of type : ThirdTest
			Object obj = annoCtx.getBean("third");
			ThirdTest thirdTest = (ThirdTest)obj;
			//ThirdTest thirdTest=annoCtx.getBean(ThirdTest.class);
			firstTest.doTest();
			secondTest.doTest();
			thirdTest.doTest();
			
			System.out.println("-------------Accessing FourthTest bean------------------");
			FourthTest fourthTest = annoCtx.getBean(FourthTest.class);
			fourthTest.doTest();
			
			System.out.println("-------------Accessing Another FourthTest bean------------------");
			AnotherFourthTest anotherFourthTest = annoCtx.getBean(AnotherFourthTest.class);
			anotherFourthTest.doTest();
			
			
			System.out.println("-------------Accessing bean of type java.util.List------------------");
			
			obj = annoCtx.getBean("countries");
			List<String> listOfCountries = (List<String>)obj;
			listOfCountries.stream().forEach(ctr -> System.out.println(ctr));

	}

}
