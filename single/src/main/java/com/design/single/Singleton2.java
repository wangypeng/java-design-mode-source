package com.design.single;

public class Singleton2 {

    private static Singleton2 instance = null;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}