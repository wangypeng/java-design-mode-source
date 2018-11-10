package com.design.chain;

/**
 * client
 *
 * @author yunpeng.wang
 * @since 10 十一月 2018
 */
public class Client {

    public static void main(String[] args) {
        Handler oddHandler = new OddHandler("odd");
        Handler sizeHandler = new SizeHandler("size");

        sizeHandler.setNext(oddHandler);

        HandlerEntry handlerEntry = new HandlerEntry();
        handlerEntry.setNumber(80);
        sizeHandler.excute(handlerEntry);
    }

}
