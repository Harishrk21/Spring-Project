package com.harish;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");//creating object with xml conifg
    Alien obj =(Alien) context.getBean("alien");//calling the object
    obj.code();

   // obj.setAge(); //we can also set age here or we can go to xml to set the age
       // System.out.println(obj.getAge());

    }
}
