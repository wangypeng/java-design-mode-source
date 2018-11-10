package com.design.proxy;

/**
 * proxy -- client
 *
 * @author :peng
 */
public class Client {

    public static void main(String[] args) {

        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName());
        p.print("Hello world");
    }
}
