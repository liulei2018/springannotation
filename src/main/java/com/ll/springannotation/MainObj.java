package com.ll.springannotation;

import com.ll.springannotation.bean.Person;
import com.ll.springannotation.conf.MainConf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainObj {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConf.class);
        Person p = applicationContext.getBean(Person.class);
        System.out.println(p);
        for (String name : applicationContext.getBeanDefinitionNames())
            System.out.println(name);

        System.out.println(applicationContext.getBeanDefinitionCount());
    }
}
