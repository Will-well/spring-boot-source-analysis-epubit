package com.linkedbear.springboot.demo.main;

import com.linkedbear.springboot.demo.bean.Person;
import com.linkedbear.springboot.demo.config.ImportConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author weir
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        Person person = (Person) context.getBean("person");
        Person person1 = (Person) context.getBean(Person.class.getName());
        log.warn("person : {}", person);
        log.warn("person1 : {}", person1);
    }
}
