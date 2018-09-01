package com.ll.springannotation.conf;

import com.ll.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ll.springannotation")
public class MainConf {
    @Bean(value="dd")
    public Person person(){
        return new Person("lisi",20);

    }
}
