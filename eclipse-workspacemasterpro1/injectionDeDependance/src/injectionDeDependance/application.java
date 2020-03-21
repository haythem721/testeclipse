package injectionDeDependance;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("donner le nom de la classe:");
        Coach c=(Coach)Class.forName("injectionDeDependance."+sc.next()).newInstance();
       
        System.out.println(c);
        Intermediaire i=new Intermediaire();
        i.setC(c);
        i.affiche();*/
		/*ClassPathXmlApplicationContext contexte=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Coach c=contexte.getBean("foot",Coach.class);
		System.out.println(c.getCoach());
		contexte.close();*/
		
		AnnotationConfigApplicationContext contexte=new AnnotationConfigApplicationContext(SportConfig.class);
		Coach c=contexte.getBean("foot",Coach.class);
		System.out.println(c.getCoach());
		contexte.close();
	}

}
