package com.telusko.SpringDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	
    //	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
    	ApplicationContext factory= new ClassPathXmlApplicationContext("Spring.xml");
    	 
//      Alien obj1 =(Alien) factory.getBean("alien");
//      obj1.code();
//      obj1.Age=15;
//      System.out.println(obj1.Age);
//      Alien obj2 =(Alien) factory.getBean("alien");
//      obj2.code();
    	Alien obj1 =(Alien) factory.getBean("alien");
          obj1.code();
      System.out.println(obj1.getAge());
    }
}
