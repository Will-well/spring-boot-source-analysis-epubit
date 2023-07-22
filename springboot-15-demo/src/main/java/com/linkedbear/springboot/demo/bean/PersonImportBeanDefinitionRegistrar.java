package com.linkedbear.springboot.demo.bean;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author weir
 */
public class PersonImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.add("name", "张三");
        propertyValues.add("age", "18");
        beanDefinition.setPropertyValues(propertyValues);
        registry.registerBeanDefinition("person", beanDefinition);
        ImportBeanDefinitionRegistrar.super.registerBeanDefinitions(importingClassMetadata, registry);
    }
}
