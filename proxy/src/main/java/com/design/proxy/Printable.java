package main.java.com.design.proxy;

/**
 * proxy -- 代理类和目标定义方法接口
 *
 * @author :yunpeng.wang
 */
public interface Printable {

    void setPrinterName(String name);

    String getPrinterName();

    void print(String string);

}
