package com.design.single;

public class Singleton7 {

    private Singleton7() {
    }

    private static class SingletonHolder {
        private static Singleton7 instance = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonHolder.instance;
    }
}