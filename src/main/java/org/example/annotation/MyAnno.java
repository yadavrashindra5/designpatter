package org.example.annotation;

/*
* annotaion is metadata
* annotation is of 3 types
* marker Annotations:These are the annotations inside which no variables are declared or defined.
* single-value Annotations: These are the annotations inside which only a single variable is declared or defined.
*Multi-value Annotations: These are the annotations inside which multiple variables of multiple types can be declared and defined.
*
* */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    int myValue() default 0;
    String name() default "Rashindra";
    String city() default "Janakpur";
}
