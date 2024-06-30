package com.harish;

import com.harish.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Alien obj= (Alien) context.getBean("alien");
        //System.out.println(obj.getAge());

        //obj.code();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean(Desktop.class);
dt.compile();
        Desktop dt1 = context.getBean(Desktop.class);
        dt.compile();
    }
}
