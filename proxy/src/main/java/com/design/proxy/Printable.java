package com.design.proxy;

/**
 * proxy -- 代理类和目标定义方法接口
 *
 * @author :peng
 */
public interface Printable {

    /**
     * set printer name
     *
     * @param name
     */
    void setPrinterName(String name);

    /**
     * get printer name
     *
     * @return
     */
    String getPrinterName();

    /**
     * print
     *
     * @param string
     */
    void print(String string);

}
