package org.example.com.recursion;

import java.lang.annotation.Annotation;

public class MainExample {
    public static void main(String[] args) {
//        Demo demo=new Demo();
//        Class aClass = demo.getClass();
//        MyAnno annotation = (MyAnno)aClass.getAnnotation(MyAnno.class);
//        System.out.println(annotation.myValue());
//        System.out.println(annotation.city());
//        System.out.println(annotation.name());
        Demo demo=new Demo();
        Class aClass = demo.getClass();
        Annotation[] annotations = aClass.getAnnotations();
        MyAnno myAnno= (MyAnno) aClass.getAnnotations()[0];
        System.out.println(myAnno.myValue());
    }
}
