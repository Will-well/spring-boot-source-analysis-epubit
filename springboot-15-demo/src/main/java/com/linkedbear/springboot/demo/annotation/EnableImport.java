package com.linkedbear.springboot.demo.annotation;

import com.linkedbear.springboot.demo.bean.PerosnImportSelector;
import com.linkedbear.springboot.demo.bean.PersonImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author weir
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({PerosnImportSelector.class, PersonImportBeanDefinitionRegistrar.class})
public @interface EnableImport {
}
