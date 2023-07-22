package com.linkedbear.springboot.demo.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author weir
 */
@Data
@Slf4j
public class Person {
    private String name;
    private String age;

    public Person() {
      log.info("Person Constructor done");
    }
}
