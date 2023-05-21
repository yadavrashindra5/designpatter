package org.example.com.recursion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* Annotations are a form of metadata that provide information about the program but are not a part of the program itself. An Annotation does not affect the operation of the code they Annotate.
 *
 * Now let us go through different types of java annotations present that are listed as follows:
 *
*Predefined annotations.: @Deprecated, @Override, @SuppressWarnings, @SafeVarargs, @FunctionalInterface.
Meta-annotations: @Retention, @Documented, @Target, @Inherited, @Repeatable.
Custom annotations: These are defined by the user. (We will be learning to create custom annotations in this module).
*
*
*
*
*  Now proceeding there are three forms of annotations that can be defined in java as follows:
*
*
    Marker Annotations: These are the annotations inside which no variables are declared or defined.
    Single-value Annotations: These are the annotations inside which only a single variable is declared or defined.
    Multi-value Annotations: These are the annotations inside which multiple variables of multiple types can be declared and defined.

*
*
* */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnno{
    int myValue() default 0;
    String name() default "Durgesh";
    String city() default "DELHI";
}