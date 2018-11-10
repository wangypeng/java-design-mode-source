package com.design.proxy;

/**
 * proxy -- 实体类
 *
 * @author :peng
 */
public class Printer implements Printable {
    /**
     * name
     */
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("===" + name + "===");
        System.out.println(string);
    }
}
