package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	Performer performer = (Performer) context.getBean("duke");
    	performer.perform();
    	Performer poett = (Performer) context.getBean("poeticDuke");
    	poett.perform();
    	Performer playHank2 = (Performer) context.getBean("hank2");
    	playHank2.perform();
    }
}
