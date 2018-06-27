package com.viseo.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        HelloSpring obj = (HelloSpring) context.getBean("helloBean");
        obj.sayHello();
    }
}
