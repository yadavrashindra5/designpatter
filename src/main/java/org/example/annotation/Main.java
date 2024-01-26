package org.example.annotation;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Demo demo=new Demo();
        Class c = demo.getClass();
        System.out.println(c.getName());
        MyAnno annotation = (MyAnno)c.getAnnotation(MyAnno.class);
        System.out.println(annotation.city());
        System.out.println(annotation.myValue());
        System.out.println(annotation.name());
    }
}
