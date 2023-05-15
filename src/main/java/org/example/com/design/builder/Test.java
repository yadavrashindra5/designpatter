package org.example.com.design.builder;

public class Test {
    public static void main(String[] args) {
        Phone phone=new PhoneBuilder().setOs("window").setBattery(6).getPhone();
        System.out.println(phone);
    }
}
